package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void fewerOpeningBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void onlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void fewerClosingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void closingBracketsFirstReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void openingBracketsLastReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void balancedBracketsWithTextBetweenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void unbalancedBracketsWithTextBetweenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void nestedBracketsOnTheSameDepthReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]][]]"));
    }

    @Test
    public void noBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a sample text"));
    }

    @Test
    public void unbalancedParensAreIgnoredAndReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[())]"));
    }
}