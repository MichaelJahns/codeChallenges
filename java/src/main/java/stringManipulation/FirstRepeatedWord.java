package stringManipulation;

import java.util.HashSet;

public class FirstRepeatedWord {

    public static void main(String args[]) {

        findFirstRepeat("An incredibly squat building of only 32 stories.");
    }

    public static String findFirstRepeat(String input) {
        HashSet<String> set = new HashSet<>();
        String[] words = input.toLowerCase().split(" ");
        for (String word : words) {
            if (set.contains(word) == true) {
                return word;
            }
            set.add(word);
        }
        return "All unique words";
    }
}
