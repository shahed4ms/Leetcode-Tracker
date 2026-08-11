// Last updated: 11/08/2026, 11:38:13
class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: checking the both words length are same 
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Frequency array
        int[] freq = new int[26];

        // Step 3: Count characters of 's'
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 4: Subtract counts using 't'
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        // Step 5: Check if all counts are 0
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}