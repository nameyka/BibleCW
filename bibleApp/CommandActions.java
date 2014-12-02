
public class CommandActions 
{

	private static final String[] acceptedCommands =  {"Search,","Goto","Select","Print","Quit"};


	public boolean isCommand(String aWord)
	{
		for(int i = 0; i < acceptedCommands.length; i++) {
			if(acceptedCommands[i].equals(aWord))
			return true;
		}
		return false;
	}
	public String getCommandList()
	{
		String cmdHelp = "Please use the following command: ";
		for (int i = 0 ; i < acceptedCommands.length; i++){

			cmdHelp += acceptedCommands[i]+ " ";
		}
		return cmdHelp;
	}
	


}


