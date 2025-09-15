nums = [1,1,2,3]
l=[]
for i in range(1,len(nums),2):
    for j in range (0,nums[i-1]):
        l.append(nums[i])
print(l)