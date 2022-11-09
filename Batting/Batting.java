import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class Batting {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	public static int singleR=0;
	public static int player=0;
	public static int doubleR=0;
	public static int tripleR=0;
	public static int homeR=0;
	public static int hits=0;
	public static double BA= 0;
	public static double av=0;
	public static String b="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Batting window = new Batting();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Batting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 813, 942);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player");
		lblNewLabel.setBounds(72, 55, 90, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(300, 86, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Team Code");
		lblNewLabel_1.setBounds(72, 86, 96, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number of times at Bat");
		lblNewLabel_2.setBounds(72, 114, 196, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(300, 114, 96, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of singles");
		lblNewLabel_3.setBounds(72, 146, 172, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Number of doubles");
		lblNewLabel_3_1.setBounds(72, 172, 161, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Number of triples");
		lblNewLabel_3_2.setBounds(72, 197, 161, 14);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Number of homeruns");
		lblNewLabel_3_3.setBounds(72, 222, 161, 14);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(300, 146, 96, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(300, 172, 96, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(300, 197, 96, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(300, 222, 96, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_4 = new JLabel("Batting Average");
		lblNewLabel_4.setBounds(193, 283, 137, 30);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Slugging Percentage");
		lblNewLabel_5.setBounds(377, 283, 161, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel TheName = new JLabel("-");
		TheName.setBounds(300, 52, 96, 20);
		frame.getContentPane().add(TheName);
		

		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i <textField_1.getText().length();i++)
				{
					if(textField_1.getText().charAt(i)== '1'||textField_1.getText().charAt(i)== '2'|| textField_1.getText().charAt(i)== '3'|| textField_1.getText().charAt(i)== '4'||textField_1.getText().charAt(i)== '5')
					{	
					}
					else {
						JOptionPane.showMessageDialog(new JFrame(), "Please input a Team number between 1-5"); 
						textField_1.setText("");
					}
					
				}
				for(int i = 0; i <textField_2.getText().length();i++)
				{
					if(textField_2.getText().charAt(i)== '0'|| textField_2.getText().charAt(i)== '1'||textField_2.getText().charAt(i)== '2'|| textField_2.getText().charAt(i)== '3'|| textField_2.getText().charAt(i)== '4'||textField_2.getText().charAt(i)== '5'|| textField_2.getText().charAt(i)== '6'|| textField_2.getText().charAt(i)== '7'||textField_2.getText().charAt(i)== '8'|| textField_2.getText().charAt(i)== '9')
					{
					}
					else {
						JOptionPane.showMessageDialog(new JFrame(), "Please input a whole number");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
					}
				}
				for(int i = 0; i <textField_3.getText().length();i++)
				{
					if(textField_3.getText().charAt(i)== '0'|| textField_3.getText().charAt(i)== '1'||textField_3.getText().charAt(i)== '2'|| textField_3.getText().charAt(i)== '3'|| textField_3.getText().charAt(i)== '4'||textField_3.getText().charAt(i)== '5'|| textField_3.getText().charAt(i)== '6'|| textField_3.getText().charAt(i)== '7'||textField_3.getText().charAt(i)== '8'|| textField_3.getText().charAt(i)== '9')
					{					
					}
					else {
						JOptionPane.showMessageDialog(new JFrame(), "Please input a whole number");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
					}
				}
				for(int i = 0; i <textField_4.getText().length();i++)
				{
					if(textField_4.getText().charAt(i)== '0'|| textField_4.getText().charAt(i)== '1'||textField_4.getText().charAt(i)== '2'|| textField_4.getText().charAt(i)== '3'|| textField_4.getText().charAt(i)== '4'||textField_4.getText().charAt(i)== '5'|| textField_4.getText().charAt(i)== '6'|| textField_4.getText().charAt(i)== '7'||textField_4.getText().charAt(i)== '8'|| textField_4.getText().charAt(i)== '9')
					{				
					}
					else {
						JOptionPane.showMessageDialog(new JFrame(), "Please input a whole number"); 
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
					}
				}
				for(int i = 0; i <textField_5.getText().length();i++)
				{
					if(textField_5.getText().charAt(i)== '0'|| textField_5.getText().charAt(i)== '1'||textField_5.getText().charAt(i)== '2'|| textField_5.getText().charAt(i)== '3'|| textField_5.getText().charAt(i)== '4'||textField_5.getText().charAt(i)== '5'|| textField_5.getText().charAt(i)== '6'|| textField_5.getText().charAt(i)== '7'||textField_5.getText().charAt(i)== '8'|| textField_5.getText().charAt(i)== '9')
					{		
					}
					else {
						JOptionPane.showMessageDialog(new JFrame(), "Please input a whole number"); 
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
					}
				}
				for(int i = 0; i <textField_6.getText().length();i++)
				{	
					if(textField_6.getText().charAt(i)== '0'|| textField_6.getText().charAt(i)== '1'||textField_6.getText().charAt(i)== '2'|| textField_6.getText().charAt(i)== '3'|| textField_6.getText().charAt(i)== '4'||textField_6.getText().charAt(i)== '5'|| textField_6.getText().charAt(i)== '6'|| textField_6.getText().charAt(i)== '7'||textField_6.getText().charAt(i)== '8'|| textField_6.getText().charAt(i)== '9')
					{					
					}
					else {
						JOptionPane.showMessageDialog(new JFrame(), "Please input a whole number"); 
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
					}
				}
				player= Integer.parseInt(textField_1.getText());
				namesr(player);
				TheName.setText(b);
				hits= Integer.parseInt(textField_2.getText());
				singleR= Integer.parseInt(textField_3.getText());
				doubleR= Integer.parseInt(textField_4.getText());
				tripleR= Integer.parseInt(textField_5.getText());
				homeR= Integer.parseInt(textField_6.getText());
				BA=((double)hits/(((double)singleR)+((double)doubleR)+((double)tripleR)+((double)homeR)));
				av=((((double)singleR)+((double)doubleR*2)+((double)tripleR*3)+((double)homeR*4))/(double)hits);
				lblNewLabel_4.setText(""+ BA);
				lblNewLabel_5.setText(""+ av);
				}
				});

		btnNewButton.setBounds(73, 279, 89, 23);
		frame.getContentPane().add(btnNewButton);
	
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TheName.setText("-");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				lblNewLabel_4.setText("Batting Average");
				lblNewLabel_5.setText("Slugging Percentage");
			}
		});
		btnNewButton_1.setBounds(72, 313, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
	}
	public void namesr(int x)
	{
		String[] names= {"bob","billy","tom","jerry","phil"};		
		b= names[x-1];
		
		}
	
	}

