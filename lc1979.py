import math
from typing import List


class Solution:
    def findGCD(self, nums: List[int]) -> int:
        return math.gcd(min(nums), max(nums))
print(Solution().findGCD([16,4,5]))