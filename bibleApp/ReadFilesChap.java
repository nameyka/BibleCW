package bibleApp;

import java.io.*;
import java.util.*;


public class ReadFilesChap {

	private Scanner readFile;
	private String path;
	private ArrayList<String> text;
	//	private Scanner scan;
	/**
	 * Constructor: read data from files
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		ReadFilesChap x = new ReadFilesChap("F:\\University\\Year 2\\Term 1\\1) Data Structures and algorithms with Java\\CourseWork\\KJBible\\1Chronicles.txt");
		x.fileIn();
		
	//	x.countWord("and");
	}
	public ReadFilesChap(String inPath)
	{
		path = inPath;
		text = new ArrayList<String>();

	}

	public void fileIn() throws IOException{
		//read text file
		readFile = new Scanner (new File (path));
		//read records one by one
		while(readFile.hasNextLine())
		{
			String record = readFile.nextLine();
			//add the record to the list of text
			text.add(record);
			System.out.println(record);
		}
		readFile.close();
	}
}



