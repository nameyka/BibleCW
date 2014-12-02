package bibleApp;

import java.io.File;

import javax.activation.FileDataSource;
public class ReadFolder {

	private String folderPath;
	private File files;
	private String aPath;


	public static void main(String[] args)
	{
		ReadFolder x = new ReadFolder("C:\\KJBible");
		x.readInFolder();


	}
	public ReadFolder(String inPath)
	{
		aPath = inPath;
		files = new File (aPath);	
		//String[] folderPath = new String[66];
	}

	public void readInFolder()
	{
		File files = new File ("C:\\KJBible"); //shows path
		//1) inserts files in to an array
		int i = 0 ;
		
		String[] filed = files.list(); //create an array filed and insert files names from listFiles
		//2) read each file //for loop
		//3) store each word in file into an array
		while (i < filed.length)
		{
			folderPath = filed[i].toString();
			System.out.println(folderPath);
			i++;
	
		}
	}

	/**
	public String getFolderPath()
	{

	}
	 */
}

