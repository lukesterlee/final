package abbr;

import java.util.HashSet;
import java.util.Set;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     *
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */
    public static final Set<Character> vowels = new HashSet<Character>();

    static {
        vowels.add('A');
        vowels.add('I');
        vowels.add('U');
        vowels.add('E');
        vowels.add('O');
        vowels.add('a');
        vowels.add('i');
        vowels.add('u');
        vowels.add('e');
        vowels.add('o');
    }


    public static String abbreviate(String string) {
        // TODO: Write this method.
        StringBuilder builder = new StringBuilder();

        char letter;
        for (int i = 0; i < string.length(); i++) {
            letter = string.charAt(i);
            if (!vowels.contains(letter))
                builder.append(letter);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));
    }

}
