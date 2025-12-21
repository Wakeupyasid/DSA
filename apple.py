nums = [5,5,5]
k = 2
nums.sort()
ans=0
while k!=0:
    ans+=nums[-1]
    nums[-1]=nums[-1]+1
    k-=1
print(ans)