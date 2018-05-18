import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Arc2D;
//this is so exciting
//i know dude
public class SmileFace extends JComponent implements ActionListener {
	
	int x=395, velX=1;
	int y=135, velY=1;
	Timer tm = new Timer(30, this);
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		                  /* Face */
		g2.setColor(Color.YELLOW);
		g2.fillOval(80, 20, 450, 450);
		
		                  /* Eyes */
		Ellipse2D.Double e1 = new Ellipse2D.Double(185, 100, 50, 100);
		g2.setColor(Color.BLACK);
		g2.fill(e1);
		
		Ellipse2D.Double e2 = new Ellipse2D.Double(385, 100, 50, 100);
		g2.fill(e2);
		
		Ellipse2D.Double e3 = new Ellipse2D.Double(392, 101, 32, 80);
		g2.setColor(new Color(255, 255, 255));
		g2.fill(e3); 
		
		Ellipse2D.Double e4 = new Ellipse2D.Double(192, 101, 32, 80);
		g2.fill(e4);
		
		g2.setColor(Color.BLUE);
		g2.fillOval(x, y, 25, 25);
		
		g2.setColor(Color.BLUE);
		g2.fillOval(195, 135, 25, 25);
		
		                  /* Mouth */
		Arc2D.Double a1 = new Arc2D.Double(185, 250, 255, 100, 200, 135, Arc2D.CHORD);
		g2.setColor(Color.BLACK);
		g2.draw(a1); 
		
		tm.start();
	}
	//392, 399
	public void actionPerformed(ActionEvent e) {
		if (x<=392 || x>=399)
			velX= -velX;
		if (y<=101 || y>=156)
			velY= -velY;
		
		x+=velX;
		y-=velY;
		repaint();
	}

}

