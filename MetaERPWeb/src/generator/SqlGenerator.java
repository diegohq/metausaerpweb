package generator;

import generator.sql.Create;

import java.util.List;

import utils.StringHelper;
import utils.metaerp.EntityHelper;

import metaerp.ERP;
import metaerp.Entity;
import configuration.GeneralLoader;

public class SqlGenerator extends BaseGenerator {
	
	private GeneralLoader generalLoader;
	
	private String directory;

	public SqlGenerator(GeneralLoader generalLoader) {
		setGeneralLoader(generalLoader);
		
		this.directory = generalLoader.getRootDirectory();
		
	}
	
	public void generateAllSql(ERP erp) {
		
		List<Entity> entities = erp.getEntities();
		
		for(Entity entity : entities) {
			this.generateSql(entity);
		}
		
	}
	
	public void generateSql(Entity entity) {
		this.generateSql(new EntityHelper(entity));	
	}
	
	public void generateSql(EntityHelper entityHelper) {
		
		Create create = new Create();
		Entity entity = entityHelper.getEntity();
		
		String createSql = create.generate(entityHelper);
		
		this.saveCodeFile(directory + StringHelper.name2system(entity.getName()) + ".sql", createSql);
		
		for(Entity subEntity : entity.getSubEntity()) {
			
			EntityHelper subEntityHelper = new EntityHelper(subEntity);
			subEntityHelper.setParent(entity);
			
			this.generateSql(subEntityHelper);
			
		}
		
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
