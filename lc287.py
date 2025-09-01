from typing import List


class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        nums.sort()
        ans=0
        for i in range(len(nums)-1):
            if nums[i] == nums[i+1]:
                ans=nums[i]
                break
        return ans
print(Solution().findDuplicate([1,2,3,4,5,6,7,7]))