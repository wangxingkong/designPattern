package design_pattern.command.party;

public class LightOnComman implements Command{

	Light light;
	
	public LightOnComman(Light light) {
		// TODO Auto-generated constructor stub
		this.light=light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}

}
