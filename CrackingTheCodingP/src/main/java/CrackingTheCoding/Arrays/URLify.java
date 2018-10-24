package CrackingTheCoding.Arrays;

public class URLify {
    public String urlify(String url, int index)
    {
        return url.substring(0,index).replace(" ","%20");
    }
}
