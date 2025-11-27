nums = [1,1,1]
ans=0
for i in range(1,len(nums)-1):
    a=nums[i-1]
    b=nums[i+1]
    c=nums[i]
    if (a+b)==(c//2):
        ans+=1
print(ans)