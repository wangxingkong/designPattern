package design_pattern.proxy.javaproxy;

public class PersonBeanImpl implements PersonBean{

	String name;
	String gender;
	String interestes;
	int rating;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getInterests() {
		// TODO Auto-generated method stub
		return interestes;
	}

	@Override
	public int getHotOrNotRating() {
		// TODO Auto-generated method stub
		if(ratingCount==0) return 0;
		return (rating/ratingCount);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender=gender;
	}

	@Override
	public void setInterests(String interests) {
		// TODO Auto-generated method stub
		this.interestes=interests;
	}

	int ratingCount=0;
	@Override
	public void setHotOrNotRating(int rating) {
		// TODO Auto-generated method stub
		this.rating+=rating;
		ratingCount++;
//		this.rating=rating;
	}

}
