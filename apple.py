nums = [3,2,1,4]
ans=-1
ma=max(nums)
mi=min(nums)
for i in nums:
    if (i!=ma) & (i!=mi):
        ans=i
        break
print(ans)
