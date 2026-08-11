# Last updated: 11/08/2026, 11:37:09
class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = set('aeiou')
        count = sum(1 for i in range(k) if s[i] in vowels)  # seed first window

        maxx = count
        for i in range(k, len(s)):
            if s[i - k] in vowels:  # outgoing character leaves window
                count -= 1
            if s[i] in vowels:      # incoming character enters window
                count += 1

            if count > maxx:
                maxx = count

            if count == k:          # all vowels — can't improve, exit early
                return count

        return maxx