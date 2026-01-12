class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        ans=''
        f=s[0:k]
        l=s[k:]
        ans=ans+f[::-1]+l
        ans.join(l)
        return ans