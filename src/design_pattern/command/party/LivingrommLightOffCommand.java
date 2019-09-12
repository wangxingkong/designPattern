package design_pattern.command.party;

public class LivingrommLightOffCommand implements Command{

	Light light;
	
	public LivingrommLightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light=light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}
