import java.util.ArrayList;
import java.util.Scanner;
public class BinaryCon
{
    public static String or;
    public static String newString;
    public static String convert()
    {
        for(int i =0; i<or.length(); i++)
        {
            if(or.charAt(i)=='l')
               newString+='0';
            else if(or.charAt(i)=='I')
               newString+='1';
            else 
               newString+=' ';
        }
        return newString;
    }
    public static void main (String[]args)
    {
    or="lIIlIlll lIIIlIll lIIIlIll lIIIllll lIIIllII llIIIlIl llIlIIII llIlIIII lIIIllll lIIllllI lIIIllII lIIIlIll lIIllIlI lIIlllIl lIIlIllI lIIlIIIl llIlIIIl lIIlllII lIIlIIII lIIlIIlI llIlIIII lIlIIlIl lIIlIIlI lIIIlllI llIIllIl lIllIlll llIIllll lIIlllII lIIIllll";
    System.out.println(convert());
}
}
