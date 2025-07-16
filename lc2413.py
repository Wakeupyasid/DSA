class Solution:
    def smallestEvenMultiple(self, n: int) -> int:
        return n * (n % 2 + 1)
print(Solution().smallestEvenMultiple(11))