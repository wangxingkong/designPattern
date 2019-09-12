package design_pattern.templatemethod.simplebarista;

public class Tea {

	public void prepareRecipe() {
		boilWater();
		putTea();
		pourInCup();
		addEmotion();
	}
	
	private void pourInCup() {
		System.out.println("���뱭��");
	}
	
	private void addEmotion() {
		System.out.println("��������������ú�");
	}
	private void boilWater() {
		System.out.println("��ˮ��");
	}
	
	private void putTea() {
		System.out.println("�����Ҷ");
	}
	
}
