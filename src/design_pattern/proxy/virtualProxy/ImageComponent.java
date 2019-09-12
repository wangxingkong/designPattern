package design_pattern.proxy.virtualProxy;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

public class ImageComponent extends JComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Icon icon;
	
	public ImageComponent(Icon icon) {
		// TODO Auto-generated constructor stub
		this.icon=icon;
	}
	
	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		int w=icon.getIconWidth();
		int h=icon.getIconHeight();
		int x=(800-w)/2;
		int y=(600-h)/2;
		icon.paintIcon(this, graphics, x, y);
	}
	
	
}
