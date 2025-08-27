num=14
ans=False
for i in range(num):
    if i*i==num:
        ans=True
        break
    if i*i>num:
        break
print(ans)