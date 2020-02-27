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
        String guessWord = dictionary.get((int)(Math.random() * dictionary.size()));
        String secretWord = guessWord;
        // Arraylist<String> pastguesses = new ArrayList<String>();
        // pastguesses.add(guess);
        String display = "";
        hangman = new hangman();
        for (int i = 0; i < guessWord.length(); i++)
        {
            display += "_";
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
            char guess = kb.nextLine();
            hangman(guess);
        }
    }
}