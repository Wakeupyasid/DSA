from typing import List


class Solution:
    def sumDivisibleByK(self, nums: List[int], k: int) -> int:
        ans=0
        for i in nums:
            a=nums.count(i)
            if a%k==0:
                ans+=i
        return ans