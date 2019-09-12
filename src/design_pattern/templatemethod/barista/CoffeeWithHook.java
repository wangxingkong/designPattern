package design_pattern.templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("倒最好的咖啡到最好的咖啡杯里");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("增加花生米到咖啡杯里");
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
		System.out.println("请输入你的答案");
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
