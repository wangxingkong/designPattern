package design_pattern.singleton.chocolate;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler() {
		// TODO Auto-generated constructor stub
		empty=true;
		boiled=false;
	}
	
	public static ChocolateBoiler getInstance() {
		if(uniqueInstance==null) {
			System.out.println("�������ȼ�������������");
			uniqueInstance=new ChocolateBoiler();
		}
		System.out.println("���ص�������");
		return uniqueInstance;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty=false;
			boiled=false;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public void boil() {
		if(!isEmpty()&&!isBoiled()) {
			boiled=true;
		}
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	public void drain() {
		if(!isEmpty()&&isBoiled())
			empty=true;
	}
	
}
