package design_pattern.command.party;

public class HottubOffComman implements Command{

	Hottub hottub;
	
	public HottubOffComman(Hottub hottub) {
		// TODO Auto-generated constructor stub
		this.hottub=hottub;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		hottub.setTemperature(98);
		hottub.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		hottub.on();
	}

}
