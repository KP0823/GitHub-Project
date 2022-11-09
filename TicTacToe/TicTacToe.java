import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
public class TicTacToe
{
   public static char[][] board = { 
    {'-','-','-'},
    {'-','-','-'},
    {'-','-','-'}
    };
   public static char player1='x';
   public static char player2='o';
   public static char win = 'w';
   public static char tie ='t';
   public static int counter = 1;
   public static String thewin ="";
   public static String content = "";
   
   public static void checkspace(char pl,int row, int col)
   { 
     Scanner rows = new Scanner(System.in);
     Scanner cols = new Scanner(System.in);
     while(row>2||row<0)
     {
         System.out.println("??? hello type the row again");
         String r = rows.next();
         row =Integer.parseInt(r);
     }
     while(col>2||col<0)
     {
         System.out.println("??? hello type the column again");
         String c = cols.next();
         col =Integer.parseInt(c);
     }
       if(board[row][col]=='-')
       {
            board[row][col]= pl;
            storedata(pl,row,col);
       }    
       else
            tryagain(pl);
       
    }
   public static void tryagain(char pl)
   {
     System.out.println("You either made a mistake or u blind");
     System.out.println("");
     Scanner rows = new Scanner(System.in);
     Scanner cols = new Scanner(System.in);
     System.out.println("Type again which row!!!!!!!!!!!");
     String r = rows.next();
     System.out.println("Type again which column!!!!!!!!!!!"); 
     String c = cols.next();
     int ro =Integer.parseInt(r);
     int co =Integer.parseInt(c);

     checkspace(pl,ro,co);  
   }
   public static void showgrid()
   {
     System.out.println("0 1 2");
     
     for(int i = 0; i < board.length; i++)
     {
         for(int j =0; j < board[i].length; j++)
         {
             System.out.print(board[i][j] + " ");
         }
         System.out.println("");
         
     }
   }
   
   public static void checkwin()
   {
       String winner = "";
       if(board[0][0]=='x'&&board[0][1]=='x'&&board[0][2]=='x')
       {
            player1 = win;
            System.out.println("Player 1 congratulations you won");
            winner= "Player 1 congratulations you won";
            showgrid();
            System.exit(0);
       }
       else if(board[1][1]=='x'&&board[1][2]=='x'&&board[1][0]=='x')
       {
            player1= win;
            System.out.println("Player 1 congratulations you won");
            winner= "Player 1 congratulations you won";
            showgrid();
            System.exit(0);
       }
       else if(board[2][1]=='x'&&board[2][2]=='x'&&board[2][0]=='x')
       {
            player1=win;
            System.out.println("Player 1 congratulations you won");
            winner= "Player 1 congratulations you won";
            showgrid();
            System.exit(0);
       }
       //---------------------------------------------------------- vertcal for x
       else if(board[0][0]=='x'&&board[1][0]=='x'&&board[2][0]=='x')
       {
            player1= win;
            System.out.println("Player 1 congratulations you won");
            winner= "Player 1 congratulations you won";
            showgrid();
            System.exit(0);
       }
       else if(board[0][1]=='x'&&board[1][1]=='x'&&board[2][1]=='x')
       {
            player1= win;
            System.out.println("Player 1 congratulations you won");
            winner= "Player 1 congratulations you won";
            showgrid();
            System.exit(0);
       }
       else if(board[0][2]=='x'&&board[1][2]=='x'&&board[2][2]=='x')
       {
            player1= win;
            System.out.println("Player 1 congratulations you won");
            winner= "Player 1 congratulations you won";
            showgrid();
            System.exit(0);
       }
       //----------------------------------------------------------- hortizontal for x
       else if(board[0][0]=='x'&&board[1][1]=='x'&&board[2][2]=='x')
       {
            player1= win;
            System.out.println("Player 1 congratulations you won");
            winner= "Player 1 congratulations you won";
            showgrid();
            System.exit(0);
       }
       else if(board[0][2]=='x'&&board[1][1]=='x'&&board[2][0]=='x')
       {
            player1= win;
            System.out.println("Player 1 congratulations you won");
            winner= "Player 1 congratulations you won";
            showgrid();
            System.exit(0);
       }
       //----------------------------------------------------------- diagonal for x
       if(board[0][0]=='o'&&board[0][1]=='o'&&board[0][2]=='o')
       {
            player2 = win;
            System.out.println("Player 2 congratulations you won");
            winner= "Player 2 congratulations you won";
            showgrid();
            System.exit(0);
       }
       else if(board[1][1]=='o'&&board[1][2]=='o'&&board[1][0]=='o')
       {
            player2 = win;
            System.out.println("Player 2 congratulations you won");
            winner= "Player 2 congratulations you won";
            showgrid();
            System.exit(0);
       }
       else if(board[2][1]=='o'&&board[2][2]=='o'&&board[2][0]=='o')
       {
            player2 = win;
            System.out.println("Player 2 congratulations you won");
            winner= "Player 2 congratulations you won";
            showgrid();
            System.exit(0);
       }
       //---------------------------------------------------------- vertcal for o
       else if(board[0][0]=='o'&&board[1][0]=='o'&&board[2][0]=='o')
       {
            player2 = win;
            System.out.println("Player 2 congratulations you won");
            winner= "Player 2 congratulations you won";
            showgrid();
            System.exit(0);
       }
       else if(board[0][1]=='o'&&board[1][1]=='o'&&board[2][1]=='o')
       {
            player2 = win;
            System.out.println("Player 2 congratulations you won");
            winner= "Player 2 congratulations you won";
            showgrid();
            System.exit(0);
       }
       else if(board[0][2]=='o'&&board[1][2]=='o'&&board[2][2]=='o')
       {
            player2 = win;
            System.out.println("Player 2 congratulations you won");
            winner= "Player 2 congratulations you won";
            showgrid();
            System.exit(0);
       }
       //----------------------------------------------------------- hortizontal for o
       else if(board[0][0]=='o'&&board[1][1]=='o'&&board[2][2]=='o')
       {
            player2 = win;
            System.out.println("Player 2 congratulations you won");
            winner= "Player 2 congratulations you won";
            showgrid();
            System.exit(0);
       }
       else if(board[0][2]=='o'&&board[1][1]=='o'&&board[2][0]=='o')
       {
            player2 = win; 
            System.out.println("Player 2 congratulations you won");
            winner= "Player 2 congratulations you won";
            showgrid();
            System.exit(0);
       }
       //----------------------------------------------------------- diagonal for o   
       else 
       {
           checktie();
       }
       thewin = winner;
    }

