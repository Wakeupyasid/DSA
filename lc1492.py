class Solution:
    def kthFactor(self, n: int, k: int) -> int:
        a=[]
        for i in range(1,n+1):
            if n % i == 0:
                a.append(i)
        ans=-1
        if len(a) >=k:
            ans=a[k-1]
        return ans