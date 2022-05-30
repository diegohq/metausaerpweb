package configuration;

public class FlashLoader extends XmlLoader {
	
	private String sucessClass;
	private String errorClass;
	private String infoClass;

	public FlashLoader(String xmlPath) throws Exception {
		super(xmlPath);
	}
	
	@Override
	protected void loadConfigurations() throws Exception {
		
		setSucessClass(xmlFile.getTagValue("sucessClass"));
		setErrorClass(xmlFile.getTagValue("errorClass"));
		setInfoClass(xmlFile.getTagValue("infoClass"));
		
	}
	
	/*
	 * GETTERS AND SETTERS
	 */

	public String getSucessClass() {
		return sucessClass;
	}

	private void setSucessClass(String sucessClass) {
		this.sucessClass = sucessClass;
	}

	public String getErrorClass() {
		return errorClass;
	}

	private void setErrorClass(String errorClass) {
		this.errorClass = errorClass;
	}

	public String getInfoClass() {
		return infoClass;
	}

	private void setInfoClass(String infoClass) {
		this.infoClass = infoClass;
	}

}
