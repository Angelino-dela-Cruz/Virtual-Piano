

import javax.swing.*;
import java.awt.*;









public class Instrument extends JButton {
	
	private int instru;
	
	private JFrame frame;
	
	public Instrument(JFrame KeyBoard) {
		
		this.frame = KeyBoard;
		String x = JOptionPane.showInputDialog("Pick a number from 0 to 128");
		this.instru = Integer.parseInt(x);
		
		
	}
	
	
	private int getInstr() {
		return this.instru;
	}
}