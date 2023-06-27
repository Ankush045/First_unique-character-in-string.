import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        // Create a map to store the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Iterate through the string to calculate the character frequencies
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charFrequency.get(c) == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }
       public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "leetcode";
        int index1 = solution.firstUniqChar(s1);
        System.out.println(index1); // Output: 0

        String s2 = "loveleetcode";
        int index2 = solution.firstUniqChar(s2);
        System.out.println(index2); // Output: 2

        String s3 = "aabb";
        int index3 = solution.firstUniqChar(s3);
        System.out.println(index3); // Output: -1
    }


  
}
