s = "aab"
ans=[[]]
for i in range(0,len(s)):
    for j in range(0,len(s)):
        print(s[i:j+1],s[i:j+1:-1],end="\n")
print(ans)