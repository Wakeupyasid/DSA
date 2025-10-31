nums = [9,7,3]
k = 5
ans=0
s=sum(nums)
if s>k & s%k!=0:
    while True:
        s=s-1
        ans+=1
        if s%k==0:
            break
print(ans)