package CrackingTheCoding.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {

    @Test
    public void checkOneAway() {
        OneAway test = new OneAway();
        assertTrue(test.checkOneAway("apple","applek"));
        assertTrue(test.checkOneAway("apple","aple"));
        assertTrue(test.checkOneAway("apple","apkle"));
        assertFalse(test.checkOneAway("apple","aplep"));
        assertFalse(test.checkOneAway("apple","apklep"));
        assertFalse(test.checkOneAway("apple","akle"));
    }
}