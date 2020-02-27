import java.util.Scanner;
import java.util.ArrayList;
// By Cade Fujitani
public class HangmanDriver
{
    public static void main(String[] args)
    {
        // generate dictionaryionary and arraylist
        ArrayList<String> dictionary = new ArrayList<String>();
        // add each dictionary word manually
        dictionary.add("goldfish");
        dictionary.add("water");
        dictionary.add("grapes");
        dictionary.add("teeth");
        dictionary.add("potato");
        dictionary.add("computer");
        dictionary.add("cellphone");
        dictionary.add("backpack");
        dictionary.add("syzygy");
        dictionary.add("twyndyllyngs");
        // convert a random word from the arraylist into a blank word for guessing
        int guessWord = ((int)(Math.random() * dictionary.size()));
        String secretWord = dictionary.get(guessWord);
        String tempsecretWord = secretWord;
        // Arraylist<String> pastguesses = new ArrayList<String>();
        // pastguesses.add(guess);
        String[] display = secretWord.length();
        for (int i = 0; i < secretWord.length(); i++)
        {
            display[i] = "_";
        }
        // generate amount of attempts
        int attempts = 7;
        Scanner kb = new Scanner(System.in);
        //make gamemode false until game is won
        boolean gameOver = false;
        while (!gameOver && attempts > 0)
        {
            System.out.println("Welcome to Hangman!");
            System.out.println("Current guesses: " + attempts);
            System.out.println("Enter a single character: ");
            System.out.println(display);
            String guess = kb.nextLine();
            for (int i = 0; i < secretWord.length(); i++)
            {
                if (tempsecretWord.charAt(i) == guess.charAt(0))
            {
                display[i] += guess.charAt(0);
            }
            else if (tempsecretWord.charAt(i) != guess.charAt(0))
            {
                attempts --;
            }
            else
            {
                gameOver = true;
            }
        }
        }
    }
}