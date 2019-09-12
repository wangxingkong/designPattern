package design_pattern.singleton.subclass;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton fSingleton=CoolerSingleton.getInstance();
		Singleton hsSingleton=HotterSingleton.getInstance();
		System.out.println(fSingleton);
		System.out.println(hsSingleton);
	}
	
}
