package generator.php;

import metaerp.*;
import utils.*;

public class Controller
{
  protected static String nl;
  public static synchronized Controller create(String lineSeparator)
  {
    nl = lineSeparator;
    Controller result = new Controller();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "<?php" + NL + "" + NL + "class ";
  protected final String TEXT_3 = " extends AppController {" + NL + "" + NL + "\tpublic function index() {" + NL + "\t" + NL + "\t\t$this->set('rows', $this->";
  protected final String TEXT_4 = "->find('all'));" + NL + "\t" + NL + "\t}" + NL + "" + NL + "\tpublic function create($internal = false) {" + NL + "\t" + NL + "\t\tif($this->request->is('post')) {" + NL + "\t\t" + NL + "\t\t\t// validate rules" + NL + "\t\t\t";
  protected final String TEXT_5 = NL + "\t\t\t\t\t\t$this->loadModel('";
  protected final String TEXT_6 = "');" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t$keys = array_keys($this->request->data['";
  protected final String TEXT_7 = "']);" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\tforeach($keys as $i) {" + NL + "\t\t\t\t\t\t\t$ruleCheck = $this->";
  protected final String TEXT_8 = "->checkRule($this->request->data['";
  protected final String TEXT_9 = "'][$i]['";
  protected final String TEXT_10 = "'], '";
  protected final String TEXT_11 = "', '";
  protected final String TEXT_12 = "', $this->request->data['";
  protected final String TEXT_13 = "'][$i]['";
  protected final String TEXT_14 = "']);" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\tif(!$ruleCheck) {" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\t$errorMessage = 'Rule check failed';" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\tif($internal) {" + NL + "\t\t\t\t\t\t\t\t\treturn array(" + NL + "\t\t\t\t\t\t\t\t\t\t'success' => false," + NL + "\t\t\t\t\t\t\t\t\t\t'error' => $errorMessage" + NL + "\t\t\t\t\t\t\t\t\t);" + NL + "\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\t$this->Session->setFlash($errorMessage, 'flash_custom', array('class' => 'error'));" + NL + "\t\t\t\t\t\t\t\t$this->redirect(array('action' => 'create'));" + NL + "\t\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t";
  protected final String TEXT_15 = NL + "\t\t" + NL + "\t\t\t// execute the behavior" + NL + "\t\t\t";
  protected final String TEXT_16 = NL + "\t\t\t\t\t\t$this->loadModel('";
  protected final String TEXT_17 = "');" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t$keys = array_keys($this->request->data['";
  protected final String TEXT_18 = "']);" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\tforeach($keys as $i) {" + NL + "\t\t\t\t\t\t\t$behaviorCheck = $this->";
  protected final String TEXT_19 = "->executeBehavior($this->request->data['";
  protected final String TEXT_20 = "'][$i]['";
  protected final String TEXT_21 = "'], '";
  protected final String TEXT_22 = "', '";
  protected final String TEXT_23 = "', $this->request->data['";
  protected final String TEXT_24 = "'][$i]['";
  protected final String TEXT_25 = "']);" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\tif(!$behaviorCheck) {" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\t$errorMessage = 'Relation update failed, please check your data: it may be wrong';" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\tif($internal) {" + NL + "\t\t\t\t\t\t\t\t\treturn array(" + NL + "\t\t\t\t\t\t\t\t\t\t'success' => false," + NL + "\t\t\t\t\t\t\t\t\t\t'error' => $errorMessage" + NL + "\t\t\t\t\t\t\t\t\t);" + NL + "\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t\t$this->Session->setFlash($errorMessage, 'flash_custom', array('class' => 'error'));" + NL + "\t\t\t\t\t\t\t\t$this->redirect(array('action' => 'create'));" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t";
  protected final String TEXT_26 = NL + "\t\t" + NL + "\t\t\t$this->";
  protected final String TEXT_27 = "->create();" + NL + "\t\t\t" + NL + "\t\t\tif($this->";
  protected final String TEXT_28 = "->saveAll($this->request->data)) {" + NL + "\t\t\t" + NL + "\t\t\t\tif($internal) {" + NL + "\t\t\t\t\treturn array(" + NL + "\t\t\t\t\t'success' => true" + NL + "\t\t\t\t\t);" + NL + "\t\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t\t$this->Session->setFlash('Data successfully saved', 'flash_custom', array('class' => 'success'));" + NL + "\t\t\t\t$this->redirect(array('action' => 'index'));" + NL + "\t\t\t} else {" + NL + "\t\t\t\t" + NL + "\t\t\t\t$errorMessage = 'Something happened, please try again';" + NL + "\t\t\t" + NL + "\t\t\t\tif($internal) {" + NL + "\t\t\t\t\treturn array(" + NL + "\t\t\t\t\t'success' => false," + NL + "\t\t\t\t\t'error' => $errorMessage" + NL + "\t\t\t\t\t);" + NL + "\t\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t\t$this->Session->setFlash(errorMessage, 'flash_custom', array('class' => 'error'));" + NL + "\t\t\t\t$this->redirect(array('action' => 'create'));" + NL + "\t\t\t\t" + NL + "\t\t\t}" + NL + "\t\t" + NL + "\t\t}" + NL + "\t" + NL + "\t}" + NL + "\t" + NL + "\tpublic function edit($id) {" + NL + "\t" + NL + "\t\tif($id == null) {" + NL + "            $this->Session->setFlash('No id informed', 'default', array('class' => 'error'));" + NL + "            $this->redirect(array('action' => 'index'));" + NL + "            exit();" + NL + "        }" + NL + "\t" + NL + "\t\tif($this->request->is('post')) {" + NL + "\t\t" + NL + "\t\t\tif(!$this->delete($id, true)) {" + NL + "\t\t\t\t$this->Session->setFlash('Something happen, please check if the dependencies are ok and try again', 'flash_custom', array('class' => 'success'));" + NL + "\t\t\t\t$this->redirect(array('action' => 'index'));" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t$saveReturn = $this->create(true);" + NL + "\t\t\t" + NL + "\t\t\tif($saveReturn['success']) {" + NL + "\t\t\t\t$this->Session->setFlash('Data successfully edited', 'flash_custom', array('class' => 'success'));" + NL + "\t\t\t\t$this->redirect(array('action' => 'index'));" + NL + "\t\t\t} else {" + NL + "\t\t\t\t$this->Session->setFlash($saveReturn['error'], 'flash_custom', array('class' => 'error'));" + NL + "\t\t\t\t$this->redirect(array('action' => 'create'));" + NL + "\t\t\t}" + NL + "\t\t" + NL + "\t\t} else {" + NL + "\t\t\t$this->set('data', $this->";
  protected final String TEXT_29 = "->findById($id));\t" + NL + "\t\t}" + NL + "\t" + NL + "\t" + NL + "\t}" + NL + "\t" + NL + "\tpublic function delete($id, $internal = false) {" + NL + "\t" + NL + "\t\tif($id == null) {" + NL + "            $this->Session->setFlash('No id informed', 'default', array('class' => 'error'));" + NL + "            $this->redirect(array('action' => 'index'));" + NL + "            exit();" + NL + "        }" + NL + "        " + NL + "        $data = $this->";
  protected final String TEXT_30 = "->findById($id);" + NL + "        " + NL + "        if(count($data) == 0) {" + NL + "        \t$this->Session->setFlash('This register does not exist', 'default', array('class' => 'error'));" + NL + "            $this->redirect(array('action' => 'index'));" + NL + "            exit();" + NL + "        }" + NL + "        " + NL + "        $data['";
  protected final String TEXT_31 = "']['active'] = 0;" + NL + "        " + NL + "        " + NL + "        // execute the behavior" + NL + "\t\t\t";
  protected final String TEXT_32 = NL + "\t\t\t\t\t\t$this->loadModel('";
  protected final String TEXT_33 = "');" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t$executeCount = count($data['";
  protected final String TEXT_34 = "']);" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\tfor($i = 0 ; $i < $executeCount ; $i++) {" + NL + "\t\t\t\t\t\t\t$this->";
  protected final String TEXT_35 = "->executeBehavior($data['";
  protected final String TEXT_36 = "'][$i]['";
  protected final String TEXT_37 = "'], '";
  protected final String TEXT_38 = "', '";
  protected final String TEXT_39 = "', $data['";
  protected final String TEXT_40 = "'][$i]['";
  protected final String TEXT_41 = "']);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t";
  protected final String TEXT_42 = NL + "        " + NL + "        if($this->";
  protected final String TEXT_43 = "->save($data)) {" + NL + "        " + NL + "        \tif($internal) {" + NL + "        \t\treturn true;" + NL + "        \t}" + NL + "        " + NL + "\t\t\t$this->Session->setFlash('Data successfully deleted', 'flash_custom', array('class' => 'success'));" + NL + "\t\t\t" + NL + "\t\t} else {" + NL + "\t\t" + NL + "\t\t\tif($internal) {" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}" + NL + "\t\t" + NL + "\t\t\t$this->Session->setFlash('Something happened, please try again', 'flash_custom', array('class' => 'error'));" + NL + "\t\t\t" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t$this->redirect(array('action' => 'index'));" + NL + "        " + NL + "\t}" + NL + "\t" + NL + "\tpublic function listSelect2() {" + NL + "\t" + NL + "\t\t$this->autoRender = false;" + NL + "\t\t" + NL + "\t\tif(isset($this->request->data['id'])) {" + NL + "\t\t" + NL + "\t\t\t$searchField = $this->request->data['searchField'];" + NL + "\t\t\t$results = $this->";
  protected final String TEXT_44 = "->find('all', array(" + NL + "\t\t\t\t'conditions' => array(" + NL + "\t\t\t\t\t'id =' => $this->request->data['id']" + NL + "\t\t\t\t)" + NL + "\t\t\t));" + NL + "\t\t" + NL + "\t\t} else {" + NL + "\t\t" + NL + "\t\t\t$term = $this->request->query['term'];" + NL + "\t\t\t$searchField = $this->request->query['searchField'];" + NL + "\t\t\t" + NL + "\t\t\t$results = $this->";
  protected final String TEXT_45 = "->find('all', array(" + NL + "\t\t\t\t'conditions' => array(" + NL + "\t\t\t\t\t$searchField .' LIKE' => '%'. $term .'%'," + NL + "\t\t\t\t)" + NL + "\t\t\t));" + NL + "\t\t\t" + NL + "\t\t}" + NL + "\t\t\t\t\t" + NL + "\t\t$select2Format = array();" + NL + "        foreach($results as $key => $result) {" + NL + "            $select2Format[$key]['id'] = $result['";
  protected final String TEXT_46 = "']['id'];" + NL + "            $select2Format[$key]['text'] = $result['";
  protected final String TEXT_47 = "'][$searchField];" + NL + "        }" + NL + "\t\t" + NL + "\t\techo json_encode($select2Format);" + NL + "\t" + NL + "\t}" + NL + "\t" + NL + "\tpublic function detailJson() {" + NL + "\t" + NL + "\t\t$this->autoRender = false;" + NL + "\t" + NL + "\t\t$id = $this->request->query['id'];" + NL + "\t\t$result = $this->";
  protected final String TEXT_48 = "->findById($id);" + NL + "\t" + NL + "\t\tif(empty($result)) {" + NL + "\t\t\techo '[]';" + NL + "\t\t} else {" + NL + "\t\t\techo json_encode($result['";
  protected final String TEXT_49 = "']); \t" + NL + "\t\t} " + NL + "\t" + NL + "\t}" + NL + "\t" + NL + "\tpublic function checkRule() {" + NL + "\t" + NL + "\t\t$this->autoRender = false;" + NL + "\t" + NL + "\t\t$id = $this->request->query['id'];" + NL + "\t\t$attribute = $this->request->query['attribute'];" + NL + "\t\t$rule = $this->request->query['rule'];" + NL + "\t\t$value = $this->request->query['value'];" + NL + "\t\t" + NL + "\t\t$checkRule = $this->";
  protected final String TEXT_50 = "->checkRule($id, $attribute, $rule, $value);" + NL + "\t\t" + NL + "\t\tif(!$checkRule) {" + NL + "\t\t\t" + NL + "\t\t\t$returnValue = $this->";
  protected final String TEXT_51 = "->findById($id);" + NL + "\t\t\techo json_encode(array('status' => false, 'value' => $returnValue['";
  protected final String TEXT_52 = "'][$attribute]));" + NL + "\t\t\t" + NL + "\t\t} else {" + NL + "\t\t\techo json_encode(array('status' => true));\t" + NL + "\t\t}" + NL + "\t" + NL + "\t" + NL + "\t}" + NL + "\t" + NL + "" + NL + "}" + NL + "" + NL + "?>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Entity entity = (Entity) argument;

String modelName = StringHelper.name2system(entity.getName()); 
    stringBuffer.append(TEXT_2);
    stringBuffer.append( StringHelper.name2controller(entity.getName()) );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_4);
     for(Entity subEntity : entity.getSubEntity()) {
				if(subEntity instanceof EntityRelated) {
					EntityRelated entityRelated = (EntityRelated) subEntity;
					String modelRelated = "";
					String quantity = "";
					String attributeName = "";
					String rule = "";
					String main = "";
					for(Attribute attribute : entityRelated.getAttributes()) {
						if(attribute instanceof AttributeRelated) {
							AttributeRelated attributeRelated = (AttributeRelated) attribute;
							
							if(attributeRelated.getRule() != RuleTypes.NO_RULE) {
								modelRelated = StringHelper.name2system(entityRelated.getRelated().getName());
								quantity = StringHelper.name2db(attributeRelated.getName());
								attributeName = StringHelper.name2db(attributeRelated.getRelated().getName());
								rule = attributeRelated.getRule().getLiteral();
							}
							
							if(attributeRelated.isMain()) {
								main = StringHelper.name2db(attributeRelated.getName());
							}
							
						}
					}
					
					if(modelRelated != "" && main != "") { 
    stringBuffer.append(TEXT_5);
    stringBuffer.append( modelRelated );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( StringHelper.name2system(entityRelated.getName()) );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( modelRelated );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( StringHelper.name2system(entityRelated.getName()) );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( main );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( attributeName );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( rule );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( StringHelper.name2system(entityRelated.getName()) );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( quantity );
    stringBuffer.append(TEXT_14);
     }
					
					
				}
			} 
    stringBuffer.append(TEXT_15);
     for(Entity subEntity : entity.getSubEntity()) {
				if(subEntity instanceof EntityRelated) {
					EntityRelated entityRelated = (EntityRelated) subEntity;
					String modelRelated = "";
					String quantity = "";
					String attributeName = "";
					String behavior = "";
					String main = "";
					for(Attribute attribute : entityRelated.getAttributes()) {
						if(attribute instanceof AttributeRelated) {
							AttributeRelated attributeRelated = (AttributeRelated) attribute;
							
							if(attributeRelated.getOnCreate() != BehaviorTypes.DO_NOTHING) {
								modelRelated = StringHelper.name2system(entityRelated.getRelated().getName());
								quantity = StringHelper.name2db(attributeRelated.getName());
								attributeName = StringHelper.name2db(attributeRelated.getRelated().getName());
								behavior = attributeRelated.getOnCreate().getLiteral();
							}
							
							if(attributeRelated.isMain()) {
								main = StringHelper.name2db(attributeRelated.getName());
							}
							
						}
					}
					
					if(modelRelated != "" && main != "") { 
    stringBuffer.append(TEXT_16);
    stringBuffer.append( modelRelated );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( StringHelper.name2system(entityRelated.getName()) );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( modelRelated );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( StringHelper.name2system(entityRelated.getName()) );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( main );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( attributeName );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( behavior );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( StringHelper.name2system(entityRelated.getName()) );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( quantity );
    stringBuffer.append(TEXT_25);
     }
					
					
				}
			} 
    stringBuffer.append(TEXT_26);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_31);
     for(Entity subEntity : entity.getSubEntity()) {
				if(subEntity instanceof EntityRelated) {
					EntityRelated entityRelated = (EntityRelated) subEntity;
					String modelRelated = "";
					String quantity = "";
					String attributeName = "";
					String behavior = "";
					String main = "";
					for(Attribute attribute : entityRelated.getAttributes()) {
						if(attribute instanceof AttributeRelated) {
							AttributeRelated attributeRelated = (AttributeRelated) attribute;
							
							if(attributeRelated.getOnDelete() != BehaviorTypes.DO_NOTHING) {
								modelRelated = StringHelper.name2system(entityRelated.getRelated().getName());
								quantity = StringHelper.name2db(attributeRelated.getName());
								attributeName = StringHelper.name2db(attributeRelated.getRelated().getName());
								behavior = attributeRelated.getOnDelete().getLiteral();
							}
							
							if(attributeRelated.isMain()) {
								main = StringHelper.name2db(attributeRelated.getName());
							}
							
						}
					}
					
					if(modelRelated != "" && main != "") { 
    stringBuffer.append(TEXT_32);
    stringBuffer.append( modelRelated );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( StringHelper.name2system(entityRelated.getName()) );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( modelRelated );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( StringHelper.name2system(entityRelated.getName()) );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( main );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( attributeName );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( behavior );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( StringHelper.name2system(entityRelated.getName()) );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( quantity );
    stringBuffer.append(TEXT_41);
     }
					
					
				}
			} 
    stringBuffer.append(TEXT_42);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( modelName );
    stringBuffer.append(TEXT_52);
    return stringBuffer.toString();
  }
}
