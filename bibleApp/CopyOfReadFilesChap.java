package bibleApp;

import java.io.*;
import java.nio.file.Files;
import java.util.*;


public class CopyOfReadFilesChap {

	private Scanner readFile;
	private String path;
	private ArrayList<String> text;
	private ReadFolder aPath;

	//	private Scanner scan;
	/**
	 * Constructor: read data from files
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//	CopyOfReadFilesChap x = new CopyOfReadFilesChap();
		//x.fileIn();

		//	x.countWord("and");
		ReadFolder aPath = new ReadFolder("C:\\KJBible");
		//System.out.println(aPath.readInFolder());
	}
	public CopyOfReadFilesChap()
	{

		text = new ArrayList<String>();



	}

	public void fileIn() throws IOException
	{
		aPath = new ReadFolder("C:\\KJBible");
		aPath.readInFolder();
		int i = 0;


	}




	{

	}



	//read records one by one
	/**while(path1.
		{
			readFile = new Scanner (new File (ReadFolder path1));
			String record = readFile.nextLine();
			//add the record to the list of text
			text.add(record);
			System.out.println(record);
		}
		readFile.close();
	}*/
}



