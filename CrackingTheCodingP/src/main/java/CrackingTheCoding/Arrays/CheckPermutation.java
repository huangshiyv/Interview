package CrackingTheCoding.Arrays;

import java.util.Arrays;

public class CheckPermutation {
    public String sort(String s )
    {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public boolean checkPermutation(String s, String t)
    {
       if(s.length() != t.length())
       {
            return false;
       }
       else{
           return sort(s).equals(sort(t));
       }
    }
    public static void main( String[] args )
    {

    }
}
