nums = [11,7,2,15]
minn=min(nums)
maxx=max(nums)
ans=0
for i in nums:
    if (minn<i<maxx):
        ans+=1
print(ans)