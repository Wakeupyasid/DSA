accounts = [[1,5],[7,3],[3,5]]
ans=0
for i in accounts:
    k=0
    for j in i:
        k+=j
    if k>ans:
        ans=k
print(ans)