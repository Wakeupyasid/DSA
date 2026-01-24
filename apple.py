n = 1000
t=''
s=0
ans=0
for i in str(n):
    if i != '0':
        t += i
        s+=int(i)
if t != "":
    ans = int(t) * s
print(ans)