from typing import List


class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        a=[]
        for i in nums:
            c=0
            for j in nums:
                if i==j:
                    c+=1
            if c==1:
                a.append(i)
        ans=0
        for i in a:
            ans+=i
        return ans