package ch.fhnw.mas.se;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame {

	private JButton calculateButton = new JButton("Calculate");
	private JTextField inputField = new JTextField();
	private JTextField outputField = new JTextField();
	
	public Gui() {
		super("MAS SE Fakultaet");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		
		mainPanel.setLayout(new GridLayout(3, 1));
		
		mainPanel.add(inputField, 0, 0);
		mainPanel.add(calculateButton, 1, 0);
		mainPanel.add(outputField, 2, 0);
		
		this.getContentPane().add(mainPanel);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String [] args) {
		new Gui();
	}
	
}
