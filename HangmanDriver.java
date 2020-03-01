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
        ArrayList<String> pastguesses = new ArrayList<String>();
        // convert a random word from the arraylist into a blank word for guessing
        int guessWord = ((int)(Math.random() * dictionary.size()));
        String word = dictionary.get(guessWord);
        char[] secretWord;
        secretWord = new char[word.length()];
        for (int i = 0; i < secretWord.length; i++)
        {
            secretWord[i] = '_';
        }
        // generate amount of attempts
        int attempts = 7;
        Scanner kb = new Scanner(System.in);
        //make gamemode false until game is won
        boolean gameOver = false;
        while (!gameOver && attempts > 0)
        {
            while (attempts > 0)
            System.out.println("Welcome to Hangman!");
            System.out.println("Current guesses left:" + attempts);
            System.out.println("Enter a single character: ");
            System.out.println(secretWord);
            String guess = kb.nextLine();
            pastguesses.add(guess);
            String tempsecret;
            for (int i = 0; i < secretWord.length; i++)
            {
                 if (secretWord[i] == guess.charAt(0))
                 {
                     tempsecret += guess.charAt(0);
                 }
                 else if (tempsecret.charAt(i) != '_')
                 {
                    tempsecret += word.charAt(i);
                 }
                 else
                 {
                     tempsecret += '_';
                 }
            }
            if (secretWord.equals(tempsecret))
            {
                attempts--;
            }
            else
            {
                secretWord = tempsecret;
            }
            if (secretWord.equals(word))
            {
                System.out.println("Correct! You win! The word was "+ word);
                gameOver = true;
            }
        }
    }
}