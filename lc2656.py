from typing import List


class Solution:
    def maximizeSum(self, nums: List[int], k: int) -> int:
        nums.sort()
        ans=0
        while k!=0:
            ans+=nums[-1]
            nums[-1]=nums[-1]+1
            k-=1
        return ans