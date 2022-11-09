public class count
{
public static int recur(int n)
{
if (n <= 10)
{
System.out.println(n*2);
return n * 2;
}
else
{
System.out.println(recur(recur(n/3)));
return recur(recur(n / 3));
}
}
public static void whatsItDo(String str)
{
int len = str.length();
if (len > 1)
{
String temp = str.substring(0, len - 1);
whatsItDo(temp);
System.out.println(temp);
}
}
public static void main(String [] args)
{
   System.out.print(recur(27));
   whatsItDo("WATCH");
}

}
