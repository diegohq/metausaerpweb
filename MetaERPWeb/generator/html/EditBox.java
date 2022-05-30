package generator.html;

import metaerp.*;
import utils.*;
import java.util.List;

public class EditBox
{
  protected static String nl;
  public static synchronized EditBox create(String lineSeparator)
  {
    nl = lineSeparator;
    EditBox result = new EditBox();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "<div style=\"display: none;\" data-metaerp-subentity-container=\"";
  protected final String TEXT_3 = "\">" + NL;
  protected final String TEXT_4 = NL + NL + "<?php foreach($data['";
  protected final String TEXT_5 = "'] as $key => $entityEdit) { ?>" + NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + "<div data-metaerp-clone=\"";
  protected final String TEXT_8 = "\">";
  protected final String TEXT_9 = NL + "\t" + NL;
  protected final String TEXT_10 = NL + "<input type=\"hidden\" name=\"";
  protected final String TEXT_11 = "[id]\" value=\"<?php echo ";
  protected final String TEXT_12 = "['id']; ?>\" />";
  protected final String TEXT_13 = NL + NL + "\t{OPEN_BOX}" + NL + "\t" + NL + "\t";
  protected final String TEXT_14 = NL + "\t\t" + NL + "\t\t\t{BEFORE_LABEL_TAG}" + NL + "\t\t\t<label for=\"";
  protected final String TEXT_15 = "\"{LABEL_TAG_EXTRA}>" + NL + "\t\t\t\t";
  protected final String TEXT_16 = "*";
  protected final String TEXT_17 = NL + "\t\t\t</label>" + NL + "\t\t\t{AFTER_LABEL_TAG}" + NL + "\t\t\t{BEFORE_INPUT_TAG}" + NL + "\t\t\t";
  protected final String TEXT_18 = NL + "\t\t" + NL + "" + NL + "\t\t\t<";
  protected final String TEXT_19 = " name=\"";
  protected final String TEXT_20 = "\" id=\"";
  protected final String TEXT_21 = "\"";
  protected final String TEXT_22 = " value=\"<?php echo ";
  protected final String TEXT_23 = "; ?>\"";
  protected final String TEXT_24 = " ";
  protected final String TEXT_25 = " /";
  protected final String TEXT_26 = ">";
  protected final String TEXT_27 = "<?php echo ";
  protected final String TEXT_28 = "; ?></";
  protected final String TEXT_29 = ">";
  protected final String TEXT_30 = NL + "\t\t\t" + NL + "\t\t\t{AFTER_INPUT_TAG}" + NL + "\t\t\t" + NL + "\t\t\t{BEFORE_HELP_TEXT}" + NL + "\t\t\t";
  protected final String TEXT_31 = NL + "\t\t\t{AFTER_HELP_TEXT}" + NL + "\t\t\t" + NL + "\t\t";
  protected final String TEXT_32 = NL + "\t";
  protected final String TEXT_33 = NL + NL + "\t<a href=\"#\" onclick=\"removeSubEntity('";
  protected final String TEXT_34 = "'); return false;\">Remove</a>" + NL + "" + NL + "\t";
  protected final String TEXT_35 = NL + "\t" + NL + "\t<input type=\"hidden\" name=\"";
  protected final String TEXT_36 = "[active]\" value=\"1\" />" + NL + "\t" + NL + "\t{CLOSE_BOX}" + NL + "\t";
  protected final String TEXT_37 = NL + "</div>";
  protected final String TEXT_38 = NL + "\t";
  protected final String TEXT_39 = NL + NL + "</div>" + NL;
  protected final String TEXT_40 = NL + NL + "<?php } ?>" + NL + "\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    

SubEntityN subEntityN = null;
Entity entity = null;

String entityRelatedClass = "0";

if(argument instanceof SubEntityN) {
	subEntityN = (SubEntityN) argument;
	entity = subEntityN.getSubEntity();
	
	if(subEntityN.isModel()) {
		entityRelatedClass = "{CURRENT_CLASS}";
	} else {
		entityRelatedClass = subEntityN.getCurrentN();
	}
	
} else {
	entity = (Entity) argument;
}

EntityRelated entityRelated = null;

if(entity instanceof EntityRelated) {
entityRelated = (EntityRelated) entity;
}

List<Attribute>	attributes = entity.getAttributes();
String entityName = StringHelper.name2system(entity.getName());

String attributeInputNamePrefix = "";
String attributeValuePrefix = "\'\'";

if(entityRelated == null) {
	attributeInputNamePrefix = "data[" + entityName + "]";
	attributeValuePrefix = "$data['" + entityName + "']";
} else {
	attributeInputNamePrefix = "data[" + entityName + "][" + entityRelatedClass + "]";
	if(entityRelatedClass != "{CURRENT_CLASS}") {
		attributeValuePrefix = "$data['" + entityName + "'][" + entityRelatedClass + "]";
	}
}

if(subEntityN != null && subEntityN.isModel()) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append( StringHelper.name2systemPlural(entityRelated.getRelated().getName()) );
    stringBuffer.append(TEXT_3);
    

} else if(subEntityN != null && subEntityN.isRuntimeEdit()) { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_5);
     

entityRelatedClass = "<?php echo $key; ?>";

attributeInputNamePrefix = "data[" + entityName + "][<?php echo $key; ?>]";
attributeValuePrefix = "$data['" + entityName + "'][$key]";

} 
    stringBuffer.append(TEXT_6);
     if(subEntityN != null && subEntityN.isRuntimeEdit()) { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append( StringHelper.name2systemPlural(entityRelated.getRelated().getName()) );
    stringBuffer.append( entityRelatedClass );
    stringBuffer.append(TEXT_8);
     } 
    stringBuffer.append(TEXT_9);
     if(attributeInputNamePrefix != "" && !(subEntityN != null && subEntityN.isModel())) { 
    stringBuffer.append(TEXT_10);
    stringBuffer.append( attributeInputNamePrefix );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( attributeValuePrefix );
    stringBuffer.append(TEXT_12);
     } 
    stringBuffer.append(TEXT_13);
     for(Attribute attribute : attributes) {
		
		if(attribute.isEditable()) {
		
		String attributeName = StringHelper.name2db(attribute.getName());
		String attributeTag = InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).getHtmlTag();
		String attributeType = InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).getHtmlType();
		boolean attributeTagClose = InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).isHtmlTagClose();
		
    stringBuffer.append(TEXT_14);
    stringBuffer.append( attributeName );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( attribute.getLabel() );
     if(attribute.isRequired()) { 
    stringBuffer.append(TEXT_16);
     } 
    stringBuffer.append(TEXT_17);
    
			boolean mainAttributeRelated = false;
			String attributeRelatedString = "";
			if(attribute instanceof AttributeRelated) { 
				AttributeRelated attributeRelated = (AttributeRelated) attribute;
				mainAttributeRelated = attributeRelated.isMain();
				
				attributeRelatedString += "data-metaerp-entity=\"" + StringHelper.name2systemPlural(entityRelated.getRelated().getName()) + "\" data-metaerp-class=\"" + entityRelatedClass + "\" data-metaerp-attribute=\"" + StringHelper.name2db(attributeRelated.getRelated().getName()) + "\" data-metaerp-main=\"" + attributeRelated.isMain() + "\" data-metaerp-autocomplete=\"" + attributeRelated.isAutocomplete() + "\"";
				
				if(attributeRelated.getRule() != RuleTypes.NO_RULE) {
					attributeRelatedString += " data-metaerp-rule=\""+ attributeRelated.getRule().getLiteral() +"\"";
				}
				
			}
			
			String inputAttributes = "";
			
			if(!mainAttributeRelated) {
				inputAttributes = "type=\"" + attributeType + "\" " + InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).getExtra() + "{INPUT_TAG_EXTRA}";
				
				if(attribute.isRequired()) { 
					inputAttributes += " data-metaerp-required=\"true\"";
				}
				
			} else {
				inputAttributes = "type=\"text\"";
			}
			
			String attributeInputName = "";
			String attributeValue = "\'\'";
			attributeInputName = attributeInputNamePrefix + "[" + attributeName + "]";
			if(entityRelated == null) {
				attributeValue = attributeValuePrefix + "['" + attributeName + "']";
			} else if(entityRelatedClass != "{CURRENT_CLASS}") {
				attributeValue = attributeValuePrefix + "['" + attributeName + "']";
			}
			
			
    stringBuffer.append(TEXT_18);
    stringBuffer.append( attributeTag );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( attributeInputName );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( attributeName  + entityRelatedClass );
    stringBuffer.append(TEXT_21);
     if (!attributeTagClose) { 
    stringBuffer.append(TEXT_22);
    stringBuffer.append( attributeValue );
    stringBuffer.append(TEXT_23);
     } 
    stringBuffer.append(TEXT_24);
    stringBuffer.append( inputAttributes );
    stringBuffer.append( attributeRelatedString );
     if (!attributeTagClose) { 
    stringBuffer.append(TEXT_25);
     } 
    stringBuffer.append(TEXT_26);
     if (attributeTagClose) { 
    stringBuffer.append(TEXT_27);
    stringBuffer.append( attributeValue );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( attributeTag );
    stringBuffer.append(TEXT_29);
     } 
    stringBuffer.append(TEXT_30);
    stringBuffer.append( InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).getHelpText() );
    stringBuffer.append(TEXT_31);
     } 
    stringBuffer.append(TEXT_32);
     }
	
	if(subEntityN != null && (subEntityN.isModel() || subEntityN.isRuntimeEdit())) { 
    stringBuffer.append(TEXT_33);
    stringBuffer.append( StringHelper.name2systemPlural(entityRelated.getRelated().getName()) );
    stringBuffer.append( entityRelatedClass );
    stringBuffer.append(TEXT_34);
     } 
    stringBuffer.append(TEXT_35);
    stringBuffer.append( attributeInputNamePrefix );
    stringBuffer.append(TEXT_36);
     if(subEntityN != null && subEntityN.isRuntimeEdit()) { 
    stringBuffer.append(TEXT_37);
     } 
    stringBuffer.append(TEXT_38);
     if(subEntityN != null && subEntityN.isModel()) { 
    stringBuffer.append(TEXT_39);
     } else if(subEntityN != null && subEntityN.isRuntimeEdit()) { 
    stringBuffer.append(TEXT_40);
     } 
    return stringBuffer.toString();
  }
}
