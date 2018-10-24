package CrackingTheCoding.Arrays;

public class OneAway {
    public boolean checkOneAway(String first, String second)
    {
        int index1 =0;
        int index2 =0;
        first = first.length() > second.length() ? second : first;
        second = first.length() > second.length() ? first : second;
        if((second.length() -first.length()) > 1)
        {
            return false;
        }
        boolean founded =false;
        while (index1 <first.length() && index2 < second.length())
        {
            if(first.charAt(index1) != second.charAt(index2))
            {
                if(founded)
                {
                    return false;
                }
                founded = true;
            }else
            {
                index1++;
            }
            index2 ++;
        }
        return true;
    }
}
