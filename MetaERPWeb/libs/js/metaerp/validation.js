var originalInputBorder = new Array();
var originalLabelColor = new Array();

$(document).ready(function() {

    // Check for validation
    $('input,textarea').each(function(index, el) {

        if (($(el).attr('data-metaerp-validation') !== undefined && $(el).attr('data-metaerp-validation') !== '') || ($(el).attr('data-metaerp-required') !== undefined && $(el).attr('data-metaerp-required') === 'true')) {
            bindValidation(el);
        }

    });
    
    // Validation on submit
    $('form').each(function(index, el) {
        
        if($(el).attr('data-metaerp-validate') !== undefined && $(el).attr('data-metaerp-validate') === 'true') {
            $(el).submit(function(e) {
                if(!validateForm(el)) {
                    return false;
                }
            });
        }
        
        
    });

});

function validateForm(el) {
    
    var valid = true;

    $(el).find('input').each(function(index, el) {
        if(!checkValidation(el)) {
            valid = false;
            return false;
        }
    });
    
    return valid;

}

function bindValidation(el) {

    $(el).blur(function() {
        
        setTimeout(function() {
            clearErrors(el);
            checkValidation(el);
        }, 200);
        
    });

}

function checkValidation(el) {
    
    var regex = $(el).attr('data-metaerp-validation');
    regex = regex !== undefined && !validate($(el).val(), regex);
    
    var isRequired = $(el).attr('data-metaerp-required') !== undefined && $(el).attr('data-metaerp-required') === 'true';
        
    if(isRequired && $(el).val() === '') {
        insertError(el, 'This field is required');
        return false;
    } else if(regex) {
        insertError(el, 'The informed value is not valid');
        return false;
    }
    
    if($(el).attr('data-metaerp-valid') !== undefined && $(el).attr('data-metaerp-valid') === 'false') {
        return false;
    }
    
    return true;

}

function validate(text, regex) {
    var regExp = new RegExp('(' + regex + ')');
    return regExp.test(text);
}

function clearErrors(el) {
    var id = $(el).attr('id');
    $(el).css('border', originalInputBorder[id]);
    $('#metaerpError-' + id).remove();
    $('label[for=' + id + ']').css('color', originalLabelColor[id]);
}

function insertError(el, msg) {
    
    clearErrors(el);
    
    var id = $(el).attr('id');
    originalInputBorder[id] = $(el).css('border');
    $(el).css('border', '1px solid #960000');
    originalLabelColor[id] = $('label[for=' + id + ']').css('color');
    $('label[for=' + id + ']').css('color', '#960000');

    $(el).after('<div class="errorDiv" id="metaerpError-' + id + '" style="color: #960000">'+ msg +'</div>');
    
}
