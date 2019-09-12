package design_pattern.singleton.classic;

public class Singleton {

	private static Singleton uniqueInstance;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		if(uniqueInstance==null) {
		uniqueInstance=new Singleton();
		}
		return uniqueInstance;
	}
	
	public String getDescription() {
		return "����һ������ĵ�������";
	}
	
}
