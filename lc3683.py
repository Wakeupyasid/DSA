from typing import List

class Solution:
    def earliestTime(self, tasks: List[List[int]]) -> int:
        a=[]
        for i in tasks:
            k=i[0]+i[1]
            a.append(i[0]+i[1])
        ans=min(a)
        return ans