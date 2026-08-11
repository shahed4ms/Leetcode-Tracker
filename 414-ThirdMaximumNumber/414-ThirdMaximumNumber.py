# Last updated: 11/08/2026, 11:37:45
class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        if len(set(nums)) >= 3:
            return sorted(set(nums))[-3]
        else:
            return sorted(set(nums))[-1]