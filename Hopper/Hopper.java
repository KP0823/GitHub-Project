import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException; 
import java.io.FileOutputStream;
public class Hopper
{
    public static int position = 0;
    public static int goal=0;
    public static int minJ=0;
    public static int maxJ=0;
    public static int counter=0;
    public static int thec = 0;
    public static int cou = 0;
    public static void hop(int minjump,int maxjump)
    {
        int jump=0;
        int backward = 0;
        int forward =0;
        double b = .4995;
        counter++;
        if(Math.random()<= b)
        {
            backward =(int)(Math.random()*(maxjump - minjump)) + minjump;
            backward= backward*(-1);
            position += backward;
            //System.out.println(position);
        }
        if(Math.random()>b)
        {
            forward =(int)(Math.random()*(maxjump - minjump )) + minjump;
            position += forward;
            //System.out.println(position);
        }
        if(position == goal)
        {
            addtodoc();
            System.out.println("Your goal was " +goal+ " and it took " +counter+ " jumps");
            System.exit(0);
        }
    }
    public static void jumping(int p, int g, int mj, int mxj)
    {
        while(p != g)
        {
            hop(mj,mxj);
            addtodoc();
        }
    }
    public static void addtodoc()
        {
       try{
        String place ="Jumped " +counter+ " times " + ""+position;
        String space = "\n";
        String endgoal; 

        BufferedWriter bw= new BufferedWriter(new PrintWriter(new FileOutputStream("C:\\Users\\piyuk\\Java Files\\place.txt",true)));
        bw.write(place);
        bw.write(space);
        if(position == goal)
        {
             endgoal = "Your goal was " +goal+ " and it took " +counter+ " jumps";
             bw.write(endgoal);
        }
        bw.close();
        
    } 
        catch(IOException e){}
        
    }
    public static void togoal(int c , int p, int g, int mj, int mxj)
    {
     while(position != goal)
     {
         
         while(thec<=cou)
         {
             togoalchange(mj,mxj);
             addtodocforc();
             if(thec >cou)
                System.exit(0);
        
             
             if(position ==goal )
             {
                 
                 System.out.println("You reached your postion of " +g+ " within your counter of " + cou + " at " + thec +" jumps");
                 addtodocforc();
                 System.exit(0);
                 
             }
             
             else if(position!=goal&& thec==cou)
             {
                 
                 System.out.println("To bad you did not reach your goal of " +g + " within your counter of "+cou ); 
                 addtodocforc();
                 System.exit(0);
                 
             }
         }
     }
    }
    public static void togoalchange(int min, int max)
    {
        int jump=0;
        int backward = 0;
        int forward =0;
        double b = .4995;
        if(Math.random()<= b)
        {
            thec++;
            backward =(int)(Math.random()*(max - min)) + min;
            backward= backward*(-1);
            position += backward;
            System.out.println("count " + thec +" po "+position);
        }
        if(Math.random()>b)
        {
            thec++;
            forward =(int)(Math.random()*(max - min )) + min;
            position += forward;
            System.out.println("count " + thec +" po "+position);
        }   
    }
    public static void addtodocforc()
    {
       {
       try{
        String place ="Jumped " +thec+ " times " + ""+position;
        String space = "\n";
        String endgoal; 

        BufferedWriter bw= new BufferedWriter(new PrintWriter(new FileOutputStream("C:\\Users\\piyuk\\Java Files\\place.txt",true)));
        bw.write(place);
        bw.write(space);
        if(thec == cou && position== goal)
        {
             endgoal = "Your goal was " +goal+ " and your guess was "+ cou + " jumps or less and it took "+thec +" jumps";
             bw.write(endgoal);
        }
        else if (thec == cou && position != goal)
        {
            endgoal= "Your goal was " +goal+ " and you got to "+ position +" within "+ thec + " jumps "; 
            bw.write(endgoal);
        }
        bw.close();
        
    } 
        catch(IOException e){}
        
    }
    }
    public static void game()
    {
        Scanner po = new Scanner(System.in);
        Scanner go = new Scanner(System.in);
        Scanner minjp = new Scanner(System.in);
        Scanner maxjp = new Scanner(System.in);
        Scanner count = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("postion plz be int");
        String pos= po.next();
        position = Integer.parseInt(pos);
        System.out.println("goal plz be int");
        String gol = go.next();
        goal= Integer.parseInt(gol);
        System.out.println("min jump plz be int");
        String minjup = minjp.next();
        minJ= Integer.parseInt(minjup);
        System.out.println("max jump plz be int");
        String maxjup = maxjp.next();
        maxJ=Integer.parseInt(maxjup);
        System.out.println("Do you want to guess the max amount of tries it will take to reach your number");
        String ins = input.next();
        if(ins.equals("yes"))
        {
            System.out.println("guess a number");
            String countss = count.next();
            cou = Integer.parseInt(countss);
            togoal(cou,position, goal, minJ, maxJ);
        }
        else
            jumping(position, goal, minJ, maxJ);

    }
    public static void main(String[] args)
    {
     game();   
    }
}
