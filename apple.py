nums = [4,5,6,7,0,1,2]
target = 0
ans=-1
for i in nums:
    if i==target:
        ans=nums.index(i)
        break
print(ans)