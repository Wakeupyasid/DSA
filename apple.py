nums=[12,23,34]
ans=[]
for i in nums:
    s=str(i)
    for j,v in enumerate(s):
        ans.append(int(s[j]))
print(ans)
