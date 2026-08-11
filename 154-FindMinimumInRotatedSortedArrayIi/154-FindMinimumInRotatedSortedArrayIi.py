# Last updated: 11/08/2026, 11:38:41
class Solution:
    def findMin(self, nums: List[int]) -> int:
        while len(nums) > 1 and nums[-1] == nums[0]:
            nums.pop()

        return nums[bisect_left(nums, True, key=lambda n: n <= nums[-1])]