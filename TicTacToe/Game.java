import java.util.Scanner;
//import java.math.
/**
 * The game code for Tic-Tac-Toe 
 * 
 * @RyanRegier
 * @1.0 (8/19/17)
 */
public class Game
{
    private static int[][] Board;
    private Scanner scan = new Scanner(System.in);
    private static int x, y, player = 1;
    public Game()
    {
        getPlayer();
        generateBoard();
        printBoard();
        Test();
        //gameLoop();
    }

    public void getPlayer()//ask user if they want to play AI or human
    {        
        int ans;
        do
        {
            System.out.println("Do you want to play Tic-Tac-Toe against computer or another human? [0/1]");
            ans = scan.nextInt();
        }while(ans != 0 && ans != 1);
        if(ans == 0)
        {
            
        }
        else
        {

        }
    }

    public void generateBoard()//used to start a new game
    {
        Board = new int[3][3];
        System.out.println("0 1 2");
        for(int r = 0; r < Board.length; r++)
        {
            for(int c = 0; c < Board[0].length; c++)
            {
                Board[r][c] = 0;
            }
        }
    }

    public void printBoard()//prints out 3x3 board to console, use this method before the game begins and after every move
    {
        for(int i = 0; i < 25; i++)
        {
            System.out.println();
        }
        System.out.println("0 1 2");
        System.out.println();
        for(int r = 0; r < Board.length; r++)
        {
            for(int c = 0; c < Board[0].length; c++)
            {
                System.out.print(Board[r][c] + " ");
            }
            System.out.println();
        }
    }

    public void userMove()
    {
        do
        {
            System.out.println("Enter the X-Coordinate");
            x = scan.nextInt();
            System.out.println("Enter the Y-Coordinate");
            y = scan.nextInt();
        }while(x != 0 && x != 1 && x != 2 && y != 0 && y != 1 && y != 2);
    }

    public int checkMove(int x, int y)//checks if the users move is a legal one
    {
        //return 0 if the move is open
        //1 if player 1 is there
        //2 if player 2 or computer is there
        int num = 3;
        for(int r = 0; r < Board.length; r++)
        {
            for(int c = 0; c < Board[0].length; c++)
            {
                if(r == x && y == c)
                {
                    num = (Board[r][c]);                    
                }
            }
        }
        return(num);
    }
    public void Test()//for testing purposes only
    {
        userMove();
        System.out.println("The number on the entered position (" + x +"," + y + ") is " + checkMove(x, y));
        System.out.println(updateBoard());
        printBoard();
    }
    public boolean updateBoard()//returns true if successfully update board, false otherwise
    {
        int num;
        num = checkMove(x,y);
        if(num == 0)
        {
            Board[x][y] = 1;
            return(true);
        }
        return(false);
    }
    public boolean gameLoop() //checks if there is a winner, return true if there is a winner, false if not
    {
        return(false); //placeholder
    }

    public void computerMove()
    {

    }
}
