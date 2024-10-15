import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String playerAChoice = "";
        String playerBChoice = "";
        String playAgain = "";
        boolean validInput = false;

        do
        {
            do
            {
                System.out.print("Player A, enter your move [RPS]: ");
                playerAChoice = in.nextLine();
                validInput = playerAChoice.equalsIgnoreCase("R") || playerAChoice.equalsIgnoreCase("P") || playerAChoice.equalsIgnoreCase("S");
                if (!validInput)
                {
                    System.out.println("Invalid input. Please enter R, P,or S");
                }
            } while (!validInput);

            do
            {
                System.out.print("Player B, enter your move [RPS]: ");
                playerBChoice = in.nextLine().toUpperCase();
                validInput = playerBChoice.equalsIgnoreCase("R") || playerBChoice.equalsIgnoreCase("P") || playerBChoice.equalsIgnoreCase("S");
                if (!validInput)
                {
                    System.out.println("Invalid input. Please enter R, P,or S");
                }
            } while (!validInput);

            if (playerAChoice.equalsIgnoreCase(playerBChoice))
            {
                System.out.println(playerAChoice.toUpperCase() + " vs " + playerBChoice.toUpperCase() + "! It's a tie!");
            } else if (playerAChoice.equalsIgnoreCase("R") && playerBChoice.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks Scissors! Player A wins!");
            } else if (playerAChoice.equalsIgnoreCase("S") && playerBChoice.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cut Paper! Player A wins!");
            } else if (playerAChoice.equalsIgnoreCase("P") && playerBChoice.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock! Player A wins!");
            } else if (playerBChoice.equalsIgnoreCase("R") && playerAChoice.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks Scissors! Player B wins!");
            } else if (playerBChoice.equalsIgnoreCase("S") && playerAChoice.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cut Paper! Player B wins!");
            } else if (playerBChoice.equalsIgnoreCase("P") && playerAChoice.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock! Player B wins!");
            }


            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = in.nextLine().toUpperCase();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");

    }
}
