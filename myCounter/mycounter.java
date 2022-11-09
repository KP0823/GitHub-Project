import java.util.ArrayList;
public class mycounter
{
    public static ArrayList <Integer> convert (String sentence)
    {
        // this was soo inefficent when revising
        ArrayList<String> strTolen = new ArrayList<String>();
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
       
        ArrayList<Integer> mycon = new ArrayList<Integer>();
        String mynew;
        for(int i = 0; i <sentence.length(); i++)
        {
            mynew= ""+ sentence.charAt(i);
            for(int k = 0; k < strTolen.size(); k++)
            {
                if( mynew.equals(strTolen.get(k)))
                    mycon.add(k+1);
            }
        }
        return mycon;
        }
        public static String lastcon (ArrayList<Integer> list)
        {
            String characters = " abcdefghijklmnopqrstuvwxyz ";
            String ch;
            String fine = "";
            for(int i = 0; i < list.size(); i++)
            {
                for(int k= 0; k < characters.length(); k++)
                {
                    ch = "" + characters.charAt(k);
                    if(list.get(i).equals(k)) 
                        fine = fine + ch;    
                }
            }
            return fine;
        }
        public static void main(String[]args)
        {
            String one = "i am sad";
            System.out.println(convert(one));
            ArrayList<Integer> newl = new ArrayList<Integer>();
            newl.add(9);
            newl.add(27);
            newl.add(1);
            newl.add(13);
            System.out.println(lastcon(newl));
        }
    }
