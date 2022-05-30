package generator;

import java.io.File;
import java.util.List;

import configuration.GeneralLoader;
import configuration.HtmlLoader;

import metaerp.ERP;
import metaerp.Entity;

import generator.html.*;

import utils.StringHelper;

public class HtmlGenerator extends BaseGenerator {

	private GeneralLoader generalLoader;

	private HtmlLoader beforeAllContentPages;
	private HtmlLoader afterAllContentPages;
	private HtmlLoader beforeTitle;
	private HtmlLoader afterTitle;
	
	private String menu;

	private String directory;

	private StyleGenerator styleGenerator;

	public HtmlGenerator(GeneralLoader generalLoader) {

		this.setGeneralLoader(generalLoader);
		this.setDirectory(generalLoader.getRootDirectory()
				+ generalLoader.getViewDirectory());
		this.setBeforeAllContentPages(new HtmlLoader("allPages",
				"beforeAllContentPages"));
		this.setAfterAllContentPages(new HtmlLoader("allPages",
				"afterAllContentPages"));
		this.setBeforeTitle(new HtmlLoader("allPages", "beforeTitle"));
		this.setAfterTitle(new HtmlLoader("allPages", "afterTitle"));
		
		styleGenerator = new StyleGenerator(generalLoader);

		this.setMenu("");
		
		// now checks if directory exists
		File directory = new File(this.directory);
		if (!directory.exists()) {
			if (!directory.mkdirs()) {
				System.err.println("View directory couldn't be created");
			}
		}

	}

	public void generateAllHtml(ERP erp) {

		List<Entity> entities = erp.getEntities();

		this.setMenu(this.generateMenuHtml(entities));
		
		for (Entity entity : entities) {
			this.generateHtml(entity);
		}

	}

	public void generateHtml(Entity entity) {

		// check if directories exist
		String entityDirectoryPath = directory
				+ StringHelper.name2systemPlural(entity.getName());
		File entityDirectory = new File(entityDirectoryPath);

		if (!entityDirectory.isDirectory()) {
			entityDirectory.mkdirs();
		}

		// index
		this.generateIndexHtml(entity, entityDirectoryPath);
		
		// create
		this.generateCreateHtml(entity, entityDirectoryPath);
		
		// edit
		this.generateEditHtml(entity, entityDirectoryPath);
		

	}

	private void generateIndexHtml(Entity entity, String directory) {

		Index index = new Index();
		String indexHtml = index.generate(entity);

		// Replace all configurations...

		indexHtml = replaceDefaultConfigurations(indexHtml);

		indexHtml = indexHtml.replaceAll("\\{BEFORE_THIS_CONTENT_PAGE\\}",
				configurationContent("listingTable", "beforeThisContentPage"));
		indexHtml = indexHtml.replaceAll("\\{AFTER_THIS_CONTENT_PAGE\\}",
				configurationContent("listingTable", "afterThisContentPage"));
		
		indexHtml = indexHtml.replaceAll("\\{CREATE_BUTTON_EXTRA\\}",
				configurationContent("listingTable", "createButtonExtra"));
		
		indexHtml = indexHtml.replaceAll("\\{BEFORE_LISTING_TABLE\\}",
				configurationContent("listingTable", "beforeListingTable"));
		indexHtml = indexHtml.replaceAll("\\{AFTER_LISTING_TABLE\\}",
				configurationContent("listingTable", "afterListingTable"));
		indexHtml = indexHtml.replaceAll("\\{LISTING_TABLE_EXTRA\\}",
				configurationContent("listingTable", "listingTableExtra"));
		
		indexHtml = this.replaceDefaults(indexHtml);
		
		this.saveCodeFile(directory + "/index.ctp", indexHtml);

	}

