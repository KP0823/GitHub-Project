import java.awt.*;  
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;  
import java.text.DecimalFormat;
public class ShopGui extends JFrame implements ActionListener
{
        private JTextField name, address, q1,q2,q3;
    private JLabel prod1, prod2, prod3, p1, p2, p3,n,a/*, orTo, daiTo*/;
    private JButton order, daily;
    private TextArea textarea;
    public static double price1 = 14.03;
    public static double price2 = 21.60;
    public static double price3= 32.39;
    public static double orderTotal=0;
    public static double dailyTotal=0;
    public static double repr= 1.08;
    public static double tax= 1.06;
    public static double totaltax=0;
    public static double profit=0;
    public static double totalprofit=0;
    public static int totalp1=0;
    public static int totalp2=0;
    public static int totalp3=0;
    public static double shipping =0;
    public static double totalWithShip=0;
    DecimalFormat df = new DecimalFormat("#.##");
    public ShopGui()
    {
        setupGUI();
    }
    private void setupGUI()
    {
        this.setTitle("Shirt Shop");
        setLayout(null);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        name =new JTextField(); //*
        address = new JTextField(); //*
        q1= new JTextField(); //quantity
        q2 =new JTextField(); //*
        q3=new JTextField(); //*
        textarea = new TextArea();
        textarea.setForeground(Color.red);
        n = new JLabel("Name"); //*
        a = new JLabel("Address"); //*
        prod1= new JLabel("Shirt 1"); //*
        prod2= new JLabel("Shirt 2"); //*
        prod3= new JLabel("Shirt 3"); //*
        p1 =new JLabel("$"+price1); //*
        p2 =new JLabel("$"+price2); //*
        p3= new JLabel("$"+price3); //*
        //orTo = new JLabel("$");
        //daiTo = new JLabel("$");
        
        order= new JButton("Order");
        daily= new JButton("Daily");
        
        getContentPane().add(name);
        getContentPane().add(address);
        getContentPane().add(q1);
        getContentPane().add(q2);
        getContentPane().add(q3);
        getContentPane().add(n);
        getContentPane().add(a);
        getContentPane().add(prod1);
        getContentPane().add(prod2);
        getContentPane().add(prod3);
        getContentPane().add(p1);
        getContentPane().add(p2);
        getContentPane().add(p3);
        getContentPane().add(order);
        getContentPane().add(daily);
        //getContentPane().add(orTo);
        //getContentPane().add(daiTo);
        getContentPane().add(textarea);
        textarea.setEditable(false);
        order.addActionListener(this); 
        daily.addActionListener(this);
       
       n.setBounds(5,0,80,35);
       a.setBounds(5,50,80,35);
       name.setBounds(70,0,150,35);
       address.setBounds(70,50,150,35);
       prod1.setBounds(5,100,80,35);
       prod2.setBounds(5,150,80,35);
       prod3.setBounds(5,200,80,35);
       p1.setBounds(70,100,80,35);
       p2.setBounds(70,150,80,35);
       p3.setBounds(70,200,80,35);
       q1.setBounds(140,100,80,35);
       q2.setBounds(140,150,80,35);
       q3.setBounds(140,200,80,35);
       order.setBounds(5,250,80,35);
       daily.setBounds(5,300,80,35);
       textarea.setBounds(100,250,400,200);
      // orTo.setBounds(100,250,80,35);
      // daiTo.setBounds(100,300,80,35);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == order)  
        {
            int product1= 0;
            int product2= 0;
            int product3= 0;
            if(q1.getText().equals(""))
                product1= 0;
            else
                product1= Integer.parseInt(q1.getText());
            if(q2.getText().equals(""))
                product2= 0;
            else
                product2= Integer.parseInt(q2.getText());
            if(q3.getText().equals(""))
                product3= 0;
            else    
                product3= Integer.parseInt(q3.getText());
            totalp1+=product1;
            totalp2+=product2;
            totalp3+=product3;
            orderTotal= (((price1*product1)+(price2*product2)+(price3*product3)));
            profit=(price1*product1)-((price1*product1)/repr);
            profit+=(price2*product2)-((price2*product2)/repr);
            profit+=(price2*product3)-((price2*product3)/repr);
            totalprofit+=profit;
            totaltax=(orderTotal*tax)-orderTotal;
            dailyTotal+=orderTotal;
            totalWithShip= orderTotal;
            if(orderTotal<40.00)
            {
                totalWithShip+=7;
                shipping=7;
            }
            else if(40<orderTotal&& orderTotal<149.99)
            {
                totalWithShip+=10;
                shipping+= 10;
            }
            else if(orderTotal>150)
            {
                totalWithShip+=0;
                shipping+=0;
            }
            textarea.appendText("\n"+"Name: "+ name.getText());
            textarea.appendText("\n"+"Address: " +address.getText());
            textarea.appendText("\n"+java.time.LocalDate.now());
            textarea.appendText("\n"+"Product 1: " + q1.getText()+ " Product 2: "+ q2.getText() + " Product 3: " + q3.getText());
            textarea.appendText("\n"+"Order Total without tax: "+"$"+df.format(orderTotal));
            System.out.println(orderTotal);
            textarea.appendText("\n"+"Order Total With Shipping: "+"$"+df.format(totalWithShip)); 
            System.out.println(totalWithShip);
            textarea.appendText("\n"+"Shipping Price: "+"$" +df.format(shipping));
            System.out.println(shipping);
            textarea.appendText("\n"+"Tax: "+ "$"+df.format(totaltax));
            System.out.println(totaltax);
            textarea.appendText("\n"+"Order Total with Tax: "+ "$"+df.format(orderTotal+totaltax));
            System.out.println(orderTotal+totaltax);
            textarea.appendText("\n"+"Our Profit: "+"$"+df.format(profit));
            System.out.println(profit);
            textarea.appendText("\n"+" ");
            profit=0;
            shipping =0;
        }
        else if(e.getSource()== daily)
        {
            
            textarea.appendText("\n"+"TOTAL ORDER PRODUCT 1: " + totalp1);
            textarea.appendText("\n"+"TOTAL ORDER PRODUCT 2: " + totalp2);
            textarea.appendText("\n"+"TOTAL ORDER PRODUCT 3: " + totalp3);
            textarea.appendText("\n"+"TOTAL PROFIT: $"+df.format(totalprofit));
            textarea.appendText("\n"+" ");
            System.out.println(totalprofit);
            
            
        }
          
        }
    public static void main(String[] args)
    {
        new ShopGui();
    }
    
}
