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
        ArrayList<Letter> hidden = new ArrayList<Letter>();
        hidden.add(new Letter(""))
        String word = dictionary.get(guessWord);
        String secretWord = new String(new char[word.length()]).replace("\0", "_ ");
        // generate amount of attempts
        int attempts = 0;
        boolean correct = false;
        Scanner kb = new Scanner(System.in);
        //make gamemode false until game is won
        System.out.println("Welcome to Hangman!");
        while (attempts < 7 && secretWord.contains("_"))
        {
            System.out.println("You have used "+ attempts + " out of 7 attempts left." );
            System.out.println("Enter a single character: ");
            System.out.println(secretWord);
            String guess = kb.next();
            pastguesses.add(guess);
            System.out.println(pastguesses + " ");
            for (int i = 0; i < word.length(); i++)
            {
                hidden.add(new Letter(i));
                if (guess.charAt(0) == word.charAt(i))
                {
                    int index = word.indexOf(guess);
                    String temp = word.substring(0, index);
                    temp += secretWord.substring(0, index);
                    temp += secretWord.substring(index + 1);
                    correct = true;
                }
                if (correct = true)
                {
                    System.out.println("Correct! That letter is in the word!");
                    break;
                }
                else
                {
                    System.out.println("Incorrect! That letter is not in the word! Try another letter! ");
                    attempts++;
                    break;
                }
            }
            if (attempts == 7)
            {
                System.out.println("You ran out of guesses! The word was " + word);
            }
            if (secretWord.equals(word))
            {
                System.out.println("Correct! You win! The word was " + word);
            }
        }
    }
}