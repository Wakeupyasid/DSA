s = "xyz"
k = 3
ans=''
f=s[0:k]
l=s[k:]
ans=ans+f[::-1]+l
ans.join(l)
print(ans)