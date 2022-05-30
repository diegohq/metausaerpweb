package configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLoader {
	
	private String path;
	private String content;
		
	public FileLoader(String path) {
		setPath(path);
		loadFile();
	}
	
	protected FileLoader() {
		setPath("");
		setContent("");
	}
	
	private void loadFile() {
		
		try {
			setContent(new Scanner(new File(path)).useDelimiter("\\Z").next());
		} catch (FileNotFoundException e) {
			setContent("");
		}
				
	}
	
	/*
	 * GETTERS AND SETTERS
	 */

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getContent() {
		return content;
	}

	private void setContent(String content) {
		this.content = content;
	}

}
