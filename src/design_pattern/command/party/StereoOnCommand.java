package design_pattern.command.party;

public class StereoOnCommand implements Command{

	Stereo stereo;
	
	public StereoOnCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo=stereo;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.off();
	}

}
