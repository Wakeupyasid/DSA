import math

n = 10
t = 2
ans=0
while True:
    digits = [int(d) for d in str(n)]
    if math.prod(digits)%t==0:
        ans=n
        break
    else:
        n+=1
print(ans)
