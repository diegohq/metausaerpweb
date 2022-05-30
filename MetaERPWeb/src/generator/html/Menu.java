package generator.html;

import metaerp.*;
import java.util.List;
import utils.*;

public class Menu
{
  protected static String nl;
  public static synchronized Menu create(String lineSeparator)
  {
    nl = lineSeparator;
    Menu result = new Menu();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "<ul{UL_MENU_EXTRA}>" + NL + "" + NL + "\t";
  protected final String TEXT_3 = NL + "\t<li{LI_MENU_EXTRA}><a href=\"/";
  protected final String TEXT_4 = "/\">{BEFORE_MENU_ITEM}";
  protected final String TEXT_5 = "{AFTER_MENU_ITEM}</a></li>" + NL + "\t";
  protected final String TEXT_6 = NL + NL + "</ul>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     List<Entity> entities = (List<Entity>) argument; 
    stringBuffer.append(TEXT_2);
     for(Entity entity : entities) { 
    stringBuffer.append(TEXT_3);
    stringBuffer.append( StringHelper.name2systemPlural(entity.getName()).toLowerCase() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( entity.getName() );
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
