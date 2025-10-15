class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        ans=""
        k=min(len(word1),len(word2))
        for i in range(0,k):
            ans+=word1[i]+word2[i]
        if k<len(word1):
            ans+=word1[k:len(word1)]
        else:
            ans+=word2[k:len(word2)]
        return ans 