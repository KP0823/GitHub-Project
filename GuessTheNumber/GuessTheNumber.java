import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuessTheNumber
{
   public static int setMinGuess =0;
   public static int setGuess =0;
   public static int setMaxGuess=0;
   public static int guessedNumber= 0;
   public static int tries = 0;
   public static int wins =0;
   public static void checkMinValue()
   {
       if(setMinGuess<=setGuess)
       {
           
       }
       else 
       {
           String s = "MIN";
           String t = "GREATER";
           correct(s,t);6
        }
   }
   /*public static void correctMin()
   {
       Scanner correction = new Scanner(System.in);
       String convertion;
       System.out.println("Your min value was greater than the guessing value");
       System.out.println("Type a new min value");
       convertion = correction.next();
       setMinGuess= Integer.parseInt(convertion);
       checkMinValue();
   }
   */
   public static void checkMaxValue()
   {
       if(setMaxGuess>=setGuess)
       {
           
       }
       else 
       {
           String s = "MAX";
           String t = "LESS";
           correct(s,t);
        }
   }
   public static void correct(String b, String c)
   {
       Scanner correction = new Scanner(System.in);
       String convertion;
       System.out.println("Your "+b+" value was "+ c +" than the guessing value");
       System.out.println("Type a new Max value");
       convertion = correction.next();
       setMinGuess= Integer.parseInt(convertion);
       checkMinValue();
   }
   public static void gameRules()
   {
       if(guessedNumber == setGuess&& tries>0)
       {
           wins =1;
           System.out.println("You guessed the number " + guessedNumber);
       }
       else 
            tries--;
   }
   public static void startGame()
   {
       Scanner min = new Scanner(System.in);
       Scanner max = new Scanner(System.in);
       Scanner guess = new Scanner(System.in);
       Scanner t = new Scanner(System.in);
       Scanner make = new Scanner(System.in);
       String mn;
       String mx;
       String g;
       String tR;
       String makeg;
       //--------------------------------------------
       System.out.println("What is the guessing number");
       g = guess.next();
       setGuess= Integer.parseInt(g);
       //-----------------------------------------------
       System.out.println("Help the person with a MIN VALUE");
       mn = min.next();
       setMinGuess= Integer.parseInt(mn); 
       checkMinValue();
       //---------------------------------------------------
       System.out.println("Help the person with a MAX VALUE");
       mx = max.next();
       setMaxGuess= Integer.parseInt(mx);
       checkMaxValue();
       //---------------------------------------------------
       System.out.println("How many TRIES do you want to give them");
       tR= t.next();
       tries= Integer.parseInt(tR);
       //-----------------------------------------------
       System.out.println();
       System.out.println("Now click options and then clear to delete the sentence off the screen");
       System.out.println();
       System.out.println("YOU HAVE 10 SECONDS");
       try{
           Thread.sleep(10000);
       }
       catch(InterruptedException ex)
       {
       }


       while(wins==0)
       {
           System.out.println("Your MIN is: " +setMinGuess);
           System.out.println("Your MAX is: " +setMaxGuess);
           System.out.println("You have "+ tries+ " TRIES");
           System.out.println("Guess a number");
           makeg= make.next();
           guessedNumber= Integer.parseInt(makeg);
           gameRules();
       }
   }
   public static void main(String[] args)
   {
       startGame();
   }
}

