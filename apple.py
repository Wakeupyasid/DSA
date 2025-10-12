from typing import List

class Solution:
  def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
    k = ""
    ans = []
    for i in nums:
      k += str(i)
      a = int(k, 2)
      if a % 5 == 0:
        ans.append(True)
      else:
        ans.append(False)
    return ans
