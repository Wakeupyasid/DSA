nums = [1,8,16]
ans=0
for i in nums:
    if i%2==0:
        ans=ans | i
print(ans)