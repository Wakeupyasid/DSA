nums = [1,3,6,10,12,15]
c=0
ans=0
for i in nums:
    if (i%2==0) & (i%3==0):
        ans+=i
        c+=1
ans//=c
print(ans)
