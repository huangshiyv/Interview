package CrackingTheCoding.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyTest {

    @Test
    public void urlify() {
        URLify url = new URLify();
        assertEquals(url.urlify("Mr John Smith    ",13),"Mr%20John%20Smith");
    }
}