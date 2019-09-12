package design_pattern.command.party;

public class HottubOnCommand implements Command{

	Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		// TODO Auto-generated constructor stub
		this.hottub=hottub;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		hottub.off();
	}

}
