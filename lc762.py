class Solution:
    def countPrimeSetBits(self, left: int, right: int) -> int:
        ans=0
        ps=[2, 3, 5, 7, 11, 13, 17, 19]
        for i in range(left,right+1):
            s=bin(i)
            count_ones = s.count('1')
            if count_ones in ps:
                ans+=1
        return ans