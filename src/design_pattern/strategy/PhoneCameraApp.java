package design_pattern.strategy;

public abstract class PhoneCameraApp {

	ShareStrategy shareStrategy;
	
	public void setShareStrategy(ShareStrategy shareStrategy) {
		this.shareStrategy = shareStrategy;
	}
	
	public void share() {
		shareStrategy.share();
	}
	
	public void take() {
		System.out.println("taking  the photo");
	}
	
	public void save() {
		System.out.println("saving the photo");
	}
	
	public abstract void edit();
	
}
