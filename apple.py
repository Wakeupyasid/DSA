n=5
t=bin(n)[2:]
ans=[0,0]
for i in range(0,len(t)):
    if (t[i]=='1') & (i%2==0):
        ans[1]+=1
    elif (t[i]=='1') & (i%2!=0):
        ans[0]+=1
print(ans)