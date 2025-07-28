from sympy import false

n=4
c=0
for i in range(1,n+1):
    if n%i==0:
        c+=1
    if c==3:
        break
ans=False
if c==3:
    ans=True
print(ans)