package design_pattern.templatemethod.barista;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("将咖啡倒进咖啡杯里面去");
	}

	@Override
	void addCondinments() {
		// TODO Auto-generated method stub
		System.out.println("增加糖到咖啡杯里");
	}

}
