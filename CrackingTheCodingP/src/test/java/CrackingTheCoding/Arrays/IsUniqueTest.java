package CrackingTheCoding.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueTest {

    @Test
    public void isUnique() {
        IsUnique test = new IsUnique();
        String testA = "huang";
        String testB ="huangshiyu";
        assertTrue(test.IsUnique(testA));
        assertFalse(test.IsUnique(testB));
        assertTrue(test.IsUnique(""));
        assertTrue(test.IsUnique(" "));
        assertTrue(test.IsUnique("    "));
    }
}