nums = [4,7,9,3,9]
divisors = [5,2,3]
ans=0
for i in divisors:
    k=0
    for j in nums:
        if j%i==0:
            k+=1
    ans=max(ans,k)
print(ans)