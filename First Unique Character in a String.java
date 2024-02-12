import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Create a HashMap to store the frequency of each character in the string
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Iterate through the string to populate the character frequency map
        for (char ch : s.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }
        // Step 2: Iterate through the string to find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charFrequencyMap.get(s.charAt(i)) == 1) {
                // If the character has a frequency of 1, it is the first non-repeating character
                return i;
            }
        }
        // Step 3: Return -1 if no non-repeating character is found
        return -1;
    }
}
