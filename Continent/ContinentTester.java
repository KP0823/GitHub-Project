
public class ContinentTester extends Continent
{
    public static void main(String [] args)
    {
     Asia japan = new Asia("Asia", "Japan", 150, 89);
     System.out.println(japan.toString());
     Continent india = new Continent();
     System.out.println("\n"+india.toString());
     japan.funfact();
     india.funfact();
    }
}
