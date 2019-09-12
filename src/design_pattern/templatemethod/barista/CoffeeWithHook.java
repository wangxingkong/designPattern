package design_pattern.templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("����õĿ��ȵ���õĿ��ȱ���");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("���ӻ����׵����ȱ���");
	}

	@Override
	public boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		String answer=getUserInput();
		if(answer.toLowerCase().startsWith("y"))
			return true;
		else 
			return false;
	}

	private String getUserInput() {
		// TODO Auto-generated method stub
		String answer=null;
		System.out.println("��������Ĵ�");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try {
			answer=in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return answer;
	}
}
