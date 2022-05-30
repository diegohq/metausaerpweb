$(document).ready(function() {

    disableModel();
    start('');

});

function start(context) {

    $(context + 'input,' + context + 'textarea').each(function(index, el) {

        // Checks for masks
        if ($(el).attr('data-metaerp-mask') != undefined) {
            switch ($(el).attr('data-metaerp-mask')) {
                case 'int':
                    createIntMask(el);
                    break;
                case 'decimal':
                    createDecimalMask(el);
                    break;
                case 'date':
                    createDateMask(el);
                    break;
                case 'datetime':
                    createDatetimeMask(el);
                    break;
            }
        }

        // Checks for rules
        if ($(el).attr('data-metaerp-rule') != undefined) {
            checkRule(el);
        }

    });

    $(context + 'a').each(function(index, el) {

        if ($(el).attr('data-metaerp-subentity-add') != undefined) {
            addSubEntityButton(el);
        }

    });

    // Select2
    startSelect2(context);

}

/*
 * SELECT2
 */

function startSelect2(context) {

    $(context + 'input[data-metaerp-main=true]').each(function(i, select2Main) {

        var mainId = $(select2Main).attr('id');
        var entity = $(select2Main).attr('data-metaerp-entity');
        var searchField = $(select2Main).attr('data-metaerp-attribute');

        var searchClass = $(select2Main).attr('data-metaerp-class');
        var returnFields = new Array();

        if(searchClass !== '{CURRENT_CLASS}') {
            
            $('input[data-metaerp-class=' + searchClass + ']').not($(select2Main)).each(function(j, select2Class) {
            returnFields[j] = $(select2Class).attr('data-metaerp-attribute');
        });

            instanciateSelect2(mainId, entity, searchField);
            bindActionSelect2(mainId, entity, searchClass, returnFields);
            
        }


    });

}

function instanciateSelect2(id, entity, searchField) {

    var select2Value = $("#" + id).val();

    $("#" + id).select2({
        placeholder: "Start typing",
        minimumInputLength: 2,
        quietMillis: 750,
        ajax: {
            url: '/' + entity + '/listSelect2',
            dataType: 'json',
            data: function(term) {
                return {
                    term: term,
                    searchField: searchField
                };
            },
            results: function(data) {
                return {results: data};
            }
        },
        initSelection: function(element, callback) {

            if (select2Value !== undefined && select2Value !== 'undefined' && select2Value !== '') {
//                callback({id: select2Value, text: 'Loading...'});
                
                $.post('/' + entity + '/listSelect2', {
                        id: select2Value,
                        searchField: searchField
                }, 
                function(data) {
                    var obj = $.parseJSON($.trim(data));
                    callback({id: obj[0].id, text: obj[0].text});
                });
                
                
            }
        }
    });

}

function bindActionSelect2(id, entity, select2Class, returnFields) {

    $("#" + id).change(function() {

        $.getJSON('/' + entity + '/detailJson',
                {
                    id: $('#' + id).val()
                }
        ).done(function(json) {

            var key;

            for (key in returnFields) {
                var field = returnFields[key];
                if (json[field] !== undefined) {
                    $('input[data-metaerp-class=' + select2Class + '][data-metaerp-attribute=' + field + '][data-metaerp-autocomplete=true]').val(json[field]);
                }
            }

        });

    });

}

/*
 * RULES
 */

function checkRule(el) {

    var select2Class = $(el).attr('data-metaerp-class');

    if (select2Class !== '{CURRENT_CLASS}') {
        $(el).blur(function() {
            
            setTimeout(function() {
                checkRuleFunction(el, select2Class);
            }, 150);
            
        });
        $('input[data-metaerp-class=' + select2Class + '][data-metaerp-main=true]').change(function() {
            
            setTimeout(function() {
                checkRuleFunction(el, select2Class);
            }, 150);
            
        });
    }


}

function checkRuleFunction(el, select2Class) {

    var entity = $(el).attr('data-metaerp-entity');
    var rule = $(el).attr('data-metaerp-rule');

    if ($(el).val() !== '') {

        $.getJSON('/' + entity + '/checkRule',
                {
                    id: $('input[data-metaerp-class=' + select2Class + '][data-metaerp-main=true]').val(),
                    value: $(el).val(),
                    attribute: $(el).attr('data-metaerp-attribute'),
                    rule: rule
                }
        ).done(function(json) {

            if (!json['status']) {


                if (rule === 'smallerOrEqual') {
                    insertError(el, 'This field must be smaller or equal than ' + json['value']);
                } else if (rule === 'smaller') {
                    insertError(el, 'This field must be smaller than ' + json['value']);
                } else if (rule === 'equal') {
                    insertError(el, 'This field must be equal than ' + json['value']);
                } else if (rule === 'bigger') {
                    insertError(el, 'This field must be bigger than ' + json['value']);
                } else if (rule === 'biggerOrEqual') {
                    insertError(el, 'This field must be bigger or equal than ' + json['value']);
                } else {
                    insertError(el, 'General error');
                }

                $(el).attr('data-metaerp-valid', false);

            } else {
                $(el).attr('data-metaerp-valid', true);
                clearErrors(el);
            }

        });

    }



}

/*
 * MASKS
 */

function createIntMask(el) {
    $(el).maskMoney({
        'precision': 0
    });
}

function createDecimalMask(el) {
    $(el).maskMoney();
}

function createDateMask(el) {
    $(el).mask('99/99/9999');
    $(el).datepicker();
}

function createDatetimeMask(el) {
    $(el).mask('99/99/9999 99:99:99');
}

function confirmDelete(url) {

    $("#confirm-delete").dialog({
        resizable: false,
        height: 180,
        modal: true,
        buttons: {
            "Yes": function() {
                $(this).dialog("close");
                window.location = url;
            },
            "No": function() {
                $(this).dialog("close");
            }
        }
    });


}

/*
 * SUBENTITY
 */

function disableModel() {

    $('div[data-metaerp-subentity-container] :input').attr("disabled", true);

}

function addSubEntityButton(el) {

    $(el).click(function() {

        addSubEntity($(el).attr('data-metaerp-subentity-add'));

    });

}

function addSubEntity(subEntity) {

    var clone = $('div[data-metaerp-subentity-container=' + subEntity + ']');
    var cloneHtml = clone.html();

    var cloneCount = $('div[data-metaerp-clone^=' + subEntity + ']').length;

    cloneHtml = replaceAll('{CURRENT_CLASS}', cloneCount, cloneHtml);

    cloneHtml = '<div data-metaerp-clone="' + subEntity + cloneCount + '">' + cloneHtml + '</div>';

    $('a[data-metaerp-subentity-add=' + subEntity + ']').after(cloneHtml);

    $('div[data-metaerp-clone=' + subEntity + cloneCount + '] :input').attr("disabled", false);
    start('div[data-metaerp-clone=' + subEntity + cloneCount + '] ');

    return false;

}

function removeSubEntity(subEntity) {

    $('div[data-metaerp-clone=' + subEntity + ']').hide();
    $('div[data-metaerp-clone=' + subEntity + '] input, div[data-metaerp-clone=' + subEntity + '] select').attr('disabled', true);

    return false;

}

/*
 * ESSENCIALS
 */

function replaceAll(find, replace, str) {
    return str.replace(new RegExp(find, 'g'), replace);
}