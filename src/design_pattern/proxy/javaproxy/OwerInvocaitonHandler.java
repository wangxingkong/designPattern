package design_pattern.proxy.javaproxy;

import java.lang.annotation.Retention;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwerInvocaitonHandler implements InvocationHandler {

	PersonBean person;
	
	public OwerInvocaitonHandler(PersonBean person) {
		// TODO Auto-generated constructor stub
		this.person=person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
			if(method.getName().startsWith("get"))
			return method.invoke(person, args);
			else if(method.getName().equals("setHotOrNotRating"))
//				return method.invoke(person, args)
				throw new IllegalAccessException();
			else if(method.getName().startsWith("set"))
				 return method.invoke(person, args);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return person;
	}

}
