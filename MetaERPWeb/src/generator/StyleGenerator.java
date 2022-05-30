package generator;

import java.io.IOException;

import configuration.GeneralLoader;

import utils.CopyDirectoryHelper;

public class StyleGenerator {

	private GeneralLoader generalLoader;

	private String libs;

	public StyleGenerator(GeneralLoader generalLoader) {
		this.generalLoader = generalLoader;

		this.setLibs(this.createLibs());
		//this.copyCss();
		//this.copyJs();
		//this.copyImg();
		//this.copyFont();

	}

	private String createLibs() {

		try {
			CopyDirectoryHelper.copyFolder(
					"libs/js/metaerp",
					generalLoader.getRootDirectory()
							+ generalLoader.getJsDirectory() + "metaerp");
			CopyDirectoryHelper.copyFolder(
					"libs/css/metaerp",
					generalLoader.getRootDirectory()
							+ generalLoader.getCssDirectory() + "metaerp");
		} catch (IOException e) {
			System.err
					.println("Javascript libraries couldn't be created, please check the informed directories");
		}

		// JS
		String libs = "<script src=\"/" + generalLoader.getJsUrl()
				+ "metaerp/jquery-2.0.3.min.js\"></script>\n";
		libs += "<script src=\"/" + generalLoader.getJsUrl()
				+ "metaerp/jquery-ui-1.10.3/ui/jquery-ui.js\"></script>\n";
		libs += "<script src=\"/" + generalLoader.getJsUrl()
				+ "metaerp/jquery.maskedinput.min.js\"></script>\n";
		libs += "<script src=\"/" + generalLoader.getJsUrl()
				+ "metaerp/jquery.maskMoney.js\"></script>\n";
		libs += "<script src=\"/" + generalLoader.getJsUrl()
				+ "metaerp/validation.js\"></script>\n";
		libs += "<script src=\"/" + generalLoader.getJsUrl()
				+ "metaerp/select2.js\"></script>\n";
		libs += "<script src=\"/" + generalLoader.getJsUrl()
				+ "metaerp/main.js\"></script>\n";

		// CSS
		libs += "<link rel=\"stylesheet\" href=\"/"
				+ generalLoader.getJsUrl()
				+ "metaerp/jquery-ui-1.10.3/themes/base/jquery-ui.css\" />\n";
		libs += "<link rel=\"stylesheet\" href=\"/"
				+ generalLoader.getCssUrl()
				+ "metaerp/select2.css\" />\n";
		
		return libs;

	}

//	private void copyCss() {
//
//		try {
//			CopyDirectoryHelper.copyFolder("configs/styles/css", generalLoader.getRootDirectory()
//					+ generalLoader.getCssDirectory());
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.err
//					.println("CSS directory couldn't be created, please check the informed directories");
//		}
//
//	}
//
//	private void copyJs() {
//
//		try {
//			CopyDirectoryHelper.copyFolder("configs/styles/js", generalLoader.getRootDirectory()
//					+ generalLoader.getJsDirectory());
//		} catch (IOException e) {
//			System.err
//					.println("Js directory couldn't be created, please check the informed directories");
//		}
//
//	}
//
//	private void copyImg() {
//
//		try {
//			CopyDirectoryHelper.copyFolder("configs/styles/img", generalLoader.getRootDirectory()
//					+ generalLoader.getImgDirectory());
//		} catch (IOException e) {
//			System.err
//					.println("Img directory couldn't be created, please check the informed directories");
//		}
//
//	}
//
//	private void copyFont() {
//
//		try {
//			CopyDirectoryHelper.copyFolder("configs/styles/font", generalLoader.getRootDirectory()
//					+ generalLoader.getFontDirectory());
//		} catch (IOException e) {
//			System.err
//					.println("Font directory couldn't be created, please check the informed directories");
//		}
//
//	}

	/*
	 * GETTERS AND SETTERS
	 */

	public String getLibs() {
		return libs;
	}

	private void setLibs(String libs) {
		this.libs = libs;
	}

}
