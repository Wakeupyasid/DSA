class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jewelsSet = set(jewels)
        return sum(stone in jewelsSet for stone in stones)
print(Solution.numJewelsInStones(0,jewels = "aA", stones = "aAAbbbb"))