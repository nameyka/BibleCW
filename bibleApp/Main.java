package bibleApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import collections.Collection;


public class Main {
	//private Collection[] books;
	//private Command commands;

	public static void main(String args[]) {

		try {
			Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec("cmd /c dir");
			//Process pr = rt.exec("F:\\helloworld.exe");
			

			BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

			String line=null;

			while((line=input.readLine()) != null) {
				System.out.println(line);
			}

			int exitVal = pr.waitFor();
			System.out.println("Exited with error code "+exitVal);

		} catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
        private void printWelcome()
	{
		System.out.println();
		System.out.println("Welcome to the BibleApp");
		System.out.println("The BibleApp allows you search through the bible, allowing you to read through verses");
		System.out.println("Type 'help' if you need help.");
		System.out.println();
		// now need to print the description of the player's location
		// System.out.println(currentRoom.getLongDescription());
		System.out.println(player.getLocation().getLongDescription());
	}
	private boolean processCommand(Command command) 
	{
		boolean wantToQuit = false;

		if(command.isUnknown()) {
			System.out.println("Command is not reconised, please insert another command");
			return false;
		}

		String commandWord = command.getCommandWord();
		if (commandWord.equals("help")) {
			printHelp();
		}
		else if (commandWord.equals("go")) {
			goRoom(command);
		}
		else if (commandWord.equals("quit")) {
			wantToQuit = quit(command);
		}
		// else command not recognised.
		return wantToQuit;
	}
	private void printHelp() 
	{
		System.out.println("You are lost. You are alone. You wander");
		System.out.println("around at the university.");
		System.out.println();
		System.out.println("Your command words are:");
		parser.showCommands();
	}

	private boolean quit(Command command) 
	{
		if(command.hasSecondWord()) {
			System.out.println("Quit what?");
			return false;
		}
		else {
			return true;  // signal that we want to quit
		}
	}

}

        
}

