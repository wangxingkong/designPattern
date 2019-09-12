package design_pattern.adapter.ducks;

import design_pattern.adapter.chanllenge.Drone;
import design_pattern.adapter.chanllenge.DroneAdapter;
import design_pattern.adapter.chanllenge.SuperDrone;

public class DuckTestDriver {

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	public static void main(String[] args) {
		MallardDuck mallardDuck=new MallardDuck();
		WildTurkey wildTurkey=new WildTurkey();
		Duck turkeyDuck=new TurkeyAdapter(wildTurkey);
		System.out.println("the turkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();
		System.out.println("turkeyAdapter says...");
		testDuck(turkeyDuck);
		System.out.println("the duck says...");
		testDuck(mallardDuck);
		Drone drone=new SuperDrone();
		Duck droneAdapter=new DroneAdapter(drone);
		testDuck(droneAdapter);
	}
}
