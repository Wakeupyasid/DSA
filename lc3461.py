class Solution:
    def hasSameDigits(self, s: str) -> bool:
        while len(s) !=2:
            k=""
            for i in range(0,len(s)-1):
                m=(int(s[i])+int(s[i+1]))%10
                k+=str(m)
            s=k
        ans=False
        if s[0]==s[1]:
            ans=True
        return ans