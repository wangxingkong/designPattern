package design_pattern.templatemethod.barista;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("�����ȵ������ȱ�����ȥ");
	}

	@Override
	void addCondinments() {
		// TODO Auto-generated method stub
		System.out.println("�����ǵ����ȱ���");
	}

}
