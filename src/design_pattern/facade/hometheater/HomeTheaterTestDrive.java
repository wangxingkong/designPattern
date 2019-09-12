package design_pattern.facade.hometheater;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Amplifier amplifier=new Amplifier("世界上最好的放大器");
		Tuner tuner=new Tuner("世界上最好的tuner", amplifier);
		DvdPlayer dvdPlayer=new DvdPlayer("世界上最好的dvd", amplifier);
		Projector projector=new Projector("世界上最好的投影仪", dvdPlayer);
		TheaterLights theaterLights=new TheaterLights("世界上最好的投影仪");
		Screen screen=new Screen("产自大三星的屏幕");
		PopcornPopper popper=new PopcornPopper("世界上最好的Popper");
		CdPlayer cdPlayer=new CdPlayer("世界上最好的cd", amplifier);
		HomeTheaterFacade facade=new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popper);
		facade.watchMovie("阿甘正传");
		facade.endMovie();
	}
	
}
