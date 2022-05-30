package generator.html;

import metaerp.*;
import utils.*;

public class Index
{
  protected static String nl;
  public static synchronized Index create(String lineSeparator)
  {
    nl = lineSeparator;
    Index result = new Index();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + NL + "{BEFORE_ALL_CONTENT_PAGES}" + NL + "" + NL + "<?php echo $this->Session->flash(); ?>" + NL + "" + NL + "{BEFORE_TITLE}";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "{AFTER_TITLE}" + NL + "" + NL + "{BEFORE_THIS_CONTENT_PAGE}" + NL + "" + NL + "<a href=\"/";
  protected final String TEXT_6 = "/create\"{CREATE_BUTTON_EXTRA}>Add new ";
  protected final String TEXT_7 = "</a>" + NL + "" + NL + "{BEFORE_LISTING_TABLE}" + NL + "<table{LISTING_TABLE_EXTRA}>" + NL + "" + NL + "\t<thead>" + NL + "\t\t<tr>" + NL + "\t\t\t";
  protected final String TEXT_8 = NL + "\t\t\t";
  protected final String TEXT_9 = NL + "\t\t\t<th>";
  protected final String TEXT_10 = "</th>" + NL + "\t\t\t";
  protected final String TEXT_11 = NL + "\t\t\t";
  protected final String TEXT_12 = NL + "\t\t\t<th>Options</th>" + NL + "\t\t</tr>" + NL + "\t</thead>" + NL + "\t" + NL + "\t<tbody>" + NL + "\t\t<?php foreach ($rows as $row) { ?>" + NL + "        <tr>" + NL + "        \t";
  protected final String TEXT_13 = NL + "\t\t\t";
  protected final String TEXT_14 = NL + "\t\t\t<td><?= $row['";
  protected final String TEXT_15 = "']['";
  protected final String TEXT_16 = "'] ?></td>" + NL + "\t\t\t";
  protected final String TEXT_17 = NL + "\t\t\t";
  protected final String TEXT_18 = "\t\t\t" + NL + "            <td>" + NL + "            \t<a href=\"/";
  protected final String TEXT_19 = "/edit/<?= $row['";
  protected final String TEXT_20 = "']['id'] ?>\">Edit</a>" + NL + "            \t | " + NL + "            \t<a href=\"#\" onclick=\"confirmDelete('/";
  protected final String TEXT_21 = "/delete/<?= $row['";
  protected final String TEXT_22 = "']['id'] ?>'); return false;\">Delete</a> " + NL + "            </td>" + NL + "\t\t</tr>" + NL + "\t\t<?php } ?>" + NL + "\t</tbody>" + NL + "" + NL + "</table>" + NL + "{AFTER_LISTING_TABLE}" + NL + "" + NL + "{AFTER_THIS_CONTENT_PAGE}" + NL + "" + NL + "<div style=\"display: none\" id=\"confirm-delete\" title=\"Please, confirm\">" + NL + "\tAre you sure you want to delete this item?" + NL + "</div>" + NL + "" + NL + "{AFTER_ALL_CONTENT_PAGES}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Entity entity = (Entity) argument; 
    stringBuffer.append(TEXT_2);
     String modelName = StringHelper.name2system(entity.getName()); 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    stringBuffer.append( entity.getName() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( StringHelper.name2systemPlural(entity.getName()).toLowerCase() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( entity.getName().toLowerCase() );
    stringBuffer.append(TEXT_7);
     for(Attribute attribute : entity.getAttributes()) { 
    stringBuffer.append(TEXT_8);
     if(attribute.isListable()) { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append( attribute.getLabel() );
    stringBuffer.append(TEXT_10);
     } 
    stringBuffer.append(TEXT_11);
     } 
    stringBuffer.append(TEXT_12);
     for(Attribute attribute : entity.getAttributes()) { 
    stringBuffer.append(TEXT_13);
     if(attribute.isListable()) { 
    stringBuffer.append(TEXT_14);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( StringHelper.name2db(attribute.getName()) );
    stringBuffer.append(TEXT_16);
     } 
    stringBuffer.append(TEXT_17);
     } 
    stringBuffer.append(TEXT_18);
    stringBuffer.append( StringHelper.name2systemPlural(entity.getName()).toLowerCase() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( StringHelper.name2systemPlural(entity.getName()).toLowerCase() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_22);
    return stringBuffer.toString();
  }
}
