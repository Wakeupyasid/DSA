import math

dimensions = [[9,3],[8,6]]
ans=[0,0]
k=0
for i in dimensions:
    p=float(math.sqrt((i[0]*i[0])+(i[1]*i[1])))
    if p>k:
        k=p
        ans[0]=i[0]
        ans[1]=i[1]
