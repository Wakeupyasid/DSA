x=23
t=x
s=0
while x>0:
    s+=x%10
    x//=10
ans=-1
if t%s==0:
    ans=s
print(ans)