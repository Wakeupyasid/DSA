nums = [3,10,5,25,2,8]
ans=0
for i in range (len(nums)):
    for j in range (i+1,len(nums)):
        if nums[i] ^ nums[j] >ans:
            ans=nums[i] ^ nums[j]
print(ans)