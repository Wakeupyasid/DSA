class Solution:
    def theMaximumAchievableX(self, num: int, t: int) -> int:
        return num + 2 * t
print(Solution().theMaximumAchievableX(4,1))