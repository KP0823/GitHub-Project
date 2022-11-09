public class Meals
{
    public static double cost;
    public static String meal;
    public static int many;
    public Meals(double cost, String meal, int many)
    {
        this.cost = cost;
        this.meal = meal;
        this.many = many;
    }
    public static double getCost()
    {
        return cost;
    }
    public static String getMeal()
    {
        return meal;
    }
    public static int getMany()
    {
        return many;
    }
    public static void setCost(double x)
    {
        cost = x;
    }
    public static void setMeal(String x)
    {
        meal.equals(x);
    }
    public static void setMany(int x)
    {
        many = x;
    }
    public static void main(String[] args)
    {
        Meals happy = new Meals(10.32, "kids",1);
        System.out.println(happy.getCost());
    }
}
