class Solution:
    def convertToBase7(self, num: int) -> str:
        n=num
        if n == 0:
            return "0"
        negative = n < 0
        n = abs(n)
        digits = []
        while n:
            digits.append(str(n % 7))
            n //= 7
        if negative:
            digits.append('-')
        return ''.join(reversed(digits))