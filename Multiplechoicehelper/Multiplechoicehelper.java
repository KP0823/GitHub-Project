import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException; 
import java.io.FileOutputStream;
import java.util.Scanner;
public class Multiplechoicehelper
{
   public static void write(int n)
   {
      for(int c=1; c<=n; c++)
      {
         try
         {
             String place = c + ".";
             String space = "\n";
             BufferedWriter bw= new BufferedWriter(new PrintWriter(new FileOutputStream("C:\\Users\\piyuk\\Java Files\\multiplechoice answer practice test.txt",true)));
             bw.write(place);
             bw.write(space);
             bw.close();
         
         }
          catch(IOException e){}
      }
   
   }
   public static void main(String []args)
   {
      System.out.println("How many questions?");
      Scanner input = new Scanner(System.in);
      String con = input.next();
      int b = Integer.parseInt(con);
      write(b);
   }

}