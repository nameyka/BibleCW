package bibleApp;
import java.io.File;
import java.nio.file.Files;
public class Test {

	public static  void main (String[] args)
	{


		File folder = new File("C:\\KJBible");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			File file = listOfFiles[i];
			if (file.isFile() && files.getName().endsWith(".txt")) {
				//String content = File.readFileToString(file);
				/* do somthing with content */
				System.out.println(file);
			} 
		}
	}


}


