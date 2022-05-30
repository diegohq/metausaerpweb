package main;

import configuration.FlashLoader;
import configuration.GeneralLoader;
import configuration.HtmlLoader;
import generator.*;

public class Main {

	public static void main(String[] args) {

		try {
			
			GeneralLoader generalLoader = new GeneralLoader("configs/general.xml");
			FlashLoader flashLoader = new FlashLoader("configs/html/flash.xml");
			
			HtmlLoader.setGeneralLoader(generalLoader);
			
			Generator generator = new Generator(generalLoader, flashLoader);
			generator.generate(ModelLoader.load(generalLoader.getMetaErpModelPath()));
			
		} catch(Exception e) {
			
			if(e.getMessage() != null) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			} else {
				e.printStackTrace();
			}
			
		}
		

	}

}
