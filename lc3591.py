from typing import List


class Solution:
    def checkPrimeFrequency(self, nums: List[int]) -> bool:
        ans=False
        for i in nums:
            f=nums.count(i)
            a=f > 1 and all(f % j for j in range(2, int(f ** 0.5) + 1))
            if a==True:
                ans=True
                break
        return ans