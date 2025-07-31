nums = [12,345,2,6,7896]
ans=0
for i in nums:
    a=str(i)
    if len(a)%2==0:
        ans=ans+1
print(ans)
