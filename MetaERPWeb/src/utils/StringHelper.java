package utils;

public class StringHelper {
	
	public static String name2system(String name) {
		String[] namesSplit = name.toLowerCase().split(" ");
		
		String camelCase = "";
		
		for(String part : namesSplit) {
			char first = Character.toUpperCase(part.charAt(0));
			camelCase += first + part.substring(1);
		}
		
		return camelCase;
		
	}
	
	public static String name2systemPlural(String name) {
		
		if(getLastChars(name, 1).equals("h")) {
			return name2system(name) + "es";
		}
		
		return name2system(name) + "s";
		
	}
	
	public static String name2controller(String name) {
		return name2systemPlural(name) + "Controller";
	}
	
	public static String name2db(String name) {
		return name.toLowerCase().replaceAll(" ", "_");
	}
	
	public static String name2dbName(String name) {
		
		if(getLastChars(name, 1).equals("h")) {
			return name2db(name) + "es";
		}
		
		return name2db(name) + "s";
		
	}
	
	public static String getLastChars(String string, int last) {
        return string.substring(string.length() - last); 
    }

}
