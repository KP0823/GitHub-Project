import java.util.Scanner;
public class ConnectFour
{
   public static char[][]board=new char[6][7];
   public static char player1= 'x';
   public static char player2 = 'o';
   public static int therow = 5;
   public static char win = 'w';
   public static char[][]makeboard()
   {
       for(int r =0; r<board.length;r++)
       {
           for(int c =0; c<board[r].length;c++)
           {
               board[r][c]='-';
           }
       }
       return board;
   }
    public static void printboard()
    {
     System.out.println("0 1 2 3 4 5 6");
     for(int i = 0; i < board.length; i++)
     {
         for(int j =0; j < board[i].length; j++)
         {
             System.out.print(board[i][j] + " ");
         }
         System.out.println();
     }
   }

   public static void placement(char player,int row, int col)
   {
        while(col>6||col<0)
        {
          Scanner scol = new Scanner(System.in);
          String b;
          System.out.println("retype a number between 0-6");
          b= scol.next();
          col = Integer.parseInt(b);
          //therow=5;
        }
        if(therow<0)
        {
            Scanner newcol = new Scanner(System.in);
            String  c;
            System.out.println("Sorry this column is filled up try a different one");
            c= newcol.next();
            col = Integer.parseInt(c);
            therow=5;
                   
        }       
        if(board[therow][col]=='-')
        {
            board[therow][col] = player; 
        }
        else if(board[therow][col]=='x'||board[therow][col]=='o')
        {
            therow--;
            placement(player,therow,col);
        }
        therow=5;
       
   }
   public static void checkwin()
   {
       for(int r =board.length-1; r>0;r--)
       {
           for(int c =0; c<board[r].length;c++)
           {
               // horizontal x
               if(c<=3&&board[r][c]=='x'&& board[r][c+1]=='x'&&board[r][c+2]=='x'&& board[r][c+3]=='x')
               {
                   player1 = win;
                   System.out.println();
                   System.out.println("Player One wins");
                   System.out.println();
                   printboard();
                   System.exit(0);
               }
               // vertical x
               if(c>=0&&c<=6&&board[r][c]=='x'&& board[r-1][c]=='x'&&board[r-2][c]=='x'&& board[r-3][c]=='x')
               {
                   player1 = win;
                   System.out.println();
                   System.out.println("Player One wins");
                   System.out.println();
                   printboard();
                   System.exit(0);
               }    
               //diagonal / x
               if(c<=3 &&board[r][c]=='x'&& board[r-1][c+1]=='x'&&board[r-2][c+2]=='x'&& board[r-3][c+3]=='x')
               {
                   player1 = win;
                   System.out.println();
                   System.out.println("Player One wins");
                   System.out.println();
                   printboard();
                   System.exit(0);
               } 
               // diagonal \ x
               if(1<c && c<=6&&board[r][c]=='x'&& board[r-1][c-1]=='x'&&board[r-2][c-2]=='x'&& board[r-3][c-3]=='x')
               {
                   player1 = win;
                   System.out.println();
                   System.out.println("Player One wins");
                   System.out.println();
                   printboard();
                   System.exit(0);
               }
               // horizontal o
               if(c<=3 && board[r][c]=='o'&& board[r][c+1]=='o'&&board[r][c+2]=='o'&& board[r][c+3]=='o')
               {
                   player2 = win;
                   System.out.println();
                   System.out.println("Player Two wins");
                   System.out.println();
                   printboard();
                   System.exit(0);
               }
               // vertical o
               if(c>=0&&c<=6&&board[r][c]=='o'&& board[r-1][c]=='o'&&board[r-2][c]=='o'&& board[r-3][c]=='o')
               {
                   player2 = win;
                   System.out.println();
                   System.out.println("Player Two wins");
                   System.out.println();
                   printboard();
                   System.exit(0);
               }    
               //diagonal / o
               if(c<=3&&board[r][c]=='o'&& board[r-1][c+1]=='o'&&board[r-2][c+2]=='o'&& board[r-3][c+3]=='o')
               {
                   player2 = win;
                   System.out.println();
                   System.out.println("Player Two wins");
                   System.out.println();
                   printboard();
                   System.exit(0);
               } 
               // diagonal \ o
               if(1<c && c<=6&&board[r][c]=='o'&& board[r-1][c-1]=='o'&&board[r-2][c-2]=='o'&& board[r-3][c-3]=='o')
               {
                   player2 = win;
                   System.out.println();
                   System.out.println("Player Two wins");
                   System.out.println();
                   printboard();
                   System.exit(0);
               }
               else
                    checktie();
           }
        }
   }
   public static boolean checktie()
   {   
        for(int i = board.length-1; i> 0; i--)
           {
               for(int k =0; k< board[i].length; k++)
               {
                   if(board[i][k]=='-')
                   {
                       return false;
                   } 
               }
              
           }
         System.out.println();  
         System.out.println("its a tie");
         System.out.println();
         printboard();
         System.exit(0);
         return true;
    }
   public static void startgame()
   {
       String co ="";
       System.out.println("Welcome to connect four");
       System.out.println("Player One is x");
       System.out.println("Player Two is o");
       String beginning;
       System.out.println("If you want to play type start");
       Scanner cols = new Scanner(System.in);
       Scanner starter = new Scanner(System.in);
       beginning= starter.next();
       String st= "start";
       if(beginning.equals(st))
       {   makeboard();
           printboard();
           while(win!= player1 || win!= player2)
           {
               System.out.println();

               System.out.println("Player one enter a column");
               co = cols.next();
               int col = Integer.parseInt(co);
               placement(player1,therow,col);
               printboard();
               checkwin();
               System.out.println();
               //______________________________________
               System.out.println("Player two enter a column");
               co= cols.next();
               col = Integer.parseInt(co);
               placement(player2,therow,col);
               printboard();
               checkwin();
               System.out.println();               
           }
       }
       else
            System.out.println("Well maybe later");

   }
   public static void main(String[] args)
   {
       startgame();
   }
}

