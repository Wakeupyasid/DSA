order = [1,4,5,3,2]
friends = [2,5]
ans=[]
for i in order:
    if i in friends:
        ans.append(i)
print(ans)