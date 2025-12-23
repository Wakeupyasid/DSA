from typing import List


class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        ans=[]
        for i in range(0,len(prices)):
            c=0
            for j in range(i+1,len(prices)):
                if prices[j]<=prices[i]:
                    ans.append(prices[i]-prices[j])
                    c=1
                    break
            if c==0:
                ans.append(prices[i])
        return ans