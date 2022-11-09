import java.util.ArrayList;
public class WordCount
{
    public static String hMT (String x)
    {
        String extra= x;
        ArrayList <String> Sad = new ArrayList();
        for(int i = 0, k= i + 1; i<x.length() && k <x.length(); k++)
        {
            if(x.charAt(i)!= ' ' && x.charAt(k)==' '&& k<=x.length())
            {
                extra = x.substring(k);
                Sad.add(extra);
                System.out.println(Sad);
                k=0;
            }
        }
        return x;
    }
    public static void main(String [] args)
    {
        String Hello = "hi howareyou are you fine";
        System.out.println(hMT(Hello));
    }
}