package design_pattern.factory.pizzaaf;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("cutting the pizza into slices");
	}
	
	void box() {
		System.out.println("place pizza in box");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append("----------------"+name+"-------------------\n");
		if(dough!=null) {
			stringBuffer.append(dough+"\n");
		}
		if(sauce!=null)
			stringBuffer.append(sauce+"\n");
		if(cheese!=null)
			stringBuffer.append(cheese+"\n");
		if(veggies!=null) {
			for(int i=0;i<veggies.length;i++) {
				stringBuffer.append(veggies[i]+"\n");
			}
		}
		
		if(clams!=null)
			stringBuffer.append(clams+"\n");
		if(pepperoni!=null)
			stringBuffer.append(pepperoni+"\n");
		return stringBuffer.toString();
	}
}
