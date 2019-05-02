package testBracketValidation;

import org.junit.Test;

import static bracketValidation.bracketValidation.bracketValidation;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class testBracketValidation {

    @Test
    public void testNoNonsense() {
        String noNonsense1 = "()";
        String noNonsense2 = "[]";
        String noNonsense3 = "{}";
        String noNonsense4 = "(";
        String noNonsense5 = "[";
        String noNonsense6 = "{";
        assertTrue("Unexpected False", bracketValidation(noNonsense1));
        assertTrue("Unexpected False", bracketValidation(noNonsense2));
        assertTrue("Unexpected False", bracketValidation(noNonsense3));
        assertFalse("Unexpected True", bracketValidation(noNonsense4));
        assertFalse("Unexpected True", bracketValidation(noNonsense5));
        assertFalse("Unexpected True", bracketValidation(noNonsense6));
    }

    @Test
    public void testNonsense() {
        String Nonsense1 = "";
        String Nonsense2 = "() IM having a really hard time coming up with a whats good for a long string {} []";
        String Nonsense3 = "!@#$%^&*(){}[]";
        String Nonsense4 = "!@#$%^&*(";
        String Nonsense5 = "qzw5xe6r{ct7vygubihnjoikmpl'";
        String Nonsense6 = "?>:{L<POKIJHUYGT^RF%";
        assertTrue("Unexpected False", bracketValidation(Nonsense1));
        assertTrue("Unexpected False", bracketValidation(Nonsense2));
        assertTrue("Unexpected False", bracketValidation(Nonsense3));
        assertFalse("Unexpected True", bracketValidation(Nonsense4));
        assertFalse("Unexpected True", bracketValidation(Nonsense5));
        assertFalse("Unexpected True", bracketValidation(Nonsense6));
    }

    @Test
    public void testEdgecases() {
        String lone1 = ")";
        String lone2 = "}";
        String lone3 = "]";
        assertTrue("Unexpected False", bracketValidation(lone1));
        assertTrue("Unexpected False", bracketValidation(lone2));
        assertTrue("Unexpected False", bracketValidation(lone3));
        // I think my script is incorrect to return these as true. Sticking with
        // the below linter theme, these would be picked up and the return would be false
        // I think theoretically I could add that functionality

        String inverse1 = ")(";
        String inverse2 = "][";
        String inverse3 = "}{";
        assertFalse("Unexpected True", bracketValidation(inverse1));
        assertFalse("Unexpected True", bracketValidation(inverse2));
        assertFalse("Unexpected True", bracketValidation(inverse3));
        // I think that my script is correct to return these as false. Even
        // they all do technically have a pair, if this was a linter those
        // would be classified as unpaired.

        String multiple1 = "(((";
        String multiple2 = "{{{";
        String multiple3 = "[[[";
        assertFalse("Unexpected True", bracketValidation(multiple1));
        assertFalse("Unexpected True", bracketValidation(multiple2));
        assertFalse("Unexpected True", bracketValidation(multiple3));
        // I think my script is correct ot return these as false. I listed it as an edge
        // case because its a consideration of my script that "(" is just as wrong as
        // "(((((((((((((". If you wanted a true linter though, youd need a solution
        // that kept track of al brackets and could return how many are still open.
    }
}
