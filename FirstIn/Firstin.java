    import java.util.ArrayList;
    import java.util.Scanner;
    
    public class Firstin
    {
        public static String output ()
        {
            Scanner input = new Scanner(System.in);
            System.out.println("To reverse the array please type r or rev");
            System.out.println("To print the normal array please type n or nor");
            System.out.println("To the array to be double please type d or double");
            System.out.println("To mirror the array please type m or mirror");
            String b = input.next();
            return b;
        }
        public static void fromArray (int[] arr, String s)
        {
            ArrayList<Integer> toarray = new ArrayList<Integer>();
            if(s.equals("r")||s.equals("rev"))
            {
                for(int i = arr.length-1; i >=0 ; i--)
                {
                    toarray.add(arr[i]);
                }
                System.out.println(toarray);
            }
            else if(s.equals("n")||s.equals("nor"))
            {
                for(int i = 0; i < arr.length; i++)
                {
                    toarray.add(arr[i]);
                }
                System.out.println(toarray);
            }
            else if(s.equals("d")|| s.equals("double"))
            {
                int[]newarr = new int[arr.length * 2];
                for(int i =0; i < arr.length; i++)
                {
                    newarr[i]=+arr[i];
                    toarray.add(newarr[i]);
                }
                for(int z = 0, b = arr.length; z < b && b < newarr.length; z++,b++)
                {
                    newarr[b]=arr[z];
                    toarray.add(newarr[b]);
                }
                System.out.println(toarray);
            }
            else if(s.equals("m")|| s.equals("mirror"))
            {
                int[]newarr = new int[arr.length *2];
                for(int i =0; i < arr.length; i++)
                {
                    newarr[i]=+arr[i];
                    toarray.add(newarr[i]);
                }
                for(int z = arr.length-1, b = arr.length; z >=0 && b < newarr.length; z--,b++)
                {
                  newarr[b]= arr[z];
                  toarray.add(newarr[b]);
                }
                System.out.println(toarray);
            }
            else
                System.out.println("Fuck follow the instruction");
      
        }
    public static void main (String [] args)
    {
     int[] array = {1,2,3};
     String s = output();
     fromArray(array,s);
    }
}
