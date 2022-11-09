public class FlipCoin
{
    public static double split= .5;
    public static String flip ()
    {
        double turn = Math.random();
        if(turn <split)
        {
            return "Tails";
        }
        else 
            return "Heads";
    }
    public static void main(String [] args)
    {
        System.out.println(flip());
    }
}
