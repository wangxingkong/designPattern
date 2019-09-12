package design_pattern.singleton.chocolate;

public class ChocolateController {

	public static void main(String[] args) {
		ChocolateBoiler boiler=ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();
	}
	
}