	private void generateCreateHtml(Entity entity, String directory) {

		Create create = new Create();
		String createHtml = create.generate(entity);

		// Replace all configurations...

		createHtml = replaceDefaultConfigurations(createHtml);

		createHtml = createHtml.replaceAll("\\{BEFORE_THIS_CONTENT_PAGE\\}",
				configurationContent("create", "beforeThisContentPage"));
		createHtml = createHtml.replaceAll("\\{AFTER_THIS_CONTENT_PAGE\\}",
				configurationContent("create", "afterThisContentPage"));

		createHtml = createHtml.replaceAll("\\{BEFORE_FORM_TAG\\}",
				configurationContent("form", "beforeFormTag"));
		createHtml = createHtml.replaceAll("\\{AFTER_FORM_TAG\\}",
				configurationContent("form", "afterFormTag"));
		
		createHtml = createHtml.replaceAll("\\{CREATE_BUTTON_EXTRA\\}",
				configurationContent("listingTable", "createButtonExtra"));
		
		createHtml = createHtml.replaceAll("\\{OPEN_BOX\\}",
				configurationContent("form", "openBox"));
		createHtml = createHtml.replaceAll("\\{CLOSE_BOX\\}",
				configurationContent("form", "closeBox"));

		createHtml = createHtml.replaceAll("\\{FORM_TAG_EXTRA\\}",
				configurationContent("form", "formTagExtra"));

		createHtml = createHtml.replaceAll("\\{BEFORE_LABEL_TAG\\}",
				configurationContent("form", "beforeLabelTag"));
		createHtml = createHtml.replaceAll("\\{AFTER_LABEL_TAG\\}",
				configurationContent("form", "afterLabelTag"));

		createHtml = createHtml.replaceAll("\\{LABEL_TAG_EXTRA\\}",
				configurationContent("form", "labelTagExtra"));

		createHtml = createHtml.replaceAll("\\{BEFORE_INPUT_TAG\\}",
				configurationContent("form", "beforeInputTag"));
		createHtml = createHtml.replaceAll("\\{AFTER_INPUT_TAG\\}",
				configurationContent("form", "afterInputTag"));

		createHtml = createHtml.replaceAll("\\{BEFORE_HELP_TEXT\\}",
				configurationContent("form", "beforeHelpText"));
		createHtml = createHtml.replaceAll("\\{AFTER_HELP_TEXT\\}",
				configurationContent("form", "afterHelpText"));

		createHtml = createHtml.replaceAll("\\{INPUT_TAG_EXTRA\\}",
				configurationContent("form", "inputTagExtra"));

		createHtml = createHtml.replaceAll("\\{BEFORE_SUBMIT_TAG\\}",
				configurationContent("form", "beforeSubmitTag"));
		createHtml = createHtml.replaceAll("\\{AFTER_SUBMIT_TAG\\}",
				configurationContent("form", "afterSubmitTag"));

		createHtml = createHtml.replaceAll("\\{SUBMIT_TAG_EXTRA\\}",
				configurationContent("form", "submitTagExtra"));

		createHtml = this.replaceDefaults(createHtml);

		this.saveCodeFile(directory + "/create.ctp", createHtml);

	}
	
	private void generateEditHtml(Entity entity, String directory) {

		Edit edit = new Edit();
		String editHtml = edit.generate(entity);

		// Replace all configurations...

		editHtml = replaceDefaultConfigurations(editHtml);

		editHtml = editHtml.replaceAll("\\{BEFORE_THIS_CONTENT_PAGE\\}",
				configurationContent("edit", "beforeThisContentPage"));
		editHtml = editHtml.replaceAll("\\{AFTER_THIS_CONTENT_PAGE\\}",
				configurationContent("edit", "afterThisContentPage"));

		editHtml = editHtml.replaceAll("\\{BEFORE_FORM_TAG\\}",
				configurationContent("form", "beforeFormTag"));
		editHtml = editHtml.replaceAll("\\{AFTER_FORM_TAG\\}",
				configurationContent("form", "afterFormTag"));
		
		editHtml = editHtml.replaceAll("\\{CREATE_BUTTON_EXTRA\\}",
				configurationContent("listingTable", "createButtonExtra"));
		
		editHtml = editHtml.replaceAll("\\{OPEN_BOX\\}",
				configurationContent("form", "openBox"));
		editHtml = editHtml.replaceAll("\\{CLOSE_BOX\\}",
				configurationContent("form", "closeBox"));

		editHtml = editHtml.replaceAll("\\{FORM_TAG_EXTRA\\}",
				configurationContent("form", "formTagExtra"));

		editHtml = editHtml.replaceAll("\\{BEFORE_LABEL_TAG\\}",
				configurationContent("form", "beforeLabelTag"));
		editHtml = editHtml.replaceAll("\\{AFTER_LABEL_TAG\\}",
				configurationContent("form", "afterLabelTag"));

		editHtml = editHtml.replaceAll("\\{LABEL_TAG_EXTRA\\}",
				configurationContent("form", "labelTagExtra"));

		editHtml = editHtml.replaceAll("\\{BEFORE_INPUT_TAG\\}",
				configurationContent("form", "beforeInputTag"));
		editHtml = editHtml.replaceAll("\\{AFTER_INPUT_TAG\\}",
				configurationContent("form", "afterInputTag"));

		editHtml = editHtml.replaceAll("\\{BEFORE_HELP_TEXT\\}",
				configurationContent("form", "beforeHelpText"));
		editHtml = editHtml.replaceAll("\\{AFTER_HELP_TEXT\\}",
				configurationContent("form", "afterHelpText"));

		editHtml = editHtml.replaceAll("\\{INPUT_TAG_EXTRA\\}",
				configurationContent("form", "inputTagExtra"));

		editHtml = editHtml.replaceAll("\\{BEFORE_SUBMIT_TAG\\}",
				configurationContent("form", "beforeSubmitTag"));
		editHtml = editHtml.replaceAll("\\{AFTER_SUBMIT_TAG\\}",
				configurationContent("form", "afterSubmitTag"));

		editHtml = editHtml.replaceAll("\\{SUBMIT_TAG_EXTRA\\}",
				configurationContent("form", "submitTagExtra"));

		// Create all libraries...
				
		editHtml = this.replaceDefaults(editHtml);

		this.saveCodeFile(directory + "/edit.ctp", editHtml);

	}
	
