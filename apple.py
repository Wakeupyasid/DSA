nums = [4,3,2,1]
ans=-1
for i,v in enumerate(nums):
    if i%10==v:
        ans=i
        break
print(ans)