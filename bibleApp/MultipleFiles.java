package bibleApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class MultipleFiles {


	private String folderPath;
	private File files;
	private ArrayList<String> text;
	private Scanner readFile;
	private String path;

	public static void main(String[] args) throws IOException
	{
		MultipleFiles x = new MultipleFiles("C:\\KJBible");
		x.readPath();
		x.readText();
		//x.readTextFile();
	}
	public MultipleFiles(String foldPath)
	{
		folderPath = foldPath;
		files = new File (folderPath);
		//ArrayList<String> text = new ArrayList<String>();
	}

	public String readPath() 
	{
		//File files = new File ("C:\\KJBible"); //shows path
		//1) inserts files in to an array
		File[] filed = files.listFiles(); //create an array filed and insert files names from listFiles
		//2) read each file //for loop
		//3) store each word in file into an array

		int i = 0;
		while(i < filed.length){
			//read folder, input path into array

			//System.out.println(filed[i]);
			path = (filed[i].toString());
			System.out.println(path);
			//folderPath = filed[i].toString();
			i++;
		}
		return path;
	}

	public void readText() throws FileNotFoundException
	{

		readFile = new Scanner (new File (path));
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





