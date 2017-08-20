import java.util.Scanner;
/**
 * Sets the game up by gaining user input
 * 
 * @Ryan
 * @1.0 (8/19/17)
 */
public class Driver
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String ans = "";
        do
        {
            System.out.println("Do you want to play Tic-Tac-Toe? [yes/no]");
            ans = scan.nextLine();
        }while(!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase("no"));
        if(ans.equalsIgnoreCase("yes"))
        {
            Game myGame = new Game();
        }
        else
        {
            System.out.println("Goodbye.");
        }
    }
}
