class Solution:
    def lexicalOrder(self, n: int) -> List[int]:
        nums=range(1,n+1)
        lexi_sorted = sorted(nums, key=str)
        return lexi_sorted