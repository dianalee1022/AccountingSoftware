package Domoney;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test extends JPanel {

  public test() {
    JLabel lblMarried = new JLabel("Are you married?", JLabel.LEFT);
    JLabel lblGolf = new JLabel("Do you play golf?", JLabel.RIGHT);
    
    add(lblMarried);
    add(lblGolf);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new test());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 200);
    frame.setVisible(true);
  }
}
           
         
