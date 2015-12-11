package states;

import java.util.HashMap;
import java.util.Map;

public class USStates {

    public static final int OFFSET = 65;

    /**
     * Count states by their first letter.
     *
     * @return
     *   A map from the initial (capital) letter to the number of states whose
     *   names start with that letter.  The map should have exactly 26 keys, one
     *   for each letter of the alphabet.  For example, 'A' should be a key with
     *   value 4 (Alabama, Alaska, Arizona, Arkansas), and 'B' should be a key
     *   with value 0.
     */
    public static Map<Character, Integer> countStatesByFirstLetter() {
        // TODO: Write this method.
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char firstLetter;
        for (int i = 0; i < 26; i++) {
            firstLetter = (char) (i + OFFSET);
            map.put(firstLetter, 0);
        }

        for (String state : STATE_NAMES) {
            firstLetter = state.charAt(0);
            map.put(firstLetter, map.get(firstLetter) + 1);
        }

        return map;
    }

    public static void main(String[] args) {
        Map<Character, Integer> counts = countStatesByFirstLetter();
        // Do some simple tests.  Feel free to add your own.
        if (counts.size() != 26) throw new AssertionError();
        if (!counts.containsKey('A')) throw new AssertionError();
        if (counts.get('A') != 4) throw new AssertionError();
        if (!counts.containsKey('B')) throw new AssertionError();
        if (counts.get('B') != 0) throw new AssertionError();
    }

    public static final String[] STATE_NAMES = {
            "Alabama",
            "Alaska",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Hawaii",
            "Idaho",
            "Illinois",
            "Indiana",
            "Iowa",
            "Kansas",
            "Kentucky",
            "Louisiana",
            "Maine",
            "Maryland",
            "Massachusetts",
            "Michigan",
            "Minnesota",
            "Mississippi",
            "Missouri",
            "Montana",
            "Nebraska",
            "Nevada",
            "New Hampshire",
            "New Jersey",
            "New Mexico",
            "New York",
            "North Carolina",
            "North Dakota",
            "Ohio",
            "Oklahoma",
            "Oregon",
            "Pennsylvania",
            "Rhode Island",
            "South Carolina",
            "South Dakota",
            "Tennessee",
            "Texas",
            "Utah",
            "Vermont",
            "Virginia",
            "Washington",
            "West Virginia",
            "Wisconsin",
            "Wyoming",
    };
}
