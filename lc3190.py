from typing import List


class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        return sum(num % 3 != 0 for num in nums)
a=[1,2,3,4]
print(Solution().minimumOperations(a))