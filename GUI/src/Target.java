
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;

public class Target extends JComponent {
	
	int r;
	int len;

	public Target (int x, int y, int radius){
		super();
		r = radius;

		super.setBounds(x-r,y-r,2*r,2*r);
		len = 100;
	}

	public void setScope (int length){
		len = length;
	}

	public void paint (Graphics g){

		for (int i=len; i>len/10; i--){
			int drawX = r -  r * i/len;
			int drawY = r -  r * i/len;
			int drawR = r*i/len;

			if (i%2 == 0) g.setColor(Color.blue);
			else g.setColor(Color.white);

			g.fillOval(drawX, drawY, 2*drawR, 2*drawR);
		}

		int drawX = r - r/10;
		int drawY = r - r/10;
		int drawR = r/10;
		
		g.setColor(Color.red);
		g.fillOval(drawX, drawY, 2*drawR, 2*drawR);
	}//paint
}
