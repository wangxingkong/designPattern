package design_pattern.facade.hometheater;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Amplifier amplifier=new Amplifier("��������õķŴ���");
		Tuner tuner=new Tuner("��������õ�tuner", amplifier);
		DvdPlayer dvdPlayer=new DvdPlayer("��������õ�dvd", amplifier);
		Projector projector=new Projector("��������õ�ͶӰ��", dvdPlayer);
		TheaterLights theaterLights=new TheaterLights("��������õ�ͶӰ��");
		Screen screen=new Screen("���Դ����ǵ���Ļ");
		PopcornPopper popper=new PopcornPopper("��������õ�Popper");
		CdPlayer cdPlayer=new CdPlayer("��������õ�cd", amplifier);
		HomeTheaterFacade facade=new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popper);
		facade.watchMovie("��������");
		facade.endMovie();
	}
	
}
