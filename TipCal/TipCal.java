import java.util.Scanner;
import java.util.*;
import java.io.*;
public class TipCal
{
    public static double total =0;
    public static double tip = 0;
    public static int people = 0;
    public static double totalPerPerson =0;
    public static double totaltip =0;
    public static double bhs =0;
    public static double lsh =0;
    public static String calcuateTip()
    {
     tip = Math.abs(tip);
     tip = tip/100;
     tip = tip+1;
     totaltip= total *tip;
     String b = ""+totaltip;
     String f ="";
     String t="";
     double nextpart = 0;
     int totalss = (int)totaltip; 
     for(int i = 0; i<b.length(); i++)
     {
         if(b.charAt(i)=='.')
         {
             f=b.substring(i,b.length()-1);
         }
     }
     if(f.length()>2)
     {
         if(f.charAt(3)=='0'||f.charAt(3)=='1'||f.charAt(3)=='2'||f.charAt(3)=='3'||f.charAt(3)=='4')
         {
             t= f.substring(0,3);
             System.out.println(t);
             nextpart= Double.parseDouble(t);
             totaltip = (double)totalss+nextpart;
            
         }
         else if(f.charAt(3)=='5'||f.charAt(3)=='6'||f.charAt(3)=='7'||f.charAt(3)=='8'||f.charAt(3)=='9')
         {
             t =f.substring(0,3);
             nextpart= Double.parseDouble(t);
             nextpart= nextpart+.01;
             totaltip = (double)totalss+nextpart;
                       
         }
           
      } 
      return "Total with tip $"+totaltip;
    }
    public static float controlmoney(double start)
    {
        String b = ""+start;
        String f ="";
        double primary = 0;
        int secondary= (int)start;
        for(int i =0; i< b.length(); i++)
        {
            if(b.charAt(i)=='.')
            {
                f= b.substring(i,i+2);
                primary = Double.parseDouble(f);
                primary= primary +.01;
                start = (double)secondary +primary;
            }
        }
        float cry = (float)start;
        return cry;
    }
    public static void moneyperson()
    {
        totalPerPerson=totaltip/people;
        //System.out.println("Each person pays with tip $"+totalPerPerson);
    }
    public static void tipss()
    {
      bhs= totaltip-total;
      bhs=bhs/people;
      // "Each person pays this much tip $"+bhs;
    }
    public static void withouttips()
    {
      lsh = totaltip/tip;
      lsh= lsh/people;
      //"Each person pays this much without tip $"+lsh;
    }
    public static void runscanners()
    {
     int n = 0;
     Scanner tot = new Scanner(System.in);
     Scanner ti = new Scanner(System.in);
     Scanner pe = new Scanner(System.in);
     while(n <1)
     {
         System.out.println("Enter the bill amount");
         String totss= tot.next();
         total = Double.parseDouble(totss);
         System.out.println();
         System.out.println("Enter the percent you would like to tip");
         System.out.println("Please type as a whole number");
         String tis = ti.next();
         tip = Double.parseDouble(tis);
         System.out.println();
         System.out.println("Are you splitting the bill? (1 = no)(Aything higher is splitting)");
         String pes = pe.next();
         people= Integer.parseInt(pes);
         System.out.println(calcuateTip());
         moneyperson();
         tipss();
         withouttips();
         controlmoney(totalPerPerson);
         controlmoney(bhs);
         controlmoney(lsh);
         System.out.printf("Each person pays with tip $"+"%.2f",totalPerPerson);
         System.out.println();
         System.out.printf("Each person pays this much tip $"+"%.2f",bhs);
         System.out.println();
         System.out.printf("Each person pays this much without tip $"+"%.2f",lsh);
         System.out.println();
         n++;
     }       
    }
    public static void main(String[] args)
    {
        runscanners();
    }
}