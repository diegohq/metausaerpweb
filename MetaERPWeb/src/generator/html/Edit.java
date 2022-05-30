package generator.html;

import metaerp.*;
import utils.*;

public class Edit
{
  protected static String nl;
  public static synchronized Edit create(String lineSeparator)
  {
    nl = lineSeparator;
    Edit result = new Edit();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "{BEFORE_ALL_CONTENT_PAGES}" + NL + "" + NL + "<?php echo $this->Session->flash(); ?>" + NL + "" + NL + "{BEFORE_TITLE}";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "{AFTER_TITLE}" + NL + "" + NL + "{BEFORE_THIS_CONTENT_PAGE}" + NL;
  protected final String TEXT_5 = NL + NL + "{BEFORE_FORM_TAG}" + NL + "<form id=\"";
  protected final String TEXT_6 = "Form\"{FORM_TAG_EXTRA} data-metaerp-validate=\"true\" method=\"post\">" + NL + "" + NL + "\t";
  protected final String TEXT_7 = NL + "\t";
  protected final String TEXT_8 = NL + "\t" + NL + "\t";
  protected final String TEXT_9 = NL + "\t" + NL + "\t\t";
  protected final String TEXT_10 = NL + "\t\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_11 = NL + "\t\t\t\t<a href=\"#\" data-metaerp-subentity-add=\"";
  protected final String TEXT_12 = "\"{CREATE_BUTTON_EXTRA}>Add another ";
  protected final String TEXT_13 = "</a>" + NL + "\t\t\t";
  protected final String TEXT_14 = NL + "\t\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_15 = NL + "\t\t\t";
  protected final String TEXT_16 = NL + "\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_17 = NL + "\t\t\t";
  protected final String TEXT_18 = NL + "\t\t\t" + NL + "\t\t";
  protected final String TEXT_19 = NL + "\t\t\t\t";
  protected final String TEXT_20 = NL + "\t\t\t";
  protected final String TEXT_21 = NL + "\t\t" + NL + "\t{BEFORE_SUBMIT_TAG}" + NL + "\t<input type=\"submit\"{SUBMIT_TAG_EXTRA} />" + NL + "\t{AFTER_SUBMIT_TAG}" + NL + "\t" + NL + "</form>" + NL + "{AFTER_FORM_TAG}" + NL + "" + NL + "{AFTER_THIS_CONTENT_PAGE}" + NL + "{AFTER_ALL_CONTENT_PAGES}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Entity entity = (Entity) argument; 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append( entity.getName() );
    stringBuffer.append(TEXT_4);
     String entityName = StringHelper.name2system(entity.getName()); 
    stringBuffer.append(TEXT_5);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_6);
     EditBox editBox = new EditBox(); 
    stringBuffer.append(TEXT_7);
    stringBuffer.append( editBox.generate(entity).replaceAll("\\{BOX_TITLE\\}", "Standard Data") );
    stringBuffer.append(TEXT_8);
     for(Entity subEntity : entity.getSubEntity()) { 
    stringBuffer.append(TEXT_9);
     if(subEntity.getCardinality().equals("*")) { 
    stringBuffer.append(TEXT_10);
     if(subEntity instanceof EntityRelated) {
				EntityRelated entityRelated = (EntityRelated) subEntity; 
    stringBuffer.append(TEXT_11);
    stringBuffer.append( StringHelper.name2systemPlural(entityRelated.getRelated().getName()) );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( entityRelated.getLabel().toLowerCase() );
    stringBuffer.append(TEXT_13);
     } 
    stringBuffer.append(TEXT_14);
     SubEntityN runtimeSubEntityN = new SubEntityN(subEntity, false, "*", true); 
    stringBuffer.append(TEXT_15);
    stringBuffer.append( editBox.generate(runtimeSubEntityN).replaceAll("\\{BOX_TITLE\\}", StringHelper.name2system(subEntity.getName())) );
    stringBuffer.append(TEXT_16);
     SubEntityN subEntityN = new SubEntityN(subEntity, true, "*"); 
    stringBuffer.append(TEXT_17);
    stringBuffer.append( editBox.generate(subEntityN).replaceAll("\\{BOX_TITLE\\}", StringHelper.name2system(subEntity.getName())) );
    stringBuffer.append(TEXT_18);
     } else {
				
			int quantity;
		
			try {
				quantity = Integer.parseInt(subEntity.getCardinality());
			} catch(Exception e) {
				quantity = 1;
			}
		
			for(int i = 0 ; i < quantity ; i++) {
				SubEntityN subEntityN = new SubEntityN(subEntity, false, i + ""); 
    stringBuffer.append(TEXT_19);
    stringBuffer.append( editBox.generate(subEntityN).replaceAll("\\{BOX_TITLE\\}", StringHelper.name2system(subEntity.getName())) );
    stringBuffer.append(TEXT_20);
     }
			
		
		} 
	
	} 
    stringBuffer.append(TEXT_21);
    return stringBuffer.toString();
  }
}
