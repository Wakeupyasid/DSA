class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        a=list(sentence.split(" "))
        ans=-1
        for i,v in enumerate(a):
            if v.startswith(searchWord):
                ans=i+1
                break
        return ans
print(Solution.isPrefixOfWord(0,"i love eating burger","burg"))