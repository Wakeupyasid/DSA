class Solution:
    def numberOfSteps(self, num: int) -> int:
        ans=0
        while num>0:
            if num%2==0:
                num=num//2
                ans+=1
            elif num%2!=0:
                num=num-1
                ans+=1
        return ans