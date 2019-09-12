package design_pattern.adapter.chanllenge;

import design_pattern.adapter.ducks.Duck;

public class DroneAdapter implements Duck{

	Drone drone;
	
	public DroneAdapter(Drone drone) {
		// TODO Auto-generated constructor stub
		this.drone=drone;
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		drone.beep();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		drone.spin_rotors();
		drone.take_off();
	}

}
