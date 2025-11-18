nums = [1,1]
ans=[]
for i in range(0,len(nums)-1):
    if nums[i] == nums[i+1]:
        ans.append(nums[i])
        break
print(ans)