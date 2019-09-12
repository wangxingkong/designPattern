package design_pattern.command.party;

public class RemoteControl {

	
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		// TODO Auto-generated constructor stub
		onCommands=new Command[7];
		offCommands=new Command[7];
		Command noCommand=new NoCommad();
		for(int i=0;i<7;i++) {
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
		undoCommand=noCommand;
	}
	
	public void setCommand(int slot,Command onCommand,Command offComman) {
		onCommands[slot]=onCommand;
		offCommands[slot]=offComman;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand=onCommands[slot];
	}
	
	public void offBUttonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand=offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append("--------------remote control--------------");
		for(int i=0;i<onCommands.length;i++) {
			stringBuffer.append("slot="+i+"  "+onCommands[i].getClass().getName()+"    "+
		offCommands[i].getClass().getName());
			stringBuffer.append("undo"+undoCommand.getClass().getName());
		}
		return stringBuffer.toString();
	}
	
}