    public static boolean checktie()
    {   
        for(int i = 0; i < board.length; i++)
           {
               for(int k =0; k< board[i].length; k++)
               {
                   if(board[i][k]=='-')
                   {
                       return false;
                   } 
               }
              
           }
         System.out.println("its a tie");
         thewin= "its a tie";
         showgrid();
         System.exit(0);
         return true;
    }
    public static void storedata(char pl, int row, int col)
    {
       try{
        content = "Turn " + counter + " Player " +pl + " row "+ row + " column "+ col +" " +thewin ;
        String space = "\n";
        BufferedWriter bw= new BufferedWriter(new PrintWriter(new FileOutputStream("C:\\Users\\piyuk\\Java Files\\The game.txt",true)));
        bw.write(content);
        bw.write(space);
        bw.close();
        
    } 
        catch(IOException e){}
        
    }
    public static void gameon()
    {
        String ro ="";
        String co ="";
        System.out.println("Game of Tic Tac Toe");
        System.out.println("Player 1 is x");
        System.out.println("Player 2 is o");
        System.out.println("Rows and Columns start from 0-2");
     
        while(win != player1|| win!= player2 || win !=tie)
        {
            System.out.println();
            System.out.println("Turn "+ counter);
            Scanner row = new Scanner(System.in);
            Scanner col = new Scanner(System.in);
            System.out.println();
            System.out.println();
            showgrid();
            System.out.println("Player 1 enter row");
            ro = row.next();
            int rows = Integer.parseInt(ro);
            System.out.println("Player 1 enter column");
            co= col.next();
            int coll =Integer.parseInt(co);
            checkspace(player1, rows, coll);
            checkwin();
            counter++;
            System.out.println();
            showgrid();
            
                //------------------------------------
            System.out.println("Turn "+ counter);
            System.out.println();
            System.out.println("Player 2 enter row");
            ro = row.next();
            rows = Integer.parseInt(ro);
            System.out.println("Player 2 enter column");
            co= col.next();
            coll =Integer.parseInt(co);
            checkspace(player2, rows, coll);
            checkwin();
            counter++;
            showgrid();
            
            
        }
    }
    public static void main(String[] args)throws IOException 
    {
        gameon();
    }

}
