package design_pattern.strategy;

import java.util.Scanner;

public class PhotoWithPhone {

	public static void main(String[] args) {
		PhoneCameraApp cameraApp=new BasicCameraApp();
		String share=getString();
		switch (share) {
		case("t"):
			cameraApp.setShareStrategy(new Txt());
			break;
		case("e"):cameraApp.setShareStrategy(new Email());break;
		case("s"):cameraApp.setShareStrategy(new Social());break;
		default:cameraApp.setShareStrategy(new Txt());break;
		}
		cameraApp.take();
		cameraApp.edit();
		cameraApp.save();
		cameraApp.share();
	}
	
	public static String getString() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Share with txt(t),email(e), or social media (s)?");
		String appName=scanner.next();
		scanner.close();
		return appName;
	}
}
