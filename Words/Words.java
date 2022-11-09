import java.util.ArrayList;
public class Words
{
   public static ArrayList<String> words(String[] list)
   {
       String one;
       String two;
       String three;
       ArrayList <String> pairs = new ArrayList<>();
       for(int i = 0; i <list.length;i++)
       {
           one = list[i];
           for(int k = i+1; k<list.length;k++)
           {
              two = list[k];
              three = one + " "+ two;
              pairs.add(three);
            }           
        }
       return pairs;
   }
   public static ArrayList<String> pairs(String[] list)
   {
     String one;
     String two;
     String three;
     ArrayList <String> twoone = new ArrayList<>();
     for(int i =0; i<list.length; i++)
     { 
          one = list[i].substring(0,list[i].length()/2);
          for(int b = 1; b<list.length; b++)
          {   if(list[i] != list[b])
              {
              two = list[b].substring(list[b].length()/2);
              three = one +two;
              twoone.add(three);
            }
          }
        }
        return twoone;
    }
   
   public static void main(String [] args)
   {
       String[] mylist = {"The","Red","Fox","Cries"};
       String hello = "hellohello";
       String stop=hello.substring(0,hello.length()/2);
       String stop1 = hello.substring(hello.length()/2);
       System.out.println(stop);
       System.out.println(stop1);
       
       System.out.println(words(mylist));
       System.out.println(pairs(mylist));
   }


}