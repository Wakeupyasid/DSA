class Solution:
    def binaryGap(self, n: int) -> int:
        k=bin(n)[2:]
        a=[]
        for i in range(0,len(k)):
            if k[i]=='1':
                a.append(i)
        ans=0
        for i in range(0,len(a)-1):
            ans=max(ans, a[i+1]-a[i])
        return ans