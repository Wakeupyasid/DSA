nums = [2,2,2,4,4]
ans=False
for i in nums:
    f=nums.count(i)
    a=f > 1 and all(f % j for j in range(2, int(f ** 0.5) + 1))
    if a==True:
        ans=True
        break
print(ans)