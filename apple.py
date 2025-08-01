n = 10
m = 3
nd=0
d=0
for i in range(n+1):
    if (i%m!=0):
        nd+=i
    elif (i%m==0):
        d+=i
ans=nd-d
print(ans)