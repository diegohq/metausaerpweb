package configuration;

public class HtmlLoader extends FileLoader {
		
	private static GeneralLoader generalLoader;
	private String type;
	private String configuration;
	
	public HtmlLoader(String type, String configuration) {
		super("configs/html/" + type + "/" + configuration + ".html");
		setType(type);
		setConfiguration(configuration);
	}
	
	public HtmlLoader(GeneralLoader generalLoader) {
		setGeneralLoader(generalLoader);
	}
	
	
	/*
	 * GETTERS AND SETTERS
	 */

	public static GeneralLoader getGeneralLoader() {
		return generalLoader;
	}

	public static void setGeneralLoader(GeneralLoader generalLoader) {
		
		if(HtmlLoader.generalLoader == null) {
			HtmlLoader.generalLoader = generalLoader;
		}
		
	}

	public String getType() {
		return type;
	}

	private void setType(String type) {
		this.type = type;
	}

	public String getConfiguration() {
		return configuration;
	}

	private void setConfiguration(String configuration) {
		this.configuration = configuration;
	} 
	
}
