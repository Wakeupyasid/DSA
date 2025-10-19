nums1 = [1,2,3]
nums2 = [1,4]
ans=0
for i in nums1:
    if i in nums2:
        ans=i
        break
print(ans)