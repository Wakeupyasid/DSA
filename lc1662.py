from typing import List


class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        a,b="",""
        for i in word1:
            a+=i
        for i in word2:
            b+=i
        return a==b
word1,word2= ["a", "cb"], ["ab", "c"]