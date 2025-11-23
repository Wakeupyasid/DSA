from typing import List


class Solution:
    def distinctAverages(self, nums: List[int]) -> int:
        t=[]
        while len(nums) > 0:
            nums.sort()
            a=nums[0]
            b=nums[-1]
            nums=nums[1:-1]
            c=(a+b)/2
            if c not in t:
                t.append(c)
        return len(t)