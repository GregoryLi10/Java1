// Filler code for Whack a Mole by Mr. Friedman
// Name: Gregory Li
// Special features: TIMESTEP slider, customize NUMAPPEARING with buttons, add score if all moles are clicked between timesteps
//Magic numbers? 132, 188, +1s, 

package arrays;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class WhackAMole {

	// size of the display area
    private int windowWidth = 800, windowHeight = 600, textHeight = 50; 
    
    private Image bgImg, dirtImg, moleImg;

    // constants for the number of moles, number of moles appearing at a time, and the 
    // time gap between new moles popping up (in milliseconds)
    private int NUMMOLES = 10, NUMAPPEARING = 10, TIMESTEP = 2000;
    
    private int[] x=new int[NUMMOLES], y=new int[NUMMOLES], buttonsA=new int[NUMMOLES];	//arrays for mole locations and "button" x coords
    private boolean[] showing=new boolean [NUMMOLES], slotA=new boolean[NUMMOLES+1];	//boolean arrays to keep track of which moles appear and which "button" is pressed
    
    private int score, diamx=windowWidth/10, diamy=windowHeight/10, grass=(int)(windowHeight/2.5), swidth; //integers for score, image diameters, border of mole spawns, and "button" width
    
    private Timer timer1; //declare timer
    private JSlider timeSlider; //declare slider
    
    public void setup() {
    	// loads your 3 images - all you need to do is match file names.
		moleImg = Toolkit.getDefaultToolkit().getImage("diglett.png");
		bgImg = Toolkit.getDefaultToolkit().getImage("background.png");
		dirtImg = Toolkit.getDefaultToolkit().getImage("dirt.png");
		
		//randomizes mole locations and spaces out the "buttons"
		for (int i=0; i<NUMMOLES; i++) {
			x[i]=(int) (Math.random()*(windowWidth-diamx));
			y[i]=(int) (Math.random()*(grass-diamy*2)+(windowHeight-grass));
			buttonsA[i]=windowWidth/20+(((windowWidth-windowWidth/10)/(buttonsA.length))*i+1);
		}
		
		//sets the button of the current number of moles appearing to be highlighted
		slotA[NUMAPPEARING-1]=true;
		//resets all values according to the window width and height
		swidth=windowWidth/20;
		diamx=windowWidth/10;
		diamy=windowHeight/10;
		grass=(int)(windowHeight/2.5);
		
		//chooses random moles to appear up to the number NUMAPPEARING
		int c=0; //counter
    	while (c<NUMAPPEARING) { //runs while the counter is below NUMAPPEARING 
    		int i=(int) (Math.random()*(NUMMOLES));
    		showing[i]=true;
    		c=0; //resets counter every loop
    		for (int k=0; k<NUMMOLES; k++) {
        		if (showing[k])
        			c++; //checks if any redundant moles were chosen and chooses another one until it gets to NUMAPPEARING
        	}
    	}
    }

    public void draw(Graphics g) {
    	
    	// draws the background image at 0,0 with a size that will cover 
    	// the entire display window
        g.drawImage(bgImg, 0, 0, windowWidth, windowHeight, null);
        
        for (int i=0; i<NUMMOLES; i++) {
        	if (slotA[i]) {
        		g.setColor(Color.magenta); //highlights if the button represents the NUMAPPEARING value
        	}
        	else {
        		g.setColor(Color.black); //sets all other "buttons" to be black
        	}
        	//draws the "buttons" and the values they represent spaced apart evenly using the buttonsA array
        	g.fillOval(buttonsA[i], 0, swidth, windowHeight/20);
        	g.setColor(Color.white);
        	g.drawString(i+1+"", buttonsA[i]+windowWidth/50, windowHeight/30);

        	if (!showing[i])
        		g.drawImage(dirtImg, x[i], y[i], diamx, diamy, null); //draws dirt mounds if the corresponding boolean is false
        	else {
        		g.drawImage(moleImg, x[i], y[i], diamx, diamy, null); //draws a mole instead of dirt mound if the corresponding boolean is true
        	}
        }
        
    }

    public void click(int mouseX, int mouseY) {
    	for (int i=0; i<NUMMOLES; i++) {
    		if (showing[i]&&mouseX>x[i]&&mouseX<x[i]+diamx&&mouseY>y[i]&&mouseY<y[i]+diamy) { //checks if a mole that is popped out is clicked
    			score++; //adds to score
    			showing[i]=false; //makes the clicked mole no longer show
    		}
    		if (mouseX>=buttonsA[i]&&mouseX<=buttonsA[i]+swidth&&mouseY<=windowHeight/20) { //checks if a button is clicked
    			slotA=new boolean[NUMMOLES]; //makes all buttons false (not highlighted)
				slotA[i]=true; //highlights the button clicked
				NUMAPPEARING=i+1; //sets new NUMAPPEARING value
			}
    	}
    }
    
    //runs every timestep
    public void timeAdvance() {
    	//adds extra points if all moles have been clicked between timesteps
    	int x1=0;
    	for (boolean x:showing) {
    		if (!x)
    			x1++;
    	}
    	if (x1==showing.length)
    		score+=NUMAPPEARING/NUMMOLES*10; 
    	
    	showing=new boolean[NUMMOLES]; //refreshes all booleans in showing to become false
    	//chooses NEW random moles to appear up to the number NUMAPPEARING
		int c=0; //counter
    	while (c<NUMAPPEARING) { //runs while the counter is below NUMAPPEARING 
    		int i=(int) (Math.random()*(NUMMOLES));
    		showing[i]=true;
    		c=0; //resets counter every loop
    		for (int k=0; k<NUMMOLES; k++) {
        		if (showing[k])
        			c++; //checks if any redundant moles were chosen and chooses another one until it gets to NUMAPPEARING
        	}
    	}
    }
    
    // reset the game
    public void reset() {
    	score=0; //score resets to 0
    	setup(); //the setup method is ran again, eg. new mole locations
    }


    // DO NOT TOUCH BELOW CODE //

    public WhackAMole() {

    	setup();

        JFrame window = new JFrame();
        window.setTitle("Whack A Mole");
        window.setSize(windowWidth, windowHeight + textHeight);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        JTextArea scoreDisplay = new JTextArea();
        scoreDisplay.setEditable(false);
        scoreDisplay.setText("\t\tScore: 0");
        
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reset();
				window.getContentPane().repaint();
			}
        });
        
        JPanel topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(windowWidth, textHeight));
        topPanel.add(resetButton);
        scoreDisplay.setBackground(topPanel.getBackground());
        
        topPanel.add(scoreDisplay);
        
        timeSlider = new JSlider(1, TIMESTEP/1000+3, TIMESTEP/1000); //initializes slider, sets values from 1 to current timestep+3seconds
       	//paints slider
        timeSlider.setPaintTrack(true);	
       	timeSlider.setPaintTicks(true);
       	timeSlider.setPaintLabels(true);
       	timeSlider.setMajorTickSpacing(1); //spaces out slider
        topPanel.add(timeSlider); //adds slider to topPanel next to the score and reset button

        

        JPanel canvas = new JPanel() {
            public void paint(Graphics g) {
                draw(g);
                scoreDisplay.setText("\t\tScore: " + score);
            }
        };
        canvas.setPreferredSize(new Dimension(windowWidth, windowHeight));

        canvas.addMouseListener(new MouseListener() {

            @Override
            public void mousePressed(MouseEvent e) {
                click(e.getX(), e.getY());
                window.getContentPane().repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        
        window.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
                windowWidth = window.getWidth();
                windowHeight = window.getHeight() - textHeight;
                topPanel.setPreferredSize(new Dimension(windowWidth, textHeight));
                canvas.setPreferredSize(new Dimension(windowWidth, windowHeight));
                setup(); //runs setup again to fit everything to new window size
            }
        });

        container.add(topPanel);
        container.add(canvas);
        window.add(container);
        window.setVisible(true);
        canvas.revalidate();
        window.getContentPane().repaint();
        
        
        timer1=new Timer(TIMESTEP, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	timeAdvance();
            	window.getContentPane().repaint();
            }
        });
        timer1.start();
        timeSlider.addChangeListener(new ChangeListener() { //slider listener so it runs when slider value is changed
            public void stateChanged(ChangeEvent event) {
            	timer1.setDelay(timeSlider.getValue()*1000); //sets timer delay to slider value (eg. slide value of 1=1000ms) in the tick after the slider value is changed
            }
        });
    }

    public static void main(String[] args) {
        new WhackAMole();
    }

}