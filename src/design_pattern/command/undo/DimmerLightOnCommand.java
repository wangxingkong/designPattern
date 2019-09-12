package design_pattern.command.undo;

import design_pattern.command.party.Command;
import design_pattern.command.party.Light;

public class DimmerLightOnCommand implements Command{

	Light light;
	int prelevel;
	
	public DimmerLightOnCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light=light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prelevel=light.getLevel();
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.dim(prelevel);
	}

}
