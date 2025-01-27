import java.util.Random;
import java.util.Scanner;


public class NumberGame
{
    Random random = new Random();
    int guessingNo = random.nextInt();
    public int userGuess, levels = 1;

    public void Introduction()
    {
        System.out.println("----Welcome to Number Game---- \n Please Select Any Number From 0-100 :\n");
    }
    public void rules()
    {
        System.out.println("Note : you will get 5 chances to guess the Numbers\n Lets Start!");
    }
    public void mygame()
    {
        int Chance = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        userGuess = sc.nextInt();
        while (guessingNo != userGuess && Chance != 5)
        {   System.out.println("enter number");
            userGuess = sc.nextInt();
            Chance++;

        }
        if (guessingNo == userGuess)
        {
            System.out.println("You Won !!");
        } else {
            System.out.println("You lost !\n");
        }
    }

    public static void main(String args[])
    {
        NumberGame g = new NumberGame();

        g.Introduction();
        g.rules();
        g.mygame();

        while (true)
        {
            System.out.println("\n Select n to quit or y to play again \n");
            Scanner sc = new Scanner(System.in);
            String ch = sc.next();

            switch (ch) {

                case "n":
                    System.out.println("You are quiting soon ! See you \n");
                    break;
                case "y":
                    System.out.println("let's start again ");
                    g.mygame();
                   
                    break;

                default:
                    break;

            }
        }
    }
}
