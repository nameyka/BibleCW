import java.util.Scanner;


public class commandReader {

	private CommandActions commands;
	private Scanner read;


	public commandReader()
	{
		read = new Scanner(System.in);
		commands = new CommandActions();
	}

	public Command getCommandIn()
	{
		String input;
		String comWord = null;
		System.out.println("Please type your command");
		input = read.nextLine();
		if(commands.isCommand(input))
		{
			return new Command(comWord);
		}
		else 
		{
			return new Command(null); 
		}

		public void showAllCommands()
		{
			commands.showAll();
		}
	}

}