class Solution:
    def getLeastFrequentDigit(self, n: int) -> int:
        freq = [0] * 10
        for ch in str(abs(n)):
            freq[int(ch)] += 1
        min_freq = min([f for f in freq if f > 0])
        for d in range(10):
            if freq[d] == min_freq:
                return d