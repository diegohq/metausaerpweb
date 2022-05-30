package generator;

import generator.html.Flash;
import configuration.FlashLoader;
import configuration.GeneralLoader;

public class FlashGenerator extends BaseGenerator {
	
	private GeneralLoader generalLoader;
	private FlashLoader flashLoader;
	
	private String directory;
	
	public FlashGenerator(GeneralLoader generalLoader, FlashLoader flashLoader) {
		
		this.setGeneralLoader(generalLoader);
		this.setFlashLoader(flashLoader);
		
		this.setDirectory(generalLoader.getRootDirectory() + generalLoader.getFlashDirectory());
		
	}
	
	public void generateFlash() {
		
		Flash flash = new Flash();
		String flashCode = flash.generate(this.flashLoader);
		
		flashCode = flashCode.replaceAll("\\{BEFORE_FLASH\\}", configurationContent("allPages", "beforeFlash"));
		flashCode = flashCode.replaceAll("\\{AFTER_FLASH\\}", configurationContent("allPages", "afterFlash"));
		
		flashCode = flashCode.replaceAll("\\{AFTER_FLASH_MESSAGE\\}", configurationContent("allPages", "afterFlashMessage"));

		this.saveCodeFile(directory + "flash_custom.ctp", flashCode);
		
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
	
	public String getDirectory() {
		return directory;
	}

	private void setDirectory(String directory) {
		this.directory = directory;
	}

}
