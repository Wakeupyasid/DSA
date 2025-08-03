from typing import List


class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        ans=False
        for i in range(0,len(arr)-2):
            if (arr[i]%2!=0) & (arr[i+1]%2!=0) & (arr[i+2]%2!=0):
                ans=True
                break
        return ans
print(Solution().threeConsecutiveOdds([1,2,3,5,7]))