class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        a=bin(start)[2:]
        b=bin(goal)[2:]
        if len(a)>len(b):
            b=("0"*(len(a)-len(b)))+b
        elif len(a)<len(b):
            a=("0"*(len(b)-len(a)))+a
        ans=0
        for i in range(len(a)):
            if a[i]!=b[i]:
                ans+=1
        return ans