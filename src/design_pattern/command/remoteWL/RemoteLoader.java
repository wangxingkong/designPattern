package design_pattern.command.remoteWL;

import design_pattern.command.party.CeilingFan;
import design_pattern.command.party.Light;
import design_pattern.command.party.RemoteControl;
import design_pattern.command.remoter.GarageDoor;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl=new RemoteControl();
		Light light=new Light("living room");
		Light kitchenLight=new Light("kitchen");
		CeilingFan ceilingFan=new CeilingFan("living room");
		GarageDoor garageDoor=new GarageDoor("main house");
		
//		remoteControl.setCommand(0, light::on, light::off);
		
	}
	
}
