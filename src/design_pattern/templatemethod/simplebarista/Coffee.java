package design_pattern.templatemethod.simplebarista;

public class Coffee {

	void  prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("��������������ˮ");
	}
	
	private void brewCoffeeGrinds() {
		System.out.println("�����ȱ���ӻ����");
	}
	private void pourInCup() {
		System.out.println("����õĶ�������������");
	}
	private void addSugarAndMilk() {
		System.out.println("���������������Ǻ�ţ��");
	}
}
