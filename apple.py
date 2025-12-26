nums = [2,1,-1]
ans=-1
for i in range(0,len(nums)):
    a=sum(nums[0:i])
    b=sum(nums[i+1:])
    if a==b:
        ans=i
        break
print(ans)