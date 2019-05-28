import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static stringManipulation.FirstRepeatedWord.findFirstRepeat;

public class testFirstRepeatedWord {

    @Test
    public void testHappy() {
        String expected1 = "it";
        String actual1 = findFirstRepeat("It was the best of times it was the worst of times");
        assertEquals("Duplicate was not as expected", expected1, actual1);

        String expected2 = "that";
        String actual2 = findFirstRepeat("As that he has ever known is that he has never known enough");
        assertEquals("Duplicate was not as expected", expected2, actual2);

        String expected3 = "a";
        String actual3 = findFirstRepeat("See a need, fill a need");
        assertEquals("Duplicate was not as expected", expected3, actual3);
    }

    @Test
    public void testNoRepeats() {
        String expected = "All unique words";
        String actual1 = findFirstRepeat("An incredibly squat building of only 32 stories.");
        assertEquals("Unexpected duplicate found", expected, actual1);

        String actual2 = findFirstRepeat("hamburger");
        assertEquals("Unexpected duplicate found", expected, actual2);

        String actual3 = findFirstRepeat("");
        assertEquals("Unexpected duplicate found", expected, actual3);

    }

    @Test
    public void testFailure() {
        //I am using Regex to seperate words based on spaces, in problems like the below, we can see the word appears
        // twice but because we are slicing the input on spaces and not symbols whats actually recorded in the
        // hashset is: "fart," and "fart"
        String expected = "fart";
        String actual = findFirstRepeat("fart, fart");
        assertNotEquals(expected, actual);
    }
}
