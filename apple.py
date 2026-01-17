nums = [4,4,5]
ans=0
k=max(nums)
for i in range(len(nums)):
    ans+=k-nums[i]
print(ans)