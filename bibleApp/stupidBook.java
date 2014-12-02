package bibleApp;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class stupidBook
{
	public static void main(String[] args) 
	{

		//	String path = "C:\\KJBible"; 
		//String files;
		//File folder = new File(path);
		//File[] listOfFiles = folder.listFiles(); 

		for (int i = 0; i < listOfFiles.length; i++) 
		{
			if (listOfFiles[i].isFile()) 
			{
				files = listOfFiles[i].getName();
				if (files.endsWith(".txt") || files.endsWith(".TXT"))
				{
					System.out.println(files);

					ArrayList<String> frequencyMap = new ArrayList<String>();
					//TreeMap<String, Integer> frequencyMap = new TreeMap<String, Integer>(); 

					String currentLine="";

					File textFile = new File(folder.getAbsolutePath() + File.separator + files);
					try {
						BufferedReader br = new BufferedReader(new FileReader(textFile)); 

						while ((currentLine = br.readLine()) != null) 
						{ 
							//currentLine = currentLine.toLowerCase(); 
							StringTokenizer parser = new StringTokenizer(currentLine); 
							StringTokenizer parser = new StringTokenizer(currentLine, " \t\n\r\f.,;:!?'"); 

							/**while (parser.hasMoreTokens()) 
							{ 
								String currentWord = parser.nextToken(); 
								//Integer frequency = frequencyMap.get(currentWord); 
								//if (frequency == null) { 
									//frequency = 0; 
							}*/
							frequencyMap.add(currentLine);
							//frequencyMap.put(currentWord); 
						} 

						br.close(); 
					} catch (FileNotFoundException e) {
						System.out.println(e.getMessage());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(frequencyMap);
				}
			}
		}
	}
}