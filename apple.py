from itertools import count

nums = [4,4,4,1,2,3]
k = 3
ans=0
for i in nums:
    a=nums.count(i)
    if a%k==0:
        ans+=i
print(ans)