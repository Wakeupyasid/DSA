class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        ans=0
        for i in range(low,high+1):
            k=str(i)
            if len(k)%2==0:
                a=k[0:len(k)//2]
                b=k[len(k)//2:]
                a_sum = sum(int(digit) for digit in a)
                b_sum = sum(int(digit) for digit in b)
                if a_sum == b_sum:
                    ans+=1
        return ans