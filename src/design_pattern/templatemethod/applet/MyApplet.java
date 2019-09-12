package design_pattern.templatemethod.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public void init() {
		message="hello world,i am alive!";
		repaint();
	}
	
	public void start() {
		message="hello world, i am starting";
		repaint();
	}
	
	public void stop() {
		message="hello world, i am stopping";
		repaint();
	}
	
	public void destroy() {
		message="hello world, i am destroy";
		repaint();
	}
	
	public void paint(Graphics graphics) {
		graphics.drawString(message, 5, 15);
	}
}
