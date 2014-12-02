package bibleApp;

import java.util.Scanner;

public class CommandInput {

	public static void main(String[] args) {
	 
		Scanner inComm = new Scanner(System.in);
		
		System.out.println("Please input command: ");
		
		String comm1 = inComm.nextLine();
		
		System.out.println(comm1);
		
		}
}
