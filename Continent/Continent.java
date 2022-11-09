public class Continent
{
  public String continent;
  public String country;
  public int population;
  public double temp;
  public Continent()
  {
      continent = "Asia";
      country = "India";
      population = 1300000000;
      temp = 89.5;
  }
  public Continent(String c, String co, int p, double t)
  {
     continent = c;
     country = co;
     population = p;
     temp = t;
    }
  public String toString()
  {
      String sen = "Continent: " +continent+ "\nCountry: " +country
                    +"\nPopulation: "+population +"\nTemperature: "+ temp;
      return sen;
  }
  public static void funfact()
  {
      System.out.println("India ugly");
  }
}
