package configuration;

public class GeneralLoader extends XmlLoader {
	
	private String metaErpModelPath;
	
	private String rootDirectory;
	
	// MVC
	private String viewDirectory;
	private String modelDirectory;
	private String controllerDirectory;
	private String vendorDirectory;
	
	// HTML and its styles
	private String cssDirectory;
	private String jsDirectory;
	private String imgDirectory;
	private String fontDirectory;
	
	private String flashDirectory;
	
	private String jsUrl;
	private String cssUrl;
	
	
	public GeneralLoader(String xmlPath) throws Exception {
		super(xmlPath);
	}

	@Override
	protected void loadConfigurations() throws Exception {
		
		setRootDirectory(xmlFile.getTagValue("rootDirectory"));
		setMetaErpModelPath(xmlFile.getTagValue("metaErpModelPath"));
		
		setModelDirectory("app/Model/");
		setControllerDirectory("app/Controller/");
		setViewDirectory("app/View/");
		setVendorDirectory("app/Vendor/");
		
		setCssDirectory("app/webroot/css/");
		setJsDirectory("app/webroot/js/");
		setImgDirectory("app/webroot/img/");
		setFontDirectory("app/webroot/font/");
		
		setFlashDirectory("app/View/Elements/");
		
		setJsUrl("js/");
		setCssUrl("css/");
		
	}
	
	/*
	 * GETTERS AND SETTERS
	 */
	
	public String getMetaErpModelPath() {
		return metaErpModelPath;
	}

	private void setMetaErpModelPath(String metaErpModelPath) {
		this.metaErpModelPath = metaErpModelPath;
	}

	public String getViewDirectory() {
		return viewDirectory;
	}

	private void setViewDirectory(String viewDirectory) {
		this.viewDirectory = viewDirectory;
	}
	
	public String getVendorDirectory() {
		return vendorDirectory;
	}

	private void setVendorDirectory(String vendorDirectory) {
		this.vendorDirectory = vendorDirectory;
	}


	public String getRootDirectory() {
		return rootDirectory;
	}

	private void setRootDirectory(String rootDirectory) {
		this.rootDirectory = rootDirectory;
	}
	
	public String getJsDirectory() {
		return jsDirectory;
	}

	private void setJsDirectory(String jsDirectory) {
		this.jsDirectory = jsDirectory;
	}

	public String getCssDirectory() {
		return cssDirectory;
	}

	private void setCssDirectory(String cssDirectory) {
		this.cssDirectory = cssDirectory;
	}

	public String getImgDirectory() {
		return imgDirectory;
	}

	private void setImgDirectory(String imgDirectory) {
		this.imgDirectory = imgDirectory;
	}

	public String getFontDirectory() {
		return fontDirectory;
	}

	private void setFontDirectory(String fontDirectory) {
		this.fontDirectory = fontDirectory;
	}

	public String getJsUrl() {
		return jsUrl;
	}

	private void setJsUrl(String jsUrl) {
		this.jsUrl = jsUrl;
	}

	public String getModelDirectory() {
		return modelDirectory;
	}

	private void setModelDirectory(String modelDirectory) {
		this.modelDirectory = modelDirectory;
	}

	public String getControllerDirectory() {
		return controllerDirectory;
	}

	private void setControllerDirectory(String controllerDirectory) {
		this.controllerDirectory = controllerDirectory;
	}

	public String getFlashDirectory() {
		return flashDirectory;
	}

	private void setFlashDirectory(String flashDirectory) {
		this.flashDirectory = flashDirectory;
	}

	public String getCssUrl() {
		return cssUrl;
	}

	private void setCssUrl(String cssUrl) {
		this.cssUrl = cssUrl;
	}

}
