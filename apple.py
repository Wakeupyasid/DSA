s = "cbbd"
ans=""
for i in range(len(s)):
    for j in range(i + 1, len(s) + 1):
        t=s[i:j]
        k=t[::-1]
        if k == t and len(t)>len(ans):
            ans=t
print(ans)
