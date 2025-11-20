from typing import List


class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        n = len(image)
        for row in image:
            left = 0
            right = n - 1
            while left < right:
                if row[left] == row[right]:
                    row[left] ^= 1
                    row[right] ^= 1
                left += 1
                right -= 1
            if left == right:
                row[left] ^= 1
        return image