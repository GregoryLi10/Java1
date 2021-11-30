package arrays;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FallingBlocks extends JPanel {
	
	private int WIDTH = 800, HEIGHT = 600, NUMBLOCKS = 100, DIAM=10;
	private int minvy=2, maxvy=10, r, gr, b;
	
	private int[]xValues=new int[NUMBLOCKS];
	private int[]yValues=new int[NUMBLOCKS];
	private int[]vyValues=new int[NUMBLOCKS];	
	private Color[]colors=new Color[NUMBLOCKS];

	public void initializeArrays() {
		for (int i=0; i<NUMBLOCKS; i++) {
			xValues[i]=(int)(Math.random()*(WIDTH-DIAM));
			vyValues[i]=(int)(Math.random()*maxvy+minvy);
			colors[i]=new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		}
	}
	
	public void moveblocks() {
		for (int i=0; i<NUMBLOCKS; i++) {
			yValues[i]+=vyValues[i]; 
			if (yValues[i]>HEIGHT) {
				yValues[i]=0;
				xValues[i]=(int)(Math.random()*(WIDTH-DIAM));
				vyValues[i]=(int)(Math.random()*maxvy+minvy);
			}
		}
	}
	
	public void paint(Graphics g) {
		// give a white background
		g.setColor(Color.white);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		for (int i=0;i<NUMBLOCKS;i++) {
			g.setColor(colors[i]);
			g.fillRect(xValues[i], yValues[i], DIAM, DIAM);
		}
	}
	
	// ******** DON'T TOUCH BELOW CODE ***************
	
	// don't touch this method!
	public FallingBlocks() {
		initializeArrays();
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setVisible(true);

		while (true) {
			moveblocks();
			repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			WIDTH = frame.getSize().width;
			HEIGHT = frame.getSize().height;
		}
	}

	// don't touch this method!
	public static void main(String[] args) {
		new FallingBlocks();
	}

}