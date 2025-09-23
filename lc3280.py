date = "2080-02-29"
a=list(date.split('-'))
k=[]
ans=''
for i in a:
    k.append(bin(int(i))[2:])
for i in range(0,len(k)-1):
    ans=ans+k[i]+'-'
ans=ans+k[-1]