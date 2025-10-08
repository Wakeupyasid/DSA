num = 443
ans=False
if num==0:
    ans=True
else:
    for i in range(num):
        a=str(i)
        b=a[::-1]
        if int(a)+int(b)==num:
            ans=True
            break
print(ans)