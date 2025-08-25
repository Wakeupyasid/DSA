from typing import List


class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        ans=False
        nums.sort()
        for i in nums:
            if i==target:
                ans=True
                break
            elif i>target:
                break
        return ans
print(Solution().search(nums=[1,2,3,4,5,6,7], target=10))