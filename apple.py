nums = [1,12,-5,-6,50,3]
k = 4
ans=0
for i in range (len(nums)-k+1):
    s=sum(nums[i:i+k])/k
    if s>ans:
        ans=s
print(ans)