class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        ans=False
        for i in range(1,num+1):
            if i*i==num:
                ans=True
                break
            if i*i>num:
                break
        return ans
print(Solution.isPerfectSquare(14))