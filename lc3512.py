from typing import List

class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        ans=0
        s=sum(nums)
        if s%k!=0:
            while True:
                s=s-1
                ans+=1
                if s%k==0:
                    break
        return ans