import java.util.Scanner;
public class TipCalFloat
{
   public static float total =0;
   public static float tip =0;
   public static float totalWithTip=0;
   public static float totalPerPerson =0;
   public static float totalPerPersonTip= 0;
   public static float tipPerPerson =0;
   public static int people = 0;
   public static void totalwithtip()
   {   
       tip = tip/100;
       tip = tip+1;
       totalWithTip = total * tip; 
       System.out.printf("The total with tip is $"+"%.2f",totalWithTip);
   }
   public static void totperP()
   {
       totalPerPerson = total/people;
       System.out.printf("Each person (or the sole person) will have to pay exluding tip $" +"%.2f",totalPerPerson);

   }
   public static void personwithTip()
   {
      totalPerPersonTip=totalWithTip/people;
      System.out.printf("Each person (or the sole person) will have to pay including tip $" +"%.2f",totalPerPersonTip);

   }
   public static void persontip()
   {
       tipPerPerson= totalWithTip-total;
       tipPerPerson = tipPerPerson/people;
       System.out.printf("Each person (or the sole person) will tip $"+ "%.2f",tipPerPerson);

   }
   public static void scanning()
   {
       Scanner tl = new Scanner(System.in);
       Scanner tp = new Scanner(System.in);
       Scanner p = new Scanner(System.in);
       System.out.println("What is the total ?");
       String tot = tl.next();
       total = Float.parseFloat(tot);
       System.out.println("How do you (guys) want to tip");
       String top = tp.next();
       tip = Float.parseFloat(top);
       System.out.println("How many people are willing to pay");
       String pe = p.next();
       people = Integer.parseInt(pe);
       System.out.println();
       totalwithtip();
       System.out.println();
       totperP();
       System.out.println();
       personwithTip();
       System.out.println();
       persontip();
   }
   public static void main (String[] args)
   {
       scanning();
   }
}
