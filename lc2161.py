from typing import List


class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        low=[]
        high=[]
        k=0
        for i in nums:
            if i<pivot:
                low.append(i)
            elif i>pivot:
                high.append(i)
            elif i==pivot:
                k+=1
        ans = low + [pivot] * k + high
        return ans