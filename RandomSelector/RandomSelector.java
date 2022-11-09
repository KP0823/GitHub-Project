import java.util.Scanner;
import java.util.ArrayList;
public class RandomSelector
{
   public static void printarray(ArrayList game)
   {
       for(int k=0; k<game.size(); k++)
        System.out.println(game.get(k));
    }
   public static void addTolist(String a, ArrayList game)
   {
       if(a.equals("DONE!!!"))
        {
              int randoms = (int)(Math.random()*game.size());
              System.out.println(game.get(randoms));
              System.exit(0);
        } 
       else
           game.add(a);
   }
   public static void main(String [] args)
   {
      String adder= "";
      System.out.println(" To stop this array type: DONE!!!");
      Scanner helper = new Scanner(System.in);
      ArrayList<String> list= new ArrayList<String>();
      while(adder!="DONE!!!")
      {
          adder=helper.nextLine();
          addTolist(adder,list);
          printarray(list);
          System.out.println(list.size());
    }
   }
}
