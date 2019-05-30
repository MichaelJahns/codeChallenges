package bracketValidation;

import java.util.HashSet;

public class bracketValidation {
    public static void main(String args[]) {
        bracketValidation("()");
    }

    public static boolean bracketValidation(String input) {
        HashSet<Character> h = new HashSet<>();
        for (char character : input.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                h.add(character);
            } else if (character == ')') {
                h.remove('(');
            } else if (character == '}') {
                h.remove('{');
            } else if (character == ']') {
                h.remove('[');
            }
        }
        Boolean validation = h.size() == 0 ? true : false;
        return validation;
    }

}
