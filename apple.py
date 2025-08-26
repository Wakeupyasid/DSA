nums = [1,2,3,1]
ans=False
nums.sort()
for i in range(0,len(nums)-1):
    if(nums[i]==nums[i+1]):
        ans=True
        break
print(ans)