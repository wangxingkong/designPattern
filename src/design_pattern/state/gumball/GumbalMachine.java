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
			System.out.println("�㲻�ܲ�����");
		}else if(state==NO_QUARTER) {
			System.out.println("���Ѿ�������");
			state=HAS_QUARTER;
		}else if(state==SOLD_OUT) {
			System.out.println("�Ѿ�������");
		}else if(state==SOLD){
			System.out.println("��ϲ�㼴������ǹ�");
		}
	}
	
	public void ejectQuarter() {
		if(state==SOLD) {
			System.out.println("��Ǹ����Ķ����Ѿ�����ģ�");
		}else if(state==SOLD_OUT) {
			System.out.println("�Ѿ������ˣ�");
		}else if(state==HAS_QUARTER) {
			System.out.println("��ã���Ľ���Ѿ��³��ˣ���ע�����");
			state=NO_QUARTER;
		}else if(state==NO_QUARTER) {
			System.out.println("��Ǹ����û�зŽ��");
		}
	}
	
	
	public void turnCrank() {
		if(state==SOLD) {
			System.out.println("��Ǹ�����Ž��");
		}else if(state==SOLD_OUT) {
			System.out.println("��Ǹ���Ѿ������ˣ����´�����");
		}else if(state==HAS_QUARTER) {
			System.out.println("��Ҫ���ǹ���������");
			state=SOLD;
		}else if(state==NO_QUARTER) {
			System.out.println("��û�д�Ž�ң����в��ܸ����˿�");
		}
	}
	
}
