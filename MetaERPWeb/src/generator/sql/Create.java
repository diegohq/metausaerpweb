package generator.sql;

import metaerp.*;
import utils.*;
import utils.metaerp.*;

public class Create
{
  protected static String nl;
  public static synchronized Create create(String lineSeparator)
  {
    nl = lineSeparator;
    Create result = new Create();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "CREATE TABLE IF NOT EXISTS ";
  protected final String TEXT_3 = " (" + NL + "" + NL + "id INT(11) NOT NULL AUTO_INCREMENT," + NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = " ";
  protected final String TEXT_7 = " NULL";
  protected final String TEXT_8 = "," + NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = "_id INT(11)," + NL + "KEY ";
  protected final String TEXT_13 = "_id (";
  protected final String TEXT_14 = "_id)," + NL;
  protected final String TEXT_15 = NL;
  protected final String TEXT_16 = NL;
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = "_id INT(11)," + NL + "KEY ";
  protected final String TEXT_19 = "_id (";
  protected final String TEXT_20 = "_id)," + NL;
  protected final String TEXT_21 = NL + NL + "active TINYINT(1) DEFAULT 1," + NL + "" + NL + "PRIMARY KEY(id)" + NL + "" + NL + ") ENGINE=InnoDB  DEFAULT CHARSET=utf8;" + NL;
  protected final String TEXT_22 = NL + NL + "ALTER TABLE ";
  protected final String TEXT_23 = NL + "ADD CONSTRAINT `";
  protected final String TEXT_24 = "_";
  protected final String TEXT_25 = "_id_ibfk` FOREIGN KEY (";
  protected final String TEXT_26 = "_id) REFERENCES ";
  protected final String TEXT_27 = " (id);" + NL;
  protected final String TEXT_28 = NL;
  protected final String TEXT_29 = NL + NL + "ALTER TABLE ";
  protected final String TEXT_30 = NL + "ADD CONSTRAINT `";
  protected final String TEXT_31 = "_id_ibfk` FOREIGN KEY (";
  protected final String TEXT_32 = "_id) REFERENCES ";
  protected final String TEXT_33 = " (id);" + NL;
  protected final String TEXT_34 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     
EntityHelper entityHelper = (EntityHelper) argument;

Entity entity = entityHelper.getEntity();
EntityRelated entityRelated = entity instanceof EntityRelated ? (EntityRelated) entity : null;

Entity parent = entityHelper.getParent();


    stringBuffer.append(TEXT_2);
    stringBuffer.append( StringHelper.name2dbName(entity.getName()) );
    stringBuffer.append(TEXT_3);
     for(Attribute attribute : entity.getAttributes()) { 
String defaultValue = InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).getDefaultValue();

if(defaultValue != "") {
	defaultValue = " DEFAULT '" + defaultValue + "'";
}


    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    stringBuffer.append( StringHelper.name2db(attribute.getName()) );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( InputDefaultTypesHelper.getByInputDefaultTypesValue(attribute.getType().getValue()).getSqlType() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( defaultValue );
    stringBuffer.append(TEXT_8);
     } 
    stringBuffer.append(TEXT_9);
     if(entityRelated != null) { 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    stringBuffer.append( StringHelper.name2db(entityRelated.getRelated().getName()) );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( StringHelper.name2db(entityRelated.getRelated().getName()) );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( StringHelper.name2db(entityRelated.getRelated().getName()) );
    stringBuffer.append(TEXT_14);
     } 
    stringBuffer.append(TEXT_15);
     if(parent != null) { 
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    stringBuffer.append( StringHelper.name2db(parent.getName()) );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( StringHelper.name2db(parent.getName()) );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( StringHelper.name2db(parent.getName()) );
    stringBuffer.append(TEXT_20);
     } 
    stringBuffer.append(TEXT_21);
     if(entityRelated != null) { 
    stringBuffer.append(TEXT_22);
    stringBuffer.append( StringHelper.name2dbName(entity.getName()) );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( StringHelper.name2db(entityRelated.getRelated().getName()) );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( StringHelper.name2db(entity.getName()) );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( StringHelper.name2db(entityRelated.getRelated().getName()) );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( StringHelper.name2dbName(entityRelated.getRelated().getName()) );
    stringBuffer.append(TEXT_27);
     } 
    stringBuffer.append(TEXT_28);
     if(parent != null) { 
    stringBuffer.append(TEXT_29);
    stringBuffer.append( StringHelper.name2dbName(entity.getName()) );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( StringHelper.name2db(parent.getName()) );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( StringHelper.name2db(parent.getName()) );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( StringHelper.name2dbName(parent.getName()) );
    stringBuffer.append(TEXT_33);
     } 
    stringBuffer.append(TEXT_34);
    return stringBuffer.toString();
  }
}
