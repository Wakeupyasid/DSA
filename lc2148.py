from typing import List


class Solution:
    def countElements(self, nums: List[int]) -> int:
        minn=min(nums)
        maxx=max(nums)
        ans=0
        for i in nums:
            if (minn<i<maxx):
                ans+=1
        return ans
print(Solution().countElements([1,2,3,4,5]))