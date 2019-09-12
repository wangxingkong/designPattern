package design_pattern.singleton.subclass;

public class CoolerSingleton extends Singleton{

	protected static Singleton instance;
	
	private  CoolerSingleton() {
		super();
	}
	
}
