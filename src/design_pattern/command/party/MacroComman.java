package design_pattern.command.party;

public class MacroComman implements Command {

	Command[] commands;
	
	public MacroComman(Command[] commands) {
		// TODO Auto-generated constructor stub
		this.commands=commands;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(int i=0;i<commands.length;i++)
			commands[i].execute();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for(int i=0;i<commands.length;i++)
			commands[i].undo();
	}

}
