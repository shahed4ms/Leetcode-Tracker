// Last updated: 11/08/2026, 11:37:00
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns)
            if (word.indexOf(s) != -1) count++; 
        return count;
    }
}