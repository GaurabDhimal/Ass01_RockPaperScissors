import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playA = "";
        String playB = "";
        String playAgain = "";
        boolean done = false;
        boolean p2Done = false;
        boolean p1Done = false;
        String trash = "";


        do
        {
            do
            {
                System.out.print("Player 1 enter your move[RPS]: ");
                if (in.hasNextLine())
                {
                    playA = in.nextLine();
                    p1Done = true;

                    do {
                        System.out.print("Player 2 enter your move[RPS]: ");
                        if (in.hasNextLine())
                        {
                            playB = in.nextLine();
                            p2Done = true;

                            if (playA.equalsIgnoreCase("R") & playB.equalsIgnoreCase("R"))
                            {
                                System.out.println("Rock vs Rock! It's a tie!");
                            } else if (playA.equalsIgnoreCase("R") & playB.equalsIgnoreCase("P"))
                            {
                                System.out.println("Paper covers Rock! Player 2 wins!");
                            } else if (playA.equalsIgnoreCase("R") & playB.equalsIgnoreCase("S"))
                            {
                                System.out.println("Rock smashes Scissors! Player 1 wins!");
                            } else if (playA.equalsIgnoreCase("P") & playB.equalsIgnoreCase("R"))
                            {
                                System.out.println("Paper covers Rock! Player 1 wins!");
                            } else if (playA.equalsIgnoreCase("P") & playB.equalsIgnoreCase("P"))
                            {
                                System.out.println("Paper vs Paper! It's a tie!");
                            } else if (playA.equalsIgnoreCase("P") & playB.equalsIgnoreCase("S"))
                            {
                                System.out.println("Scissors cuts Paper! Player 2 wins!");
                            } else if (playA.equalsIgnoreCase("S") & playB.equalsIgnoreCase("R"))
                            {
                                System.out.println("Rock smashes Scissors! Player 2 wins!");
                            } else if (playA.equalsIgnoreCase("S") & playB.equalsIgnoreCase("P"))
                            {
                                System.out.println("Scissors cut Paper! Player 1 wins!");
                            }
                            else
                            {
                                System.out.println("Scissors vs Scissors! It's a tie!");
                            }

                            System.out.print("Would you like to play again [YN]: ");
                            if(in.hasNextLine())
                            {
                                playAgain = in.nextLine();
                                        if(playAgain.equalsIgnoreCase("Y"))
                                        {
                                            done = false;
                                        }
                                        else
                                        {
                                            done = true;
                                        }
                            }
                            else
                            {
                                trash = in.nextLine();
                                System.out.println(trash + " is not a valid input, try again!");
                            }

                        }
                        else
                        {
                            trash = in.nextLine();
                            System.out.println(trash + " is not a valid input, try again!");
                        }
                    }while(!p2Done);
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a valid input, try again!");
                }
            }while(!p1Done);
        }while(!done);
    }
}