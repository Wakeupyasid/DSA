import sys

max_int = sys.maxsize
n=5
ans=0
for i in range(n,10):
    print(i)
    k=str(bin(i)[2:])
    t='1'*len(k)
    if t==k:
        ans=i
        break
print(ans)