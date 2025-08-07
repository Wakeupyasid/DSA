from typing import List


class Solution:
    def average(self, salary: List[int]) -> float:
        ma=max(salary)
        mi=min(salary)
        a=0
        c=0
        for i in salary:
            if (i!=ma) & (i!=mi):
                a+=i
                c+=1
        return a/c
print(Solution.average(0,[4000,3000,1000,2000]))