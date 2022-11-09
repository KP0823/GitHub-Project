import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class BoxGui extends JFrame //implements ActionListener
{
    private JTextField tfL,tfW,tfH,tfV;
    private JLabel lbL,lbW,lbH,lbV;
    private JButton btnC,btnV;
    private static int length =0;
    private static int width =0;
    private static int height = 0;
    private static int volume =0;
    public BoxGui()
    {
        setupGui();
    }
    public static void setLength(int x)
    {
        length = x;
    }
    public static void setWidth(int x)
    {
        width = x;
    }
    public static void setHeight(int x)
    {
        height = x;
    }
    public static int getlength()
    {
        return length;
    }
    public static int getwidth()
    {
        return width;
    }
    public static int getheight()
    {
        return height;
    }
    public static int vol()
    {
        volume = length*width*height;
        return volume;
    }
    public void setupGui()
    {
        setTitle("My Gui");
        setLayout(null);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        tfL = new JTextField();
        tfW = new JTextField();
        tfH = new JTextField();
        tfV = new JTextField();
        
        lbL = new JLabel("Length");
        lbW = new JLabel("Width");
        lbH = new JLabel("Height");
        lbV = new JLabel("Volume");
        
        btnC = new JButton("Create");
        btnV = new JButton("Show");
        
        //btnC.addActionListener(this);
        //btnC.addActionListener(this);
        
        Container con = getContentPane();
        
        con.add(tfL);
        con.add(tfW);
        con.add(tfH);
        con.add(tfV);
        
        con.add(lbL);
        con.add(lbW);
        con.add(lbH);
        con.add(lbV);
        
        con.add(btnC);
        con.add(btnV);
        
        lbL.setBounds(10,10,80,30);
        lbW.setBounds(150,10,80,30);
        lbH.setBounds(290,10,80,30);
        lbV.setBounds(430,10,80,30);
        tfL.setBounds(10,100,100,30);
        tfW.setBounds(150,100,100,30);
        tfH.setBounds(290,100,100,30);
        tfV.setBounds(430,100,100,30);
        btnC.setBounds(180,180,80,30);
        btnV.setBounds(300,180,80,30);
        this.setVisible(true);
    }
    public static void main (String[] args)
    {
        new BoxGui();
        setLength(10);
        setWidth(10);
        setHeight(2);
        int b = getlength();
        System.out.println(vol());
        System.out.println(b);
        
    }
}
