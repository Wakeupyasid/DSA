from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        ans=False
        nums.sort()
        for i in range(0,len(nums)-1):
            if(nums[i]==nums[i+1]):
                ans=True
                break
        return ans