package generator.html;

import metaerp.*;
import utils.*;
import java.util.List;

public class SubEntity
{
  protected static String nl;
  public static synchronized SubEntity create(String lineSeparator)
  {
    nl = lineSeparator;
    SubEntity result = new SubEntity();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + NL + "\t{OPEN_BOX}" + NL + "" + NL + "\t";
  protected final String TEXT_3 = NL + "\t\t" + NL + "\t\t\t{BEFORE_LABEL_TAG}" + NL + "\t\t\t<label for=\"";
  protected final String TEXT_4 = "\"{LABEL_TAG_EXTRA}>" + NL + "\t\t\t\t";
  protected final String TEXT_5 = "*";
  protected final String TEXT_6 = NL + "\t\t\t</label>" + NL + "\t\t\t{AFTER_LABEL_TAG}" + NL + "\t\t\t{BEFORE_INPUT_TAG}" + NL + "\t\t\t";
  protected final String TEXT_7 = NL + "\t\t" + NL + "" + NL + "\t\t\t<";
  protected final String TEXT_8 = " name=\"";
  protected final String TEXT_9 = "\" id=\"";
  protected final String TEXT_10 = "\" ";
  protected final String TEXT_11 = " /";
  protected final String TEXT_12 = ">";
  protected final String TEXT_13 = "</";
  protected final String TEXT_14 = ">";
  protected final String TEXT_15 = NL + "\t\t\t" + NL + "\t\t\t{AFTER_INPUT_TAG}" + NL + "\t\t\t" + NL + "\t\t\t{BEFORE_HELP_TEXT}" + NL + "\t\t\t";
  protected final String TEXT_16 = NL + "\t\t\t{AFTER_HELP_TEXT}" + NL + "\t\t\t" + NL + "\t\t";
  protected final String TEXT_17 = NL + "\t";
  protected final String TEXT_18 = NL + "\t" + NL + "\t{CLOSE_BOX}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    

Entity entity = (Entity) argument;
EntityRelated entityRelated = null;

if(entity instanceof EntityRelated) {
entityRelated = (EntityRelated) entity;
}

List<Attribute>	attributes = entity.getAttributes();
String entityName = StringHelper.name2system(entity.getName());


    stringBuffer.append(TEXT_2);
     for(Attribute attribute : attributes) {
	
		if(attribute.isCreateble()) {
		
		String attributeName = StringHelper.name2db(attribute.getName());
		String attributeTag = InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).getHtmlTag();
		String attributeType = InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).getHtmlType();
		boolean attributeTagClose = InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).isHtmlTagClose();
		
    stringBuffer.append(TEXT_3);
    stringBuffer.append( attributeName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( attribute.getLabel() );
     if(attribute.isRequired()) { 
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
    
			boolean mainAttributeRelated = false;
			String attributeRelatedString = "";
			if(attribute instanceof AttributeRelated) { 
				AttributeRelated attributeRelated = (AttributeRelated) attribute;
				mainAttributeRelated = attributeRelated.isMain();
				
				attributeRelatedString += "data-metaerp-entity=\"" + StringHelper.name2systemPlural(entityRelated.getRelated().getName()) + "\" data-metaerp-class=\"\" data-metaerp-attribute=\"" + StringHelper.name2db(attributeRelated.getRelated().getName()) + "\" data-metaerp-main=\"" + attributeRelated.isMain() + "\" data-metaerp-autocomplete=\"" + attributeRelated.isAutocomplete() + "\"";
				
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
			if(entityRelated == null) {
				attributeInputName = "data[" + entityName + "][" + attributeName + "]";
			} else {
				attributeInputName = "data[" + entityName + "][0][" + attributeName + "]";
			}
			
			
    stringBuffer.append(TEXT_7);
    stringBuffer.append( attributeTag );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( attributeInputName );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( attributeName );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( inputAttributes );
    stringBuffer.append( attributeRelatedString );
     if (!attributeTagClose) { 
    stringBuffer.append(TEXT_11);
     } 
    stringBuffer.append(TEXT_12);
     if (attributeTagClose) { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append( attributeTag );
    stringBuffer.append(TEXT_14);
     } 
    stringBuffer.append(TEXT_15);
    stringBuffer.append( InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).getHelpText() );
    stringBuffer.append(TEXT_16);
     } 
    stringBuffer.append(TEXT_17);
     } 
    stringBuffer.append(TEXT_18);
    return stringBuffer.toString();
  }
}
