package design_pattern.command.simpleremote;

import design_pattern.command.party.Command;

public class SimpleRemoteControl {

	Command slot;
	
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void setSlot(Command slot) {
		this.slot = slot;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
	
}
