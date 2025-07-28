from typing import List

class Solution:
    def numOfStrings(self, patterns: List[str], word: str) -> int:
        c=0
        for i in patterns:
            if word.__contains__(i):
                c+=1
        return c
print(Solution.numOfStrings(0,["a","abc","bc","d"], "abc"))