package CrackingTheCoding.Arrays;

public class OneAway {
    public boolean checkOneAway(String s1, String s2)
    {
        int index1 =0;
        int index2 =0;
        String first = s1.length() > s2.length() ? s2 : s1;
        String second = s1.length() > s2.length() ? s1 : s2;
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
                if(first.length() == second.length())
                {
                    index1++;
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
