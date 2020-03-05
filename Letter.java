public class Letter
{
    private String letter;
    private boolean find;

    //constructors
    public Letter(String l)
    {
        letter = l;
        find = false;
    }
    private ArrayList<Letter> loadWord (String k)
    {
        ArrayList<Letter> output = new ArrayList<Letter>();
        for (int i = 0; i < k; i++)
        {
            k.charAt(i);
        }
    }
    // create a letter as a string and a boolean function
    public Letter(String l, boolean p)
    {
        letter = l;
        find = p;
    }
    // if Letter is correct, make find = true
    public void setFound(boolean p)
    {
        find = p;
    }
    //get letter from a string
    public String getLetter()
    {
        return letter;
    }
    // compare two Ltters together and if a negative value, then they do not match
    public int compareTo(Letter other)
    {
        int output = -1;
        if (letter.equals(other.getLetter()))
        {
            output = 0;
        }
        return output;
    }
    // check if Letter has find = true, then reveal letter if not print "_"
    public String toString()
    {
        if (find)
        {
            return letter;
        }
        else
        {
            return "_";
        }
    }
}