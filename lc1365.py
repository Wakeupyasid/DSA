from typing import List

class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        ans=[]
        for i in range(len(nums)):
            smaller = [n for n in nums if n < nums[i]]
            ans.append(len(smaller))
        return ans