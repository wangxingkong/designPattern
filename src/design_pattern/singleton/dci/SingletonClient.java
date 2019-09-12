package design_pattern.singleton.dci;

public class SingletonClient {

	public static void main(String[] args) {
		Singlenton singlenton=Singlenton.getInstance();
		System.out.println(singlenton);
	}
	
}
