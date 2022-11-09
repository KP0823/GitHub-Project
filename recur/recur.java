public class recur
{
    public static void ret (int x)
    {
        if(x == 10)
            System.out.println("10");
        else
            ret(x-1);
        System.out.println("hi " + x);
    }
    public static void main(String [] args)
    {
        ret(12);
    }
}
