nums = [2,5,6,0,0,1,2]
target = 3
ans=False
nums.sort()
for i in nums:
    if i==target:
        ans=True
        break
    elif i>target:
        break
print(ans)
