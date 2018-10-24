package CrackingTheCoding.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPermutationTest {

    @Test
    public void checkPermutation() {
        CheckPermutation check = new CheckPermutation();
        assertTrue(check.checkPermutation("dog","god"));
    }
}