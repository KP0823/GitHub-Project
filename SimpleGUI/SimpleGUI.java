import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SimpleGUI extends JFrame implements ActionListener
{

	private JTextField tf1;
	private JLabel lbl1;
	private JButton btn1, btn2;
	
	public SimpleGUI()
	{
		setupGUI();
	}
	
	private void setupGUI()
	{
		// instantiate components
		this.setTitle("The GUI");  // "this" not needed
		setLayout(null);  // use absolute positioning (setBounds)
		setSize(400, 300); // width, height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // exit program when window is closed
		
		tf1 = new JTextField();

		lbl1 = new JLabel("text stuff:");

		btn1 = new JButton("click");
		btn2 = new JButton("I dare you");
		
		// activate buttons
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		// add components to contentPane
		Container cp = getContentPane();   // using a contentpane variable instead of calling getContentPane() over and over
		cp.add(lbl1);
		cp.add(tf1);
		cp.add(btn1);
		cp.add(btn2);
			
		// set bounds of components
		lbl1.setBounds(10,10,80,30);  // x,y,width,height
		tf1.setBounds(80, 10, 100, 30);
		btn1.setBounds(20,40,100,30);
		btn2.setBounds(20,70,100,30);
		
		this.setVisible(true);  // make it visible
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// check which button triggered the event
		if(e.getSource().equals(btn1))		
			JOptionPane.showMessageDialog(this, "you clicked the first button");
		
		if(e.getSource().equals(btn2))
		{
			String s = tf1.getText(); // get text from textfield
			if (s.length() > 1)
			{
				String r = "";
				for(int i = s.length() -1; i >= 0; i--)
					r += s.charAt(i);
				tf1.setText(r);  // put the string in the textfield
			}
		}
	}
	
	public static void main(String[] args)
	{
		new SimpleGUI();
	}
}