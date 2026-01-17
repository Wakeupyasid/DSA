from typing import List


class Solution:
    def minMoves(self, nums: List[int]) -> int:
        ans=0
        k=max(nums)
        for i in range(len(nums)):
            ans+=k-nums[i]
        return ans