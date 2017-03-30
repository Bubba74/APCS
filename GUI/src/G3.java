
import javax.swing.JFrame;
import java.awt.Color;

public class G3 {

	public static void main (String[] args){
		JFrame frame = new JFrame("Bulls-Eye");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800,300,800,550);
		frame.setBackground(Color.lightGray);
		frame.setLayout(null);
		
		Target target = new Target(150+250, 250, 250);
		if (args.length > 0) target.setScope (Integer.parseInt(args[0]));

		frame.add(target);
		frame.setVisible(true);
	}
}
