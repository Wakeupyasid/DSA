class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        return ' '.join(s.split()[:k])
print(Solution().truncateSentence("hello world how are you", 3))