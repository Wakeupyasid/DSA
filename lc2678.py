from typing import List


class Solution:
    def countSeniors(self, details: List[str]) -> int:
        ans=0
        for i in details:
            a=int(i[-4:-2])
            if a>60:
                ans+=1
        return ans
print(Solution().countSeniors(["7868190130M7522","5303914400F9211","9273338290F4010"]))