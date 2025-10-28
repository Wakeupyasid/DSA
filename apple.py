n = 23
ans=False
sum=0
mul=1
k=n
while k>0:
    sum=sum+(k%10)
    mul=mul*(k%10)
    k=k//10
if n%(sum+mul)==0:
    ans=True
print(ans)