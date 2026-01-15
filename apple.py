nums = [2,1,3,5,6]
k = 5
multiplier = 2
for i in range(1,k+1):
    m=min(nums)
    for j in range(len(nums)):
        if nums[j]==m:
            nums[j]=nums[j]*multiplier
            break
print(nums)