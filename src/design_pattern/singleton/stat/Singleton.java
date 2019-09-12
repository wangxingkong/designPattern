package design_pattern.singleton.stat;

public class Singleton {

	private static Singleton instance=new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
	public String getDescription() {
		return "i am a singleton";
	}
}
