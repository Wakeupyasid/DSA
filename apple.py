n=100
a=""
for i in range(1,4):
    a=a+str(n*i)
ans=0
for i in a:
    ans=ans+int(i)
r=False
if ans==45:
    r=True
print(r)