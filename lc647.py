class Solution:
    def countSubstrings(self, s: str) -> int:
        ans=0
        for i in range(len(s)):
            for j in range(i + 1, len(s) + 1):
                t = s[i:j]
                k = t[::-1]
                if k == t:
                    ans+=1
        return ans