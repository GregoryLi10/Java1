// filler code for pong provided by Mr. David

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicalLoops extends JPanel {
	
	// constants that are predefined and won't change as the program runs
	private final int WIDTH = 1000, HEIGHT = 590;

	
	public void nCircles(Graphics g, int n) {
		int x=100, y=500, diam=30;
		for (int t=0; t<n; t++) {
			g.setColor(Color.black);
			g.fillOval(x, y, diam, diam);
			g.drawOval(x, y, diam, diam);
			x+=diam;
		}
	}
	
	public void circles(Graphics g) {
		int x=0, y=HEIGHT/2, diam=10;
		while(x<WIDTH) {
			y=HEIGHT/2-diam/2;
			g.fillOval(x, y, diam, diam);
			g.drawOval(x, y, diam, diam);
			x+=diam;
			if (x+diam/2<WIDTH/2) {
				diam+=10;
			}
			else {
				diam-=10;
				if(diam<10) {
					break;
				}
			}
		}
	}
	
	public void tenx10(Graphics g) {
		int x=500, y=0, diam=10;
		for (int t1=0; t1<10; t1++) {
			for (int t=0; t<10; t++) {
				g.fillOval(x, y, diam, diam);
				g.drawOval(x, y, diam, diam);
				x+=diam;
			}
			y+=diam;
			x=500;
		}
	}
	
	public void checker(Graphics g) {
		int x=0, y=0, diam=20;
		for (int t1=0; t1<8; t1++) {
			for (int t=0; t<4; t++) {
				if (t1%2==0){
					g.fillRect(x, y, diam, diam);
					g.drawRect(x, y, diam, diam);
					x+=diam;
					g.drawRect(x, y, diam, diam);
					x+=diam;
				}
				else {
					g.drawRect(x, y, diam, diam);
					x+=diam;
					g.fillRect(x, y, diam, diam);
					g.drawRect(x, y, diam, diam);
					x+=diam;
				}
			}
			y+=diam;
			x=0;
		}
	}
	
	public void rectColor(Graphics g) {
		int x=700, y=500, diam=50;
		for (int t=0; t<3; t++) {
			if(t%3==0) {
				g.setColor(Color.magenta);
			}
			else if(t%3==1) {
				g.setColor(Color.blue);
			}
			else {
				g.setColor(Color.green);
			}
			g.fillRect(x, y, 2*diam, diam);
			g.drawRect(x, y, 2*diam, diam);
			x+=2*diam;
		}
	}
	
	public void cycle(Graphics g) {
		int diam=50, x=850, y=50;
		g.setColor(Color.black);;
		for (int t=0; t<20; t++) {
			if(t%3==0) {
				g.drawOval(x, y, diam, diam);
			}
			else if(t%3==1) {
				g.drawRect(x, y, diam, diam);
			}
			else {
				int [] x1 = {875,925,825};
		        int [] y1 = {0,100,100};
		        g.drawPolygon(x1, y1, 3);
			}
		}
	}
	
	// defines what we want to happen anytime we draw the graphics
	public void paint(Graphics g) {
		
		// background color is gray
		g.setColor(Color.white);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.black);
		nCircles(g, 5);
		circles(g);
		tenx10(g);
		checker(g);
		rectColor(g);
		cycle(g);
	}

	//////////////////////////////////////
	//////////////////////////////////////
	
	// DON'T TOUCH THE BELOW CODE
	
	
	// this method runs the actual program.
	public void run() {

		// while(true) should rarely be used to avoid infinite loops, but here it is ok because
		// closing the graphics window will end the program
		while (true) {
	
			// draws
			//repaint();
			
			//rests for a hundredth of a second
			try {
				Thread.sleep(10);
			} catch (Exception ex) {}
		}
	}
	
	// very simple main method to get the game going
	public static void main(String[] args) {
		new GraphicalLoops();
		
	}
 
	// does complicated stuff to initialize the graphics and key listeners
	// DO NOT CHANGE THIS CODE UNLESS YOU ARE EXPERIENCED WITH JAVA
	// GRAPHICS!
	public GraphicalLoops() {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		this.setFocusable(true);
		
		run();
	}
}