from typing import List

class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        return sum(word.startswith(pref) for word in words)
print(Solution.prefixCount())