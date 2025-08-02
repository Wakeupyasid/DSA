nums = [1,2,5,2,3]
target = 2
nums.sort()
ans=[]
for i,v in enumerate(nums):
    if v == target:
        ans.append(i)
print(ans)