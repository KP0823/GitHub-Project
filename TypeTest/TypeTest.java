import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException; 
import java.io.FileOutputStream;
import java.util.Scanner;
//learning scans
public class TypeTest
{
    public static String keepTyping= "";
    public static void typing ()
    {
        String space = "\n"; 
        try
        {
            BufferedWriter bw= new BufferedWriter(new PrintWriter(new FileOutputStream("C:\\Users\\piyuk\\Java Files\\TestTypeCode.txt",true)));
            if(keepTyping.equals(":qsdwasd"))
            {     
            }
            else
            {
                bw.write(keepTyping);
            }
            bw.write(space);
            bw.close();
        }
        catch(IOException e){}
    }
    public static void main(String [] args)
    {
        System.out.println("Here you can type what ever you want and it won't stop unless you command it");
        System.out.println("The command to stop is ':qsdwasd'");
        Scanner crybaby = new Scanner(System.in);
        while(keepTyping!= ":qsdwasd")
        {
            if(keepTyping.equals(":qsdwasd"))
            {
                break;   
            }
            keepTyping = crybaby.nextLine();
            typing ();

        }

    }
}
