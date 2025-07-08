from typing import List

class Solution:
    def findLucky(self, arr: List[int]) -> int:
        sorted(arr)
        ans = -1
        for num1 in arr:
            c=0
            for num2 in arr:
                if num2==num1:
                    c+=1
            if c==num1:
                ans = num1
        return ans