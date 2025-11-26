import math


class Solution:
    def gcdOfOddEvenSums(self, n: int) -> int:
        even_list = [2 * i for i in range(1,n+1)]
        odd_list = [2 * i + 1 for i in range(n)]
        ans=math.gcd(sum(even_list), sum(odd_list))
        return ans