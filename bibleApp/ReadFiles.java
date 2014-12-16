package bibleApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Read files from external sources
 * 
 * @author 3Dots
 * 
 *
 */

public class ReadFiles{
	private File[] fileList;
	private File folder;
	private String path = "build\\classes\\KJBible";
        private int c = 0;

	public ReadFiles(){
		folder = new File(path);
	}
	
        
	/**
	 * Get the name of each file
	 * 
	 * @return File[]
	 */
	public File[] getFiles(){
		fileList = folder.listFiles();
		return fileList;
	}
	
	/**
	 * Get file contents
	 * 
	 * @param fileName the name of the file wanted
	 * 
	 * @return String file contents
	 * 
	 * @throws FileNotFoundException 
	 * 
	 * @exception FileNotFondException
	 * @exception IOException
	 * 
	 */
	
	public ArrayList<String> getFile(String fileName) throws FileNotFoundException, IOException{
		String currentLine ="";
		ArrayList<String> textHolder = new ArrayList<String>();
		File textFile = new File(folder.getAbsolutePath() + File.separator + fileName);
		//System.out.println(folder.getAbsolutePath() + File.separator + fileName);
		BufferedReader br = new BufferedReader(new FileReader(textFile));
			
		try{
			while((currentLine = br.readLine()) != null){

				textHolder.add(currentLine);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return textHolder;
	}
}



