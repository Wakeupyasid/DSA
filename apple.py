nums1 = [1,2,3]
nums2 = [2,4,6]
ans=[]
n1=[]
n2=[]
for i in nums1:
    if i not in nums2:
        n1.append(i)
for i in nums2:
    if i not in nums1:
        n2.append(i)
ans.append(n1)
ans.append(n2)
print(ans)