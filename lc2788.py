from typing import List

class Solution:
    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
        ans=[]
        for i in words:
            k=i.split(separator)
            for j in k:
                if len(j)>0:
                    ans.append(j)
        return ans