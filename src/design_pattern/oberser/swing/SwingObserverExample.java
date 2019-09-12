package design_pattern.oberser.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

	JFrame jFrame;
	
	public void go() {
		jFrame=new JFrame();
		JButton jButton=new JButton("should i do it");
		jButton.addActionListener(event->System.out.println("do not do it,you might regret it"));
		jButton.addActionListener(event->System.out.println("come on,do it"));
		jFrame.getContentPane().add(BorderLayout.CENTER,jButton);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.getContentPane().add(BorderLayout.CENTER,jButton);
		jFrame.setSize(300,300);
		jFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingObserverExample example=new SwingObserverExample();
		example.go();
	}
	
}
