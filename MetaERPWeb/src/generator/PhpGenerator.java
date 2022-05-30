package generator;

import java.util.List;

import utils.StringHelper;
import utils.metaerp.EntityHelper;

import metaerp.ERP;
import metaerp.Entity;
import generator.php.Controller;
import generator.php.Model;
import configuration.GeneralLoader;

public class PhpGenerator extends BaseGenerator {

	private GeneralLoader generalLoader;

	public PhpGenerator(GeneralLoader generalLoader) {
		
		setGeneralLoader(generalLoader);
		
		VendorGenerator.createVendors(generalLoader);
		
	}

	public void generateAllModels(ERP erp) {

		List<Entity> entities = erp.getEntities();

		for (Entity entity : entities) {
			this.generateModel(entity);
		}

	}

	public void generateModel(Entity entity) {
		this.generateModel(new EntityHelper(entity));
	}

	public void generateModel(EntityHelper entityHelper) {

		Model model = new Model();
		Entity entity = entityHelper.getEntity();

		String modelCode = model.generate(entityHelper);

		this.saveCodeFile(
				generalLoader.getRootDirectory()
						+ generalLoader.getModelDirectory() + "/"
						+ StringHelper.name2system(entity.getName()) + ".php",
				modelCode);

		for (Entity subEntity : entity.getSubEntity()) {
			
			EntityHelper subEntityHelper = new EntityHelper(subEntity);
			subEntityHelper.setParent(entity);
			
			this.generateModel(subEntityHelper);
			
		}

	}

	public void generateAllControllers(ERP erp) {

		List<Entity> entities = erp.getEntities();

		for (Entity entity : entities) {
			this.generateController(entity);
		}

	}

	public void generateController(Entity entity) {

		Controller controller = new Controller();

		String controllerCode = controller.generate(entity);

		this.saveCodeFile(
				generalLoader.getRootDirectory()
						+ generalLoader.getControllerDirectory() + "/"
						+ StringHelper.name2controller(entity.getName())
						+ ".php", controllerCode);

	}

	/*
	 * GETTERS AND SETTERS
	 */

	public GeneralLoader getGeneralLoader() {
		return generalLoader;
	}

	private void setGeneralLoader(GeneralLoader generalLoader) {
		this.generalLoader = generalLoader;
	}

}
