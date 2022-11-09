import java.util.ArrayList;
import java.util.Scanner;
public class SentenceMod
{
    public static String ip ="";
    public static ArrayList <String> list= new ArrayList<>();
    public static ArrayList addtolist()
    {
        String sad = ip;
        String pun= ip;
        for(int i = 0; i<ip.length(); i++)
        {
            if(ip.charAt(i) ==' ')
            {
                ip= ip.substring(i+1);
                sad = sad.substring(0,i);
                pun = pun.substring(0,i);
                list.add(sad);
                i=0;
                sad = ip;
                //System.out.println("1");
            }
            if( i< ip.length()-1 && ip.charAt(i+1)== ' '&& ip.charAt(i)== '.'||ip.charAt(i)== ','||ip.charAt(i)== '"')
            {
                ip= ip.substring(i+2);
                sad = sad.substring(0,i);
                System.out.println(sad);
                pun= pun.substring(i,i+1);
                System.out.println(pun);
                list.add(sad);
                list.add(pun);
                i=0;
                sad = ip; 
                pun = ip;
                //System.out.println("2");
            }
         /*   if( i< ip.length()-1 &&ip.charAt(i-1)== ' '&&ip.charAt(i)=='"')
            {
                
            }
           */ 
            else if(i==ip.length()-1 && ip.charAt(i)=='.')
            {
                pun = sad;
                sad = sad.substring(0,i);
                list.add(sad);
                pun= pun.substring(i);
                list.add(pun);
                //System.out.println("3");
            }
        }
        return list;   
    }
    public static void main(String[] args)
    {
        ip = "Hello. how, are you.";
       // addspacetoend();
        addtolist();
        //for (int i = 0; i< list.size(); i++)
            //System.out.println(list.get(i));
        //System.out.println(list.size());
        
    }
}
