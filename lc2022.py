from typing import List


class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        if len(original) != m * n:
            return []

        result = []
        index = 0

        for i in range(m):
            row = original[index:index + n]
            result.append(row)
            index += n

        return result