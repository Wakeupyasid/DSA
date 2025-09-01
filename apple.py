nums = [1,3,4,2,2]
nums.sort()
ans=0
for i in range(len(nums)-1):
    if nums[i] == nums[i+1]:
        ans=nums[i]
        break
print(ans)