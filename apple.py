words = ["one.two.three","four.five","six"]
separator = "."
ans=[]
for i in words:
    k=i.split(separator)
    for j in k:
        if len(j)>0:
            ans.append(j)
print(ans)