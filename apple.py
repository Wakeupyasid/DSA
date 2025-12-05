import math
nums = [10,4,8,3]
n = len(nums)

left_sum = [0] * n
right_sum = [0] * n

for i in range(1, n):
    left_sum[i] = left_sum[i-1] + nums[i-1]

for i in range(n-2, -1, -1):
    right_sum[i] = right_sum[i+1] + nums[i+1]
ans=[]
for i in range(len(left_sum)):
    ans.append(abs(left_sum[i] - right_sum[i]))
print(ans)