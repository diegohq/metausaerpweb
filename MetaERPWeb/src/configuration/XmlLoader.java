package configuration;

public abstract class XmlLoader {

	protected String xmlPath;
	protected XmlReader xmlFile;
	
	public XmlLoader(String xmlPath) throws Exception {
		this.xmlPath = xmlPath;
		
		loadXml();
		loadConfigurations();
		
	}
	
	private void loadXml() {
		xmlFile = new XmlReader(xmlPath);
	}
	
	protected abstract void loadConfigurations() throws Exception;
	
}
