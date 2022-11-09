import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException; 
import java.io.FileOutputStream;
import java.util.Scanner;
public class Mut
{
   public static void write(int n)
   {
      for(int c=1; c<=n; c++)
      {
         try
         {
             String place = c + "."+choice();
             String space = "\n";
             BufferedWriter bw= new BufferedWriter(new PrintWriter(new FileOutputStream("C:\\Users\\piyuk\\Java Files\\multiplechoice answer practice test.txt",true)));
             bw.write(place);
             bw.write(space);
             bw.close();
         
         }
          catch(IOException e){}
      }
   
   }
   public static char choice()
   {
       String cho ="abcd";
       int selc = (int)(Math.random()*cho.length());
       return cho.charAt(selc);
   }
   public static void main(String []args)
   {
      Scanner input = new Scanner(System.in);
      String b = input.next();
      int s = Integer.parseInt(b);
      write(s);
   }

}