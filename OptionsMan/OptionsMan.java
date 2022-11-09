import java.util.ArrayList;
import java.util.Scanner;

public class OptionsMan
{

    public static void talk()
    {
        String in ="";
        String stop= "stop";
        String yes = "yes";
        String out = "";
        while(in!= stop)
        {
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            System.out.println("Want to change you sentence into numbers???");
            System.out.println("If yes then type yes");
            System.out.println("If not type 'stop' exactly how it typed"); 
            in = input.next();
            if(in.equals(yes))
            {
                System.out.println("");
                System.out.println("also just to let you know 27 = space");
                out= input2.nextLine();
                System.out.println("");
                System.out.println("This is ur sentence: " +out );
                convert(out);
                System.out.println("");
                System.out.println("");
            }
            if(in.equals(stop))
            {
                break;
            }
            
        }
    }
    public static void convert (String sentence)
    {
        ArrayList<String> strTolen = new ArrayList<String>();
        ArrayList<String> caps = new ArrayList<String>();
        strTolen.add("a");
        strTolen.add("b");
        strTolen.add("c");
        strTolen.add("d");
        strTolen.add("e");
        strTolen.add("f");
        strTolen.add("g");
        strTolen.add("h");
        strTolen.add("i");
        strTolen.add("j");
        strTolen.add("k");
        strTolen.add("l");
        strTolen.add("m");
        strTolen.add("n");
        strTolen.add("o");
        strTolen.add("p");
        strTolen.add("q");
        strTolen.add("r");
        strTolen.add("s");
        strTolen.add("t");
        strTolen.add("u");
        strTolen.add("v");
        strTolen.add("w");
        strTolen.add("x");
        strTolen.add("y");
        strTolen.add("z");
        strTolen.add(" ");
        caps.add("A");
        caps.add("B");
        caps.add("C");
        caps.add("D");
        caps.add("E");
        caps.add("F");
        caps.add("G");
        caps.add("H");
        caps.add("I");
        caps.add("J");
        caps.add("K");
        caps.add("L");
        caps.add("M");
        caps.add("N");
        caps.add("O");
        caps.add("P");
        caps.add("Q");
        caps.add("R");
        caps.add("S");
        caps.add("T");
        caps.add("U");
        caps.add("V");
        caps.add("W");
        caps.add("X");
        caps.add("Y");
        caps.add("Z");
        caps.add(" ");
        ArrayList<Integer> mycon = new ArrayList<Integer>();
        String mynew;
        for(int i = 0; i <sentence.length(); i++)
        {
            mynew= ""+ sentence.charAt(i);
            for(int k = 0; k < strTolen.size()&& k < caps.size(); k++)
            {
                    if( mynew.equals(strTolen.get(k)) || mynew.equals(caps.get(k)))
                        mycon.add(k+1);
            }
        }
        System.out.println(mycon);
    }    
    public static void main(String [] args)
    {
        talk();
    }
}