	private String generateMenuHtml(List<Entity> entities) {
		
		Menu menu = new Menu();
		String menuString = menu.generate(entities);
		
		menuString = menuString.replaceAll("\\{UL_MENU_EXTRA\\}",
				configurationContent("allPages", "ulMenuExtra"));
		
		menuString = menuString.replaceAll("\\{LI_MENU_EXTRA\\}",
				configurationContent("allPages", "liMenuExtra"));
		
		menuString = menuString.replaceAll("\\{BEFORE_MENU_ITEM\\}",
				configurationContent("allPages", "beforeMenuItem"));
		menuString = menuString.replaceAll("\\{AFTER_MENU_ITEM\\}",
				configurationContent("allPages", "afterMenuItem"));
		
		return menuString;
		
	}
	
	
	/*
	 * HELPERS
	 */
	
	private String replaceDefaultConfigurations(String html) {

		html = html.replaceAll("\\{BEFORE_ALL_CONTENT_PAGES\\}",
				getBeforeAllContentPages().getContent());
		html = html.replaceAll("\\{AFTER_ALL_CONTENT_PAGES\\}",
				getAfterAllContentPages().getContent());

		html = html.replaceAll("\\{BEFORE_TITLE\\}", getBeforeTitle()
				.getContent());
		html = html.replaceAll("\\{AFTER_TITLE\\}", getAfterTitle()
				.getContent());

		return html;

	}
	
	private String replaceDefaults(String html) {
		
		// Create all libraries...
		html = html.replaceAll("</body>", styleGenerator.getLibs() + "</body>");
		
		return html.replaceAll("\\{MENU_LIST\\}", this.getMenu());
				
	}

	/*
	 * GETTERS AND SETTERS
	 */

	public String getDirectory() {
		return directory;
	}

	private void setDirectory(String directory) {
		this.directory = directory;
	}

	private HtmlLoader getBeforeAllContentPages() {
		return beforeAllContentPages;
	}

	private void setBeforeAllContentPages(HtmlLoader beforeAllContentPages) {
		this.beforeAllContentPages = beforeAllContentPages;
	}

	private HtmlLoader getAfterAllContentPages() {
		return afterAllContentPages;
	}

	private void setAfterAllContentPages(HtmlLoader afterAllContentPages) {
		this.afterAllContentPages = afterAllContentPages;
	}

	public GeneralLoader getGeneralLoader() {
		return generalLoader;
	}

	private void setGeneralLoader(GeneralLoader generalLoader) {
		this.generalLoader = generalLoader;
	}

	public HtmlLoader getBeforeTitle() {
		return beforeTitle;
	}

	private void setBeforeTitle(HtmlLoader beforeTitle) {
		this.beforeTitle = beforeTitle;
	}

	public HtmlLoader getAfterTitle() {
		return afterTitle;
	}

	private void setAfterTitle(HtmlLoader afterTitle) {
		this.afterTitle = afterTitle;
	}

	public String getMenu() {
		return menu;
	}

	private void setMenu(String menu) {
		this.menu = menu;
	}

}
