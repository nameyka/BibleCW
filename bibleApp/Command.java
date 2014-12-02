
public class Command {

	private String commandWord;
	


	public Command(String aCommand){
		
		
		commandWord = aCommand;

	}

	public String toString()
	{
		return " ";
	}
	
	
	public String getCommand()
	{
		return commandWord;
	}
	
	public boolean unknownCommand()
	{
		return (commandWord != null);
	}

}
