package design_pattern.adapter.chanllenge;

public class SuperDrone implements Drone{

	@Override
	public void beep() {
		// TODO Auto-generated method stub
		System.out.println("Beep beep beep");
	}

	@Override
	public void spin_rotors() {
		// TODO Auto-generated method stub
		System.out.println("robors are spining");
	}

	@Override
	public void take_off() {
		// TODO Auto-generated method stub
		System.out.println("taking off");
	}

}
