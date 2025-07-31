from typing import List


class Solution:
    def smallestEqual(self, nums: List[int]) -> int:
        ans=-1
        for i,v in enumerate(nums):
            if i%10==v:
                ans=i
                break
        return ans