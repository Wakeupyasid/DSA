from typing import List


class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        a=letters[0]
        for i in letters:
            if i>target:
                a=i
                break
        return a
print(Solution.nextGreatestLetter(0,["c","f","j"],"a"))