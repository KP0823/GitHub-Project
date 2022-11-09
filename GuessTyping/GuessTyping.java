import java.util.Scanner;
public class GuessTyping
{
   public static String newSentence ="";
   public static String randomS="";
   public static String somewhat="";
   public static String alpha ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
   
   //randomly picking letters and seeing how many times it takes to form this string. 
   public static void rand ()
   {
       int r = (int)(Math.random()*alpha.length());
       int counter =0;
       for(int i =0; i< newSentence.length(); i++)
       {
           while(newSentence.charAt(i)!=alpha.charAt(r))
           {
               counter++;
               r = (int)(Math.random()*alpha.length());  
           }
           if(newSentence.charAt(i)==alpha.charAt(r))
           {
               counter++;
               randomS+= alpha.charAt(r);
           }
       }
       System.out.println(randomS+" "+ counter);
   }
   public static void letsb ()
   {
       int counter =0;
       int n =0;
       for(int i = 0; i< newSentence.length(); i++)
       {
           while(newSentence.charAt(i)!= alpha.charAt(n))
           {
               counter++;
               n++;
               if(n==alpha.length())
               {
                   n =0;
               }
           }
           if(newSentence.charAt(i)==alpha.charAt(n))
           {
               counter++;
               somewhat+=alpha.charAt(n);
               n=0;
           }
       }
       System.out.println(somewhat+ " "+ counter);
   }
   public static void main(String [] args)
   {
       Scanner mb = new Scanner(System.in);
       newSentence =mb.nextLine();
       rand();
       letsb();
   }
}
