from typing import List


class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        t=[]
        t.append(nums[0])
        for i in nums:
            if i!=t[-1]:
                t.append(i)
        ans=True
        if len(t)>1:
            if t[0]>t[1]:
                for i in range(len(t)-1):
                    if t[i]<t[i+1]:
                        ans=False
                        break
            else:
                for i in range(len(t)-1):
                    if t[i]>t[i+1]:
                        ans=False
                        break
        return ans