nums = [5,1]
mi=min(nums)
ma=max(nums)
ans=[]
for i in range(mi,ma+1):
    if i not in nums:
        ans.append(i)
print(ans)