n = 10
k=0
ans=0
for i in range(1,n+1):
    if i%7==0:
        k+=1
    ans=ans+(i+k)
    print(i+k)