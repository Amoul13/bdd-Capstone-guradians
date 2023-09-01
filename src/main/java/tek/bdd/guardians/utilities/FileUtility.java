package tek.bdd.guardians.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtility {
	
	//this method will return an instance of FileInputStream class
	public static FileInputStream getFileInputStream(String filePath) throws FileNotFoundException {
		return new FileInputStream(new File(filePath));
	}

}
