package generator.php;

import metaerp.*;
import utils.*;
import utils.metaerp.*;

public class Model
{
  protected static String nl;
  public static synchronized Model create(String lineSeparator)
  {
    nl = lineSeparator;
    Model result = new Model();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "<?php" + NL + "" + NL + "class ";
  protected final String TEXT_3 = " extends AppModel {" + NL + "" + NL + "\t";
  protected final String TEXT_4 = NL + "\t" + NL + "\tpublic $hasMany = array(" + NL + "\t\t";
  protected final String TEXT_5 = NL + "\t\t'";
  protected final String TEXT_6 = "'," + NL + "\t\t";
  protected final String TEXT_7 = NL + "\t);" + NL + "\t" + NL + "\t";
  protected final String TEXT_8 = NL + "\t\t" + NL + "\t";
  protected final String TEXT_9 = NL + "\t" + NL + "\tpublic $belongsTo = array(" + NL + "\t\t";
  protected final String TEXT_10 = NL + "\t\t'";
  protected final String TEXT_11 = "'," + NL + "\t\t";
  protected final String TEXT_12 = NL + "\t\t";
  protected final String TEXT_13 = NL + "\t\t'";
  protected final String TEXT_14 = "'," + NL + "\t\t";
  protected final String TEXT_15 = NL + "\t);" + NL + "\t" + NL + "\t";
  protected final String TEXT_16 = NL + "\t" + NL + "" + NL + "\tfunction beforeFind($queryData) {" + NL + "" + NL + "        $queryData['conditions']['";
  protected final String TEXT_17 = ".active'] = 1;" + NL + "" + NL + "        return $queryData;" + NL + "        " + NL + "    }" + NL + "" + NL + "\tfunction beforeSave($options = array()) {" + NL + "\t" + NL + "\t\tApp::import('Vendor', 'NumberHelper');" + NL + "\t" + NL + "\t\t";
  protected final String TEXT_18 = NL + "\t\t";
  protected final String TEXT_19 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_20 = NL + "\t\t" + NL + "\t\tif(isset($this->data['";
  protected final String TEXT_21 = "']['";
  protected final String TEXT_22 = "'])) {" + NL + "\t\t\t$this->data['";
  protected final String TEXT_23 = "']['";
  protected final String TEXT_24 = "'] = NumberHelper::numberTreatment($this->data['";
  protected final String TEXT_25 = "']['";
  protected final String TEXT_26 = "']);" + NL + "\t\t}" + NL + "\t\t " + NL + "\t\t";
  protected final String TEXT_27 = NL + "\t\t";
  protected final String TEXT_28 = NL + "\t" + NL + "\t" + NL + "\t\treturn true;" + NL + "\t" + NL + "\t}" + NL + "\t" + NL + "\tfunction checkRule($id, $attribute, $rule, $value) {" + NL + "\t" + NL + "\t\t$data = $this->findById($id);" + NL + "\t\t" + NL + "\t\tif(!isset($data['";
  protected final String TEXT_29 = "'][$attribute])) {" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tApp::import('Vendor', 'NumberHelper');" + NL + "\t\t" + NL + "\t\tif($rule == 'bigger') {" + NL + "\t\t\treturn $data['";
  protected final String TEXT_30 = "'][$attribute] < NumberHelper::numberTreatment($value);" + NL + "\t\t} else if($rule == 'biggerOrEqual') {" + NL + "\t\t\treturn $data['";
  protected final String TEXT_31 = "'][$attribute] <= NumberHelper::numberTreatment($value);" + NL + "\t\t} else if($rule == 'equal') {" + NL + "\t\t\treturn $data['";
  protected final String TEXT_32 = "'][$attribute] == NumberHelper::numberTreatment($value);" + NL + "\t\t} else if($rule == 'smaller') {" + NL + "\t\t\treturn $data['";
  protected final String TEXT_33 = "'][$attribute] > NumberHelper::numberTreatment($value);" + NL + "\t\t} else if($rule == 'smallerOrEqual') {" + NL + "\t\t\treturn $data['";
  protected final String TEXT_34 = "'][$attribute] >= NumberHelper::numberTreatment($value);" + NL + "\t\t} else if($rule == 'noRule') {" + NL + "\t\t\treturn true;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\treturn false;" + NL + "\t" + NL + "\t}" + NL + "\t" + NL + "\tfunction executeBehavior($id, $attribute, $behavior, $value) {" + NL + "\t\t" + NL + "\t\t$data = $this->findById($id);" + NL + "\t\t" + NL + "\t\tif(!isset($data['";
  protected final String TEXT_35 = "'][$attribute])) {" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tApp::import('Vendor', 'NumberHelper');" + NL + "\t\t" + NL + "\t\tif($behavior == 'add') {" + NL + "\t\t\t$data['";
  protected final String TEXT_36 = "'][$attribute] += NumberHelper::numberTreatment($value);" + NL + "\t\t} else if($behavior == 'subtract') {" + NL + "\t\t\t$data['";
  protected final String TEXT_37 = "'][$attribute] -= NumberHelper::numberTreatment($value);" + NL + "\t\t} else if($behavior == 'doNothing') {" + NL + "\t\t\treturn true;" + NL + "\t\t}" + NL + "\t\t\t\t" + NL + "\t\treturn $this->save($data);" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "}" + NL + "" + NL + "?>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     

EntityHelper entityHelper = (EntityHelper) argument;
Entity entity = entityHelper.getEntity();
Entity parent = entityHelper.getParent();
EntityRelated entityRelated = entity instanceof EntityRelated ? (EntityRelated) entity : null;

String entityName = StringHelper.name2system(entity.getName());


    stringBuffer.append(TEXT_2);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_3);
     if(entity.getSubEntity().size() > 0) { 
    stringBuffer.append(TEXT_4);
     for(Entity subEntity : entity.getSubEntity()) { 
    stringBuffer.append(TEXT_5);
    stringBuffer.append( StringHelper.name2system(subEntity.getName()) );
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
     } 
    stringBuffer.append(TEXT_8);
     if(entityRelated != null || parent != null) { 
    stringBuffer.append(TEXT_9);
     if(entityRelated != null) { 
    stringBuffer.append(TEXT_10);
    stringBuffer.append( StringHelper.name2system(entityRelated.getRelated().getName()) );
    stringBuffer.append(TEXT_11);
     } 
    stringBuffer.append(TEXT_12);
     if(parent != null) { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append( StringHelper.name2system(parent.getName()) );
    stringBuffer.append(TEXT_14);
     } 
    stringBuffer.append(TEXT_15);
     } 
    stringBuffer.append(TEXT_16);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_17);
     for(Attribute attribute : entity.getAttributes()) { 
    stringBuffer.append(TEXT_18);
     if(attribute.getType() == InputDefaultTypes.DECIMAL || attribute.getType() == InputDefaultTypes.INT) { 
    stringBuffer.append(TEXT_19);
     String attributeName = StringHelper.name2db(attribute.getName()); 
    stringBuffer.append(TEXT_20);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( attributeName );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( attributeName );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( attributeName );
    stringBuffer.append(TEXT_26);
     } 
    stringBuffer.append(TEXT_27);
     } 
    stringBuffer.append(TEXT_28);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( entityName );
    stringBuffer.append(TEXT_37);
    return stringBuffer.toString();
  }
}
