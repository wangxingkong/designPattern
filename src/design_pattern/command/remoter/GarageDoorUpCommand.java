package design_pattern.command.remoter;


public class GarageDoorUpCommand implements design_pattern.command.party.Command{

	GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor) {
		// TODO Auto-generated constructor stub
		this.garageDoor=garageDoor;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.up();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	


}
