from typing import List, Counter


class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        frequency_map = Counter(nums)
        sorted_nums = sorted(nums, key=lambda num: (frequency_map[num], -num))
        return sorted_nums