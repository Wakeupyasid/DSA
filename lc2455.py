from typing import List


class Solution:
    def averageValue(self, nums: List[int]) -> int:
        c=0
        ans=0
        for i in nums:
            if (i%2==0) & (i%3==0):
                ans+=i
                c+=1
        if c==0:
            return 0
        else:
            return ans//c
print(Solution().averageValue([1,3,6,10,12,15]))