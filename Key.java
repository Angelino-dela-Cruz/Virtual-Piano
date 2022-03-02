import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Key extends JButton {
	
	private Color backGround, foreGround;
	private boolean isMinor;
	private JFrame frame;
	
	private final int WIDTH = 107;
	
	public Key(JFrame KeyBoard, int i) {
		this.frame = KeyBoard;
//		frame.setBounds(100, 100, 1244, 733);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
		this.backGround = Color.white;
		
		
		this.setBackground(backGround);
		this.setFont(new Font("Tahoma", Font.PLAIN, 26));
		this.setBounds(getLeft(i), 280, 97, 287);
		this.frame.getContentPane().add(this);
		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_C, 0), "C");
		this.frame.setVisible(true);
	}
//		Action aa = new AbstractAction()
//		   {
//				@Override
//			  public void actionPerformed(ActionEvent e)
//			   {
//				  mc[5].noteOn(60, 600);                      
//			   }
//		   };			
//		this.getActionMap().put("C", aa);
//		this.addActionListener(aa);
	
	public int getLeft(int i) {
		return 37 + i * this.WIDTH; //TODO: stating possition should come from Piano
	}
	
}