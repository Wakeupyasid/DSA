from typing import List


class Solution:
    def alternatingSum(self, nums: List[int]) -> int:
        sum_even = sum(nums[0::2])
        sum_odd = sum(nums[1::2])
        ans=sum_even-sum_odd
        return ans