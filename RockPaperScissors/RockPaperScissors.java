import java.util.ArrayList;
import java.util.Scanner;
public class RockPaperScissors
{
    public static String player1="";
    public static String player2="";
    public static String rock ="rock";
    public static String paper="paper";
    public static String scissor="scissor";
    public static int p1c =0;
    public static int p2c =0;
    public static int tc= 0;
    public static int winNu = 0;
    public static String chose (String pl)
    {
        ArrayList<String> game = new ArrayList<>();
        game.add("rock");
        game.add("paper");
        game.add("scissor");
        int randoms = (int)(Math.random()*game.size());
        pl = game.get(randoms);
        return pl;
    }
    public static void wins()
    {
        if(player1.equals(paper)&&player2.equals(rock))
        {
           p1c++;
           System.out.println("Player one won");
           System.out.println(player1 +" beats "+player2);
           System.out.println("__________________________");
        }
        else if(player1.equals(rock)&&player2.equals(scissor))
        {
            p1c++;
            System.out.println("Player one won");
            System.out.println(player1 +" beats "+player2);
            System.out.println("__________________________");
        }
        else if(player1.equals(scissor)&&player2.equals(paper))
        {
            p1c++;
            System.out.println("Player one won");
            System.out.println(player1 +" beats "+player2);
            System.out.println("__________________________");
        }
        //________________________________________
        else if(player1.equals(rock)&&player2.equals(paper))
        {
           p2c++;
           System.out.println("Player two won");
           System.out.println(player2 +" beats "+player1);
           System.out.println("__________________________");
        }
        else if(player1.equals(scissor)&&player2.equals(rock))
        {
            p2c++;
            System.out.println("Player two won");
            System.out.println(player2 +" beats "+player1);
            System.out.println("__________________________");
        }
        else if(player1.equals(paper)&&player2.equals(scissor))
        {
            p2c++;
            System.out.println("Player two won");
            System.out.println(player2 +" beats "+player1);
            System.out.println("__________________________");
        }        
        else
        {
            tc++;
            System.out.println("tie this round");
            System.out.println("__________________________");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("How many rounds does one have to win?");
        Scanner input= new Scanner(System.in);
        String b = input.next();
        winNu= Integer.parseInt(b);
        while(p1c<=winNu ||p2c<=winNu)
        {
            if(p1c==winNu)
                break;
            if(p2c ==winNu)
                break;
            player1 = chose(player1);
            player2 = chose(player2);
            wins();

        }
        System.out.println(tc + " ties");
        System.out.println("player 1 wins "+p1c +" games");
        System.out.println("player 2 wins "+p2c +" games");
    }
}
