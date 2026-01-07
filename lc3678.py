from typing import List


class Solution:
    def smallestAbsent(self, nums: List[int]) -> int:
        k=sum(nums)//len(nums)
        i=k+1
        ans=0
        while True:
            if (i>0) & (i not in nums):
                ans=i
                break
            i+=1
        return ans