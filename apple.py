num = "35427"
ans=''
for i in range(len(num)):
    for j in range(i, len(num)):
        s=int(num[i:j+1])
        if s%2!=0 and len(num[i:j+1])>len(ans):
            ans=num[i:j+1]
print(ans)