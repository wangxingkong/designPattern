package design_pattern.command.simpleremote;

import design_pattern.command.party.Light;
import design_pattern.command.party.LightOnComman;
import design_pattern.command.remoter.GarageDoor;
import design_pattern.command.remoter.GarageDoorUpCommand;

public class RemoteControlerTest {

	public static void main(String[] args) {
		SimpleRemoteControl remoteControl=new SimpleRemoteControl();
		Light light=new Light("");
		GarageDoor garageDoor=new GarageDoor("");
		LightOnComman lightOnComman=new LightOnComman(light);
		GarageDoorUpCommand garageDoorUpCommand=new GarageDoorUpCommand(garageDoor);
		remoteControl.setSlot(lightOnComman);
		remoteControl.buttonWasPressed();
		remoteControl.setSlot(garageDoorUpCommand);
		remoteControl.buttonWasPressed();
	}
	
}
