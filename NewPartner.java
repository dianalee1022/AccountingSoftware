package Domoney;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NewPartner extends JFrame{
	private JLabel header;
	private JTextField nameTF, addressTF, factionTF, cityTF, postalCodeTF, FactionTF, emailTF, phoneTF, contactTF;
	private JButton accept;
	private JButton cancel;
	private JComboBox factionCB;
	private JCheckBox unipersonalCB;
	
	public NewPartner()
	{
		super("New Parnter");
		
		Container container = getContentPane();
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(gridBag);
		
		
		/* Name each section */
		//header
		header = new JLabel("New Partner");
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 15;
		
		/*
		 * c.fill = GridBagConstraints.PAGE_START;
		 
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.ipady = 40;      //make this component tall
		c.weightx = 0.0;
		c.gridwidth = 15;
		c.gridx = 0;
		c.gridy = 1;
		*/
		add(header, c);

		
		//Name section
		c.gridy = 1;
		makeLabel("Name ", gridBag, c);
		makeRegularTF(nameTF, 10, gridBag, c);
		
		//Address section
		c.gridy = 2;
		makeLabel("Address ", gridBag, c);
		makeRegularTF(addressTF, 10, gridBag, c);
		
		//City section
		c.gridy = 3;
		makeLabel("City ", gridBag, c);
		makeRegularTF(cityTF, 10, gridBag, c);
		
		//PostalCode Section
		c.gridy = 4;
		makeLabel("Postal Code ", gridBag, c);
		makeRegularTF(postalCodeTF, 10, gridBag, c);
		
		//Faction Section
		c.gridy = 5;
		makeLabel("Faction ", gridBag, c);
		c.gridx = 5;
		factionCB = new JComboBox();
		add(factionCB,c);
		
		//Unipersonal Section
		c.gridy = 6;
		makeLabel("Unipersonal ", gridBag, c);
		c.gridx = 5;
		unipersonalCB = new JCheckBox();
		add(unipersonalCB, c);
		
		//Email Section
		c.gridy = 7;
		makeLabel("Email ", gridBag, c);
		makeRegularTF(emailTF, 10, gridBag, c);
		
		//Phone Section
		c.gridy = 8;
		makeLabel("Phone ", gridBag, c);
		makeRegularTF(phoneTF, 10, gridBag, c);
		
		//Contact Name Section
		c.gridx = 0;
		c.gridy = 9;
		makeLabel("Contact Name ", gridBag, c);
		makeRegularTF(contactTF, 10, gridBag, c);
		
		//Button Section
		c.gridx = 0;
		c.gridy = 10;
		c.anchor = GridBagConstraints.PAGE_END;
		accept = new JButton("Accept");
		container.add(accept, c);
		c.gridx = 7;
		cancel = new JButton("Cancel");
		container.add(cancel, c);
		
		ButtonHandler handler = new ButtonHandler();
		accept.addActionListener(handler);
		cancel.addActionListener(handler);
		setSize(400, 400);
		setVisible(true);
	}
	
	protected void makeLabel(String name, GridBagLayout gridbag, GridBagConstraints c){
		JLabel label = new JLabel(name);
		c.gridwidth = GridBagConstraints.RELATIVE;
		c.gridx = 0;
		c.gridwidth = 5;
		c.gridheight = 1;
		c.anchor = GridBagConstraints.NORTH;
		gridbag.setConstraints(label, c);
		add(label, c);
	}
	
	protected 
	void makeRegularTF(JTextField name, int size, GridBagLayout gridbag, GridBagConstraints c) {
		name = new JTextField(size);
		c.fill = GridBagConstraints.REMAINDER;
		c.gridx = 5;
		c.gridwidth = 15;
		c.gridheight = 1;
		gridbag.setConstraints(name, c);
		add(name, c);
	}
	
	public static void main(String args[]) {
		NewPartner application = new NewPartner();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JFrame secondFrame = new JFrame("Second Frame");
			secondFrame.setSize(200, 200);
			secondFrame.setVisible(true);
			dispose();
		}
	}
	/*
	private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JFrame secondFrame = new JFrame("Second Frame");
			secondFrame.setSize(200, 200);
			secondFrame.setVisible(true);
			dispose();
		}
	}
	*/

}
