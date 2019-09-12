package design_pattern.singleton.dci;

public class Singlenton {

	private volatile static Singlenton uniqueInstance;
	
	private Singlenton() {}
	
	public static Singlenton getInstance() {
		if(uniqueInstance==null) {
			synchronized (Singlenton.class) {
				if(uniqueInstance==null)
					uniqueInstance=new Singlenton();
			}
		}
		return uniqueInstance;
	}
	
}
