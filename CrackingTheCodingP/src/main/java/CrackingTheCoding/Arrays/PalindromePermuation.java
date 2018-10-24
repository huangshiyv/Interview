package CrackingTheCoding.Arrays;

import java.util.List;

public class PalindromePermuation {
    public boolean checkPalindrome(String s)
    {
        int[] table = buildCharFrequencyTable(s);
        return checkMaxOneOdd(table);
    }

    public boolean checkMaxOneOdd(int[] table)
    {
        boolean found = false;
        for(int value : table)
        {
            if(value % 2 == 1)
            {
                if(found)
                {
                    return false;
                }
                found = true;
            }
        }
        return true;
    }

    public int getCharIntValue(char c)
    {
        int minValue = Character.getNumericValue('a');
        int value = Character.getNumericValue(c)-minValue;
        int maxValue = Character.getNumericValue('z');
        if(minValue <= Character.getNumericValue(c) && Character.getNumericValue(c) <=maxValue)
        {
            return value;
        }
        else{
            return -1;
        }
    }
    public int[] buildCharFrequencyTable(String s)
    {
        int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a') + 1];
        for(char c : s.toCharArray())
        {
            int value = getCharIntValue(c);
            if(value != -1)
            {
                table[value]++;
            }
        }
        return table;
    }

}
