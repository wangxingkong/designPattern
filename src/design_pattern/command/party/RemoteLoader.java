package design_pattern.command.party;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl=new RemoteControl();
		Light light=new Light("living room");
		TV tv=new TV("living room");
		Stereo stereo=new Stereo("living room");
		Hottub hottub=new Hottub();
		
		LightOnComman lightOnComman=new LightOnComman(light);
		StereoOnCommand stereoOnCommand=new StereoOnCommand(stereo);
		TVOnCommand tvOnCommand=new TVOnCommand(tv);
		HottubOnCommand hottubOnCommand=new HottubOnCommand(hottub);
		LightOffCommand lightOffCommand=new LightOffCommand(light);
		StereoOffCommand stereoOffCommand=new StereoOffCommand(stereo);
		TVOffCommand tvOffCommand=new TVOffCommand(tv);
		HottubOffComman hottubOffComman=new HottubOffComman(hottub);
		
		Command[] partyOn= {lightOnComman,stereoOnCommand,tvOnCommand,hottubOnCommand};
		Command[] partyOff= {lightOffCommand,stereoOffCommand,tvOffCommand,hottubOffComman};
		
		MacroComman partyOnMacro=new MacroComman(partyOn);
		MacroComman partyOffMacro=new MacroComman(partyOff);
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
	}
	
}
