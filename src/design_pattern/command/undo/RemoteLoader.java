package design_pattern.command.undo;

import design_pattern.command.party.Light;
import design_pattern.command.party.LightOffCommand;
import design_pattern.command.party.LightOnComman;
import design_pattern.command.party.RemoteControl;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControleWithUndo remoteControleWithUndo=new RemoteControleWithUndo();
		Light light=new Light("living room");
		LightOnComman livingRoomLightOn=new LightOnComman(light);
		LightOffCommand livingRoomLightOff=new LightOffCommand(light);
		remoteControleWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControleWithUndo.onButtonWasPushed(0);
		remoteControleWithUndo.offButtonWasPushed(0);
		System.out.println(remoteControleWithUndo);
		remoteControleWithUndo.undoButtonWasPushed();
		remoteControleWithUndo.offButtonWasPushed(0);
		remoteControleWithUndo.onButtonWasPushed(0);
		System.out.println(remoteControleWithUndo);
		remoteControleWithUndo.undoButtonWasPushed();
		
		
		
	}
	
}
