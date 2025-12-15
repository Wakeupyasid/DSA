nums = [1,2,10,5,7, 1]
ans=True
c=0
for i in range (len(nums)-1):
    if nums[i] > nums[i+1]:
        c=c+1
    if c==2:
        ans=False
        break
print(ans)