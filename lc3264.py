from typing import List


class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        for i in range(1,k+1):
            m=min(nums)
            for j in range(len(nums)):
                if nums[j]==m:
                    nums[j]=nums[j]*multiplier
                    break
        return nums