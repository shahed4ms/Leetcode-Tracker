# Last updated: 11/08/2026, 11:37:37
class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        return s in (s+s)[1:-1]