from typing import List

class Solution:
    def triangularSum(self, nums: List[int]) -> int:
        while len(nums)!=1:
            a=[]
            for i in range (len(nums)-1):
                a.append((nums[i]+nums[i+1])%10)
            nums=a
        ans=nums[0]
        return ans