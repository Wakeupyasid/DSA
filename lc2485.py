class Solution:
    def pivotInteger(self, n: int) -> int:
        lst = [i for i in range(1,n+1)]
        ans=-1
        if n==1:
            ans=1
        else:
            for i in range(len(lst) - 1):
                pre = lst[0:i + 1]
                post = lst[i:]
                if sum(pre) == sum(post):
                    ans = lst[i]
                    break
        return ans