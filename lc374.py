class Solution:
  def guessNumber(self, n: int) -> int:
    l = 1
    r = n

    # Find the first guess number that >= the target number
    while l < r:
      m = (l + r) // 2
      if guess(m) <= 0:  # -1, 0
        r = m
      else:
        l = m + 1

    return l