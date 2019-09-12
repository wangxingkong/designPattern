package design_pattern.adapter.ducks;

public class TurkeyTestDrive {

	public static void main(String[] args) {
		MallardDuck duck=new MallardDuck();
		Turkey duckAdapter=new DuckAdapter(duck);
		for(int i=0;i<100;i++) {
			System.out.println("the duckadapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
	
}
