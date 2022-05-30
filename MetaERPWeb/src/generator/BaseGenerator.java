package generator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import configuration.HtmlLoader;

public class BaseGenerator {

	protected String configurationContent(String type, String configuration) {
		HtmlLoader htmlLoader = new HtmlLoader(type, configuration);
		return htmlLoader.getContent();
	}
	
	protected void saveCodeFile(String path, String content) {
		
		try {
			PrintWriter writer = new PrintWriter(path, "UTF-8");
			writer.println(content);
			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
