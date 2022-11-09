//learning arrays
public class Ar
{
   public static int arr(int[]my)
   {
       for(int i= 0; i<my.length-1; i++)
       {
               my[my.length-1]+= my[i];
            }

       int jk = my[my.length-1];
       return jk;
   }
   public static int totalOfTwo (int[] first, int[] second)
   {
       int total= 0;
       int i =0;
       int k=0;
       while(i<first.length)
       {
           total= total+ first[i];
           i++;
       }
       while(k<second.length)
       {
           total= total+ second[k];
           k++;
       }
       
       return total;
   }
   public static int fs (int[]first, int[] second)
   {
       int total=0;
       for(int i = 0; i<first.length;i++) 
       {
                if(i<first.length)
                    total+=first[i];
                if(i<second.length)
                    total+=second[i];

       }
       return total;
   }
   public static int jk(int[] first, int[] second)
   {
       int total =0;
       for(int i = 0; i<first.length; i++)
       {
           total+=first[i];
       }
       for(int k=0; k<second.length;k++)
       {
           total+=second[k];
       }
       return total;
   }
   public static void main(String[] args)
   {
       int[] cry = {1,2,3,0};
       int[] test1 ={1,2};
       int[] test2 ={1};
       System.out.println(arr(cry));
       System.out.println(totalOfTwo(test1,test2));
       System.out.println(fs(test1,test2));
       System.out.println(jk(test1,test2));
   }
}
