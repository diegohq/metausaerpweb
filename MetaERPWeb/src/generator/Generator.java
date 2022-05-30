package generator;

import configuration.FlashLoader;
import configuration.GeneralLoader;
import metaerp.ERP;

public class Generator {
	
	private GeneralLoader generalLoader;
	private FlashLoader flashLoader;
		
	public Generator(GeneralLoader generalLoader, FlashLoader flashLoader) {
		setGeneralLoader(generalLoader);
		setFlashLoader(flashLoader);
	}
		
	public void generate(ERP erp) {
		
		// generate sqls
		SqlGenerator sqlGenerator = new SqlGenerator(generalLoader);
		sqlGenerator.generateAllSql(erp);
		
		// generate models and controllers
		PhpGenerator phpGenerator = new PhpGenerator(generalLoader);
		phpGenerator.generateAllModels(erp);
		phpGenerator.generateAllControllers(erp);
		
		// generate views
		HtmlGenerator htmlGenerator = new HtmlGenerator(generalLoader);
		htmlGenerator.generateAllHtml(erp);
		
		// generate flash
		FlashGenerator flashGenerator = new FlashGenerator(generalLoader, flashLoader);
		flashGenerator.generateFlash();
		
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

	public FlashLoader getFlashLoader() {
		return flashLoader;
	}

	private void setFlashLoader(FlashLoader flashLoader) {
		this.flashLoader = flashLoader;
	}
		
	
}
