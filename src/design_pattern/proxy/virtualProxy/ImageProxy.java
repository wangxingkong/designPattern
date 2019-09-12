package design_pattern.proxy.virtualProxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon{

	volatile ImageIcon imageIcon;
	final URL imageUrl;
	Thread retrievalThread;
	boolean retrieving=false;
	
	public ImageProxy(URL url) {
		// TODO Auto-generated constructor stub
		this.imageUrl=url;
	}
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		if(imageIcon!=null) {
			imageIcon.paintIcon(c, g, x, y);
		}else {
			g.drawString("ÕýÔÚ¼ÓÔØ.....", x+300, y+100);
			if(!retrieving) {
				retrieving=true;
				retrievalThread=new Thread(()->{
					try {
						setImageIcon(new ImageIcon(imageUrl,"cd cover"));
						c.repaint();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				});
				retrievalThread.start();
			}
		}
	}

	synchronized void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
	
	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		if(imageIcon!=null)
			return imageIcon.getIconWidth();
		return 800;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		if(imageIcon!=null)
			return imageIcon.getIconHeight();
		return 600;
	}

}
