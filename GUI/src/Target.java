
import javax.swing.JComponent;
import java.awt.Graphics;

public class Target extends JComponent {
	
	int r;

	public Target (int x, int y, int radius){
		super();
		r = radius;

		super.setBounds(x-r,y-r,2*r,2*r);
	}

	public void paint (Graphics g){
		int len = 100;

		for (int i=len; i>0; i--){
			int drawX = r -  r * i/len;
			int drawY = r -  r * i/len;
			int drawR = r*i/len;

			g.fillOval(drawX, drawY, 2*drawR, 2*drawR);
		}
	}//paint
}
