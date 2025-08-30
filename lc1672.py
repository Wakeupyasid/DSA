from typing import List


class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        ans=0
        for i in accounts:
            k=0
            for j in i:
                k+=j
            if k>ans:
                ans=k
        return ans