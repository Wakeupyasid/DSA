import collections
from typing import List


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        d=dict(collections.Counter(nums))
        a=0
        for i,v in d.items():
            if v==1:
                a=i
                break
        return a
print(Solution.singleNumber(0,[2,2,3,2]))