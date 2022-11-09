import java.util.Scanner;
public class dice
{
    public static int maxNu;
    public static int minNu;
    public static void rolledNumb(int times)
    {
        for(int i =0; i<times; i++)
        {
            int z=(int)(Math.random()*(maxNu-minNu))+minNu;
            
            System.out.println(z);
        }
    }

    public static void main(String[]args)
    {
        System.out.println("Lowest number that can be rolled");
        Scanner k = new Scanner(System.in);
        String b = k.next();
        for(int i =0; i<b.length();i++)
        {
            if(b.charAt(i)=='0'||b.charAt(i)=='1'||b.charAt(i)=='2'||b.charAt(i)=='3'||b.charAt(i)=='4'||b.charAt(i)=='5'||b.charAt(i)=='6'||b.charAt(i)=='7'||b.charAt(i)=='8'||b.charAt(i)=='9')
            {
                //System.out.println("true");
            }
            else
            { 
                //System.out.println("new number real number");
                b=k.next();
                i=0;
            }
        }
        maxNu=Integer.parseInt(b);
        System.out.println("Highest number that can be rolled");
        Scanner l = new Scanner(System.in);
        String s = l.next();
        for(int i =0; i<s.length();i++)
        {
            if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
            {
                //System.out.println("true");
            }
            else
            { 
                //System.out.println("new number real number");
                s=l.next();
                i=0;
            }
        } 
        minNu=Integer.parseInt(s);
        System.out.println("How many times do you want to roll");
        Scanner g = new Scanner(System.in);
        String t = g.next();
        for(int i =0; i<t.length();i++)
        {
            if(t.charAt(i)=='0'||t.charAt(i)=='1'||t.charAt(i)=='2'||t.charAt(i)=='3'||t.charAt(i)=='4'||t.charAt(i)=='5'||t.charAt(i)=='6'||t.charAt(i)=='7'||t.charAt(i)=='8'||t.charAt(i)=='9')
            {
                //System.out.println("true");
            }
            else
            { 
                //System.out.println("new number real number");
                t=g.next();
                i=0;
          
            }
        }
        int times=Integer.parseInt(t);
        System.out.println("Highest number " + maxNu);
        rolledNumb(times);
    }
}