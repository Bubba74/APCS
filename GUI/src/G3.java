
import javax.swing.JFrame;
import java.awt.Color;

public class G3 {

	public static void main (String[] args){
		JFrame frame = new JFrame("Bulls-Eye");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800,300,800,500);
		frame.setBackground(Color.lightGray);
		
		Target target = new Target(150+250, 250, 250);
		frame.add(target);

		frame.setVisible(true);
	}
}
