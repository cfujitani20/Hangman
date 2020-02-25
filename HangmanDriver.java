import java.util.Scanner;
import java.util.ArrayList;
// By Cade Fujitani
public class HangmanDriver
{
    public static void main(String[] args)
    {
        // generate dictionaryionary and arraylist
        ArrayList<String> dictionary = new ArrayList<String>();
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
        String guessWord = dictionary.get((int)(Math.random() * dictionary.size()));
        String display = "";
        for (int i = 0; i < guessWord.length(); i++)
        {
            display += "_";
        }
        int attempts = 7;
        //make gamemode false until game is won
        boolean gameOver = false;
        while (!gameOver)
        {
            System.out.println("Welcome to Hangman!");
        }
    }
}