package bibleApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.StringTokenizer;
//something
/**
 * 
 * @author Hayley
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
	
        /*public ReadFiles ReadFiles(String path){
            folder = new File(path);
            return this;
        }*/
        
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

				//StringTokenizer parser = new StringTokenizer(currentLine); 
				/*StringTokenizer parser = new StringTokenizer(currentLine, " \t\n\r\f.,;:!?'");

				while (parser.hasMoreTokens()){
					String currentWord = parser.nextToken(); 
				}*/
				//	log(line);
				textHolder.add(currentLine);
                                //System.out.println(currentLine + ": "+ c++);
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
    /*public static void main(String[] args) throws FileNotFoundException {
        ReadFiles rf = new ReadFiles();
        System.out.println(rf.getFile("1John.txt").get(0));
    }*/

}



