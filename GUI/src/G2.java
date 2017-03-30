package src;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class G2 extends Canvas{
	
	public static void main (String[] args){
		JFrame frame = new JFrame("G2");
		frame.setLocation(1000, 400);
		frame.setSize(800,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.green);

		frame.repaint();

		G2 pic = new G2();
		pic.setBackground(Color.lightGray);
		pic.setBounds(0, 0, 800, 500);
		
		frame.add(pic);
		frame.repaint();
		frame.setVisible(true);
	}
	
	public void paint (Graphics g){
		g.setColor(Color.lightGray);
		g.fillRect(0, 0, 800, 500);
		
		g.setColor(Color.darkGray);
		g.fillPolygon(new int[]{620, 460, 780}, new int[]{100, 300, 300}, 3);
		
		g.setColor(Color.cyan);
		g.fillRect(480, 300, 280, 160);
		
		g.setColor(Color.white);
		g.fillRect(500, 320, 100, 40);
		g.fillRect(640, 320, 100, 40);
		
		g.setColor(Color.red);
		g.fillRect(590, 380, 60, 80);
		
		g.setColor(new Color(20,160,50));
		g.fillRect(0, 460, 800, 10);
		
		g.setColor(Color.black);
		g.fillRect(200, 300, 30, 160);
		
		g.setColor(Color.green);
		g.fillOval(100, 80, 200, 200);
		g.fillOval(70, 160, 200, 200);
		g.fillOval(160, 160, 200, 200);
		
		//Person
		g.setColor(Color.blue);
		g.drawOval(405, 370, 20, 20);
		g.fillOval(412, 375, 4, 4);
		g.fillOval(417, 375, 4, 4);
		
		
		
	}
}
