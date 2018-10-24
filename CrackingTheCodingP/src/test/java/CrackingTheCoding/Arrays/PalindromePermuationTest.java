package CrackingTheCoding.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermuationTest {

    @Test
    public void checkPalindrome() {
        PalindromePermuation check = new PalindromePermuation();
        assertTrue(check.checkPalindrome("taco cat"));
        assertFalse(check.checkPalindrome("taco cat k :"));
    }
}