from typing import List


class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        seen = set()

        for a in arr:
            if a * 2 in seen or a % 2 == 0 and a // 2 in seen:
                return True
            seen.add(a)
        return False
print(Solution.checkIfExist(0,[2,3]))