import java.util.Scanner;
import java.util.ArrayList;
// By Cade Fujitani
public class Guess
{
    public static void hangman(char guess)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("What letter do you guess?");
        for (int i = 0; i < guessWord.length(); i++)
        {
            if (secretWord.charAt(i) == guess.charAt(0))
            {
                String display += guess.charAt(0);
            }
            else if
        }

    }
}