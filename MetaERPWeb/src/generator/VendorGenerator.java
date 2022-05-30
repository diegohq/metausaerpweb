package generator;

import java.io.IOException;

import utils.CopyDirectoryHelper;
import configuration.GeneralLoader;

public class VendorGenerator {
		
	public static void createVendors(GeneralLoader generalLoader) {
			
		try {
			CopyDirectoryHelper.copyFolder(
					"libs/vendor/",
					generalLoader.getRootDirectory()
							+ generalLoader.getVendorDirectory());
		} catch (IOException e) {
			System.err
			.println("Vendor files couldn't be created, please check the informed directories");
		}
		
	}

}
