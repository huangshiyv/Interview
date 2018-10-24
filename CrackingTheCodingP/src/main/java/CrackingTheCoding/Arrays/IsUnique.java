package CrackingTheCoding.Arrays;
public class IsUnique {

    public boolean IsUnique(String str)
    {
        if(str.length() > 128)
        {
            return false;
        }
        boolean[] charSetCheckTable = new boolean[128];
        for(Character c : str.toCharArray())
        {
            if(charSetCheckTable[c])
            {
                return false;
            }
            charSetCheckTable[c] = true;
        }
        return true;
    }

    public static void main( String[] args )
    {

    }
}