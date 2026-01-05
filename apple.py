s = "01011"
o=s.count('1')
l=list('0'*len(s))
k=0
for i in range(1,o+1):
    if l[-1]=='0':
        l[-1]='1'
    else:
        l[k]='1'
        k+=1
ans=""
ans=ans.join(i for i in l)
print(ans)