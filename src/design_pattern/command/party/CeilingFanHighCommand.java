package design_pattern.command.party;

public class CeilingFanHighCommand implements Command{

	CeilingFan ceilingFan;
	int preSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan=ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		preSpeed=ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		switch (preSpeed) {
		case CeilingFan.HIGH:
			ceilingFan.high();
			break;
		case CeilingFan.MEDIAN:
			ceilingFan.median();
			break;
		case CeilingFan.LOW:
			ceilingFan.low();
			break;
		default:
			ceilingFan.off();
			break;
		}
	}

}
