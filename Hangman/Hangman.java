import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Hangman
{
    public static String input="";
    public static String trans="";
    public static String reg ="abcdefghijklmnopqrstuvwxyz1234567890'";
    public static String caps ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890'";
    public static String usedchar="";
    public static char dash='_';
    public static char space=' ';
    public static int chances =10;
    public static String makeString()
    {
        for(int i =0; i<input.length(); i++)
        {
            if(input.charAt(i)!= ' ')
            {
                trans+=dash;
            }
            else
            {
                trans+=space;
            }
            
        }
        return trans;
    }
    public static char turncap(char x)
    {
        char b =' ';
        for(int i = 0; i<reg.length(); i++)
        {
            if(x== reg.charAt(i))
                 b =caps.charAt(i);
        }
        
        return b;
    }
    // we could have used a hashmap here 
    public static void usedLetter(char x)
    {  
        
        for(int i = 0; i < usedchar.length(); i++)
        {
            if(x == usedchar.charAt(i))
            {
                tryagain();
            }
            
        }
        usedchar+=x;
        usedchar+=" ";
    }

    // could have used ignore case
    public static void  putLetters(char x)
    {
        usedLetter(x);
        String idk = trans;
        char c = turncap(x);
        for(int i =0;i< input.length(); i++)
        {
            if(input.charAt(i) == x)
            {
                trans = trans.substring(0,i)+x+trans.substring(i+1);
            }
            else if(input.charAt(i)== c)
            {
                trans = trans.substring(0,i)+c+trans.substring(i+1);
            }
        }
        if(idk.equals(trans))
        {
            chances--;
        }

    }
    public static void tryagain()
    {
      System.out.println("Type a differnet letter");
      Scanner inputss = new Scanner(System.in);
      String b = inputss.next();
      char l = b.charAt(0);
      chances++;
      putLetters(l);
      
    }
    public static void showString()
    {
        System.out.println(trans);
    }
    public static void organizeString()
    {
     for(int i = 0; i< usedchar.length(); i++)
     {
         for(int k = i+1; k<usedchar.length();k++)
         {
             if(usedchar.charAt(i)!=' '&&usedchar.charAt(k)!=' ' &&usedchar.charAt(i)==usedchar.charAt(k))
             {
                 usedchar=usedchar.substring(0,k)+usedchar.substring(k+1);
             }
             
         }
        }
        System.out.println();
        System.out.println(usedchar);
        System.out.println();
    }
    public static char lowercase(char x)
    {
        char z =' ';
        for(int i =0; i< reg.length()&&i<caps.length(); i++)
        {
            if(x== caps.charAt(i))
            {
                z = reg.charAt(i);
            }
            if(x== reg.charAt(i))
            {
                z= x;
            }
        }
        return z;    
    }
    public static void checkgame()
    {
        if(chances >0 && input.equals(trans))
        {
            System.out.println("Congratulations you got the sentence: "+ input );
            System.out.println("You can make  "+ chances +" mistakes ");
            System.exit(0);
        }
        else if(chances ==0)
        {
            System.out.println("You did your best,however the complete sentence was : "+input);
            System.out.println("You had "+ chances +" chances");
            System.exit(0);
        }
    }
    public static void main (String[] args)
    {
        System.out.println("Type your sentence");
        Scanner mainsent = new Scanner(System.in);
        input= mainsent.nextLine();
        System.out.println("Now click options and then clear to delete the sentence off the screen");
        System.out.println();
        System.out.println("YOU HAVE 10 SECONDS");
        Scanner cry = new Scanner(System.in);
        String b = "";
        makeString();
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException ex)
        {
        }
        while(1<2)
        {
            showString();
            System.out.println("Type a letter");
            b= cry.next();
            char x = b.charAt(0);
            char z = lowercase(x);
            putLetters(z);
            organizeString();
            showString();
            System.out.println("You can make "+ chances +" mistakes ");
            System.out.println("---------------------------------------------------");
            checkgame();
            System.out.println();
        }

    }
}
