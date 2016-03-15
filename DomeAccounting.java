package Domoney;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DomeAccounting{
	private JFrame main;
	private JLabel header;
	private JLabel status;
	private JPanel control;
	
	public DomeAccounting(){
		prepareGUI();
	}
	
	/*
	 * Opens a landing page where user can select his/her action path
	 */
	private void prepareGUI(){
		main = new JFrame("Welcome");
		main.setSize(400,400);
		main.setLayout(new GridLayout(3,1));
		main.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		});
		header = new JLabel("", JLabel.CENTER);
		status = new JLabel("", JLabel.CENTER);
		
		status.setSize(350, 100);
		
		control = new JPanel();
		control.setLayout(new FlowLayout());
		
		main.add(header);
		main.add(control);
		main.add(status);
		main.setVisible(true);
	}
	
	public static void main(String args[]){
		DomeAccounting accountingDemo = new DomeAccounting();
		accountingDemo.showButtonDemo();
		/*
		public static void main(String args[]) {
			
		}
		*/
	}
	
	private void showButtonDemo() {
		header.setText("Welcome");
			
		JButton newPartnerButton = new JButton("New Partner");
		JButton transButton = new JButton("Transactions");
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setHorizontalTextPosition(SwingConstants.LEFT);
		
		newPartnerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				NewPartner application = new NewPartner();
				application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		
		transButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				status.setText("Transaction Button Clicked");
			}
		});
		
		cancelButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				status.setText("Cancel Button Clicked");
				main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		
		control.add(newPartnerButton);
		control.add(transButton);
		control.add(cancelButton);
		
		main.setVisible(true);
	}
}
