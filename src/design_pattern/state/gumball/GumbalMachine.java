package design_pattern.state.gumball;

public class GumbalMachine {

	final static int SOLD_OUT=0;
	final static int NO_QUARTER=1;
	final static int HAS_QUARTER=2;
	final static int SOLD=3;
	
	int state=NO_QUARTER;
	int count=0;
	
	public GumbalMachine() {
		// TODO Auto-generated constructor stub
		this.count=count;
		if(count>0)
			state=NO_QUARTER;
	}
	
	public void insertQuarter() {
		if(state==HAS_QUARTER) {
			System.out.println("你不能插入金币");
		}else if(state==NO_QUARTER) {
			System.out.println("你已经插入金币");
			state=HAS_QUARTER;
		}else if(state==SOLD_OUT) {
			System.out.println("已经卖光了");
		}else if(state==SOLD){
			System.out.println("恭喜你即将获得糖果");
		}
	}
	
	public void ejectQuarter() {
		if(state==SOLD) {
			System.out.println("抱歉，你的东西已经给你的，");
		}else if(state==SOLD_OUT) {
			System.out.println("已经卖光了，");
		}else if(state==HAS_QUARTER) {
			System.out.println("你好，你的金币已经吐出了，请注意查收");
			state=NO_QUARTER;
		}else if(state==NO_QUARTER) {
			System.out.println("抱歉，你没有放金币");
		}
	}
	
	
	public void turnCrank() {
		if(state==SOLD) {
			System.out.println("抱歉，请存放金币");
		}else if(state==SOLD_OUT) {
			System.out.println("抱歉，已经卖光了，请下次再来");
		}else if(state==HAS_QUARTER) {
			System.out.println("你要的糖果即将出来");
			state=SOLD;
		}else if(state==NO_QUARTER) {
			System.out.println("你没有存放金币，所有不能给你退款");
		}
	}
	
}
