package design_pattern.proxy.javaproxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

import javax.jws.Oneway;
import javax.swing.text.AbstractDocument.LeafElement;

public class MatchMakingTestDrive {

	HashMap<String, PersonBean> map=new HashMap<>();
	
	public static void main(String[] args) {
		MatchMakingTestDrive testDrive=new MatchMakingTestDrive();
		testDrive.driver();
	}
	
	public MatchMakingTestDrive() {
		// TODO Auto-generated constructor stub
		initDataBase();
	}
	
	private void initDataBase() {
		// TODO Auto-generated method stub
		PersonBean joe=new PersonBeanImpl();
		joe.setName("joe");
		joe.setInterests("�ܲ�");
		joe.setHotOrNotRating(7);
		map.put(joe.getName(), joe);
		
		PersonBean kelly=new PersonBeanImpl();
		kelly.setName("kelly");
		kelly.setInterests("��ɽ");
		kelly.setHotOrNotRating(6);
		map.put(kelly.getName(), kelly);
	}

	public  void driver() {
		PersonBean joe=getPersonFromDataBase("joe");
		System.out.println(joe);
		PersonBean ownerProxy=getOwnerProxy(joe);
		System.out.println("��ownerproxy�õ���������"+ownerProxy.getName());
		ownerProxy.setInterests("����ͨ��innvocationhandler���õ�");
		ownerProxy.setHotOrNotRating(23);
		PersonBean nonOwerProxy=getNonOwnerProxy(joe);
		System.out.println("��nonownerProxy�õ���������"+nonOwerProxy.getName());
		nonOwerProxy.setName("hhh");
	}

	private PersonBean getNonOwnerProxy(PersonBean joe) {
		// TODO Auto-generated method stub
		return (PersonBean) Proxy.newProxyInstance(joe.getClass().getClassLoader(), joe.getClass().getInterfaces(), new NonOwnerInvocationHandler(joe));
	}

	private PersonBean getOwnerProxy(PersonBean joe) {
		// TODO Auto-generated method stub
		return (PersonBean) Proxy.newProxyInstance(joe.getClass().getClassLoader(),
				joe.getClass().getInterfaces(), new OwerInvocaitonHandler(joe));
	}

	private PersonBean getPersonFromDataBase(String string) {
		// TODO Auto-generated method stub
		return map.get(string);
	}
	
}
