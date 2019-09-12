package design_pattern.state.gumball;

public class GumbalMachineTestDrive {

	public static void main(String[] args) {
		GumbalMachine machine=new GumbalMachine();
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.ejectQuarter();
		machine.insertQuarter();
		machine.turnCrank();
	}
	
}
