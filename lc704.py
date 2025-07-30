from typing import List


class Solution:
    def search(self, nums: List[int], target: int) -> int:
        ans=-1
        for i in nums:
            if i==target:
                ans=nums.index(i)
                break
        return ans