package design_pattern.command.remoter;

import design_pattern.command.remoter.Command;

public class GarageDoorDownCommand implements Command{

	GarageDoor garageDoor;
	
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		// TODO Auto-generated constructor stub
		this.garageDoor=garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.down();
	}


}
