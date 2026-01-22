class Solution:
    def findMissingAndRepeatedValues(self, grid):
        n = len(grid)
        seen = set()
        repeated = -1

        for row in grid:
            for val in row:
                if val in seen:
                    repeated = val
                seen.add(val)

        for num in range(1, n*n + 1):
            if num not in seen:
                missing = num
                break

        return [repeated, missing]
