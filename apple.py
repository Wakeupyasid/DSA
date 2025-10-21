nums = [8,8,8,8]
ans=[]
for i in range(len(nums)):
    smaller = [n for n in nums if n < nums[i]]
    ans.append(len(smaller))
print(ans)