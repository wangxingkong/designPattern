package design_pattern.command.remoter;

import design_pattern.command.party.CeilingFan;
import design_pattern.command.party.Light;
import design_pattern.command.party.LightOffCommand;
import design_pattern.command.party.LightOnComman;
import design_pattern.command.party.RemoteControl;
import design_pattern.command.party.Stereo;
import design_pattern.command.party.StereoOffCommand;
import design_pattern.command.party.StereoOnWithCDCommand;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl=new RemoteControl();
		
		Light light=new Light("living room");
		Light kitchenLight=new Light("kitchen");
		CeilingFan ceilingFan=new CeilingFan("living room");
		GarageDoor garageDoor=new GarageDoor("");
		Stereo stereo=new Stereo("living room");
		
		LightOffCommand lightOffCommand=new LightOffCommand(light);
		LightOnComman lightOnComman=new LightOnComman(light);
		LightOnComman kitchOnCommand=new LightOnComman(kitchenLight);
		LightOffCommand kitchOffCommand=new LightOffCommand(kitchenLight);
		GarageDoorDownCommand garageDoorDownCommand=new GarageDoorDownCommand(garageDoor);
		GarageDoorUpCommand garageDoorUpCommand=new GarageDoorUpCommand(garageDoor);
		StereoOnWithCDCommand stereoOnWithCDCommand=new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand=new StereoOffCommand(stereo);
		remoteControl.setCommand(0, lightOnComman, lightOffCommand);
		remoteControl.setCommand(1, kitchOnCommand, kitchOffCommand);
		remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offBUttonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offBUttonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offBUttonWasPushed(2);
	}
	
}
