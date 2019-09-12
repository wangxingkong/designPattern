package design_pattern.facade.hometheater;

public class HomeTheaterFacade {

	Amplifier amplifier;
	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;
	Projector projector;
	TheaterLights theaterLights;
	Screen screen;
	PopcornPopper popper;
	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer,
			Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popper) {
		super();
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.theaterLights = theaterLights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		System.out.println("getting ready to watch a movie");
		popper.on();
		popper.pop();
		theaterLights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreeenMode();
		amplifier.on();
		amplifier.setDvd(dvdPlayer);
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}
	
	public void endMovie() {
		System.out.println("正在关闭放映");
		popper.off();
		theaterLights.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
	}
	
	
}
