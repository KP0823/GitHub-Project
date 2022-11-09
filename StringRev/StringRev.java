public class StringRev
{
    public static String turn (int b)
    {
        String number = "" + b;
        String result= "";
        for(int i = number.length() -1 ; i >= 0; i--)
            result = result + number.charAt(i);
        return result;
    }    
    public static void main (String[] args)
    {
        System.out.println(turn(-100));
        
    }
}

