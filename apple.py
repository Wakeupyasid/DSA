s = "AbCdEfGhIjKa"
a=""
for i in range(len(s)):
    if s[i]==s[i].lower():
        if s[i].upper() in s:
            a+=s[i].upper()
ans=""
if len(a)>0:
    t = sorted(a)
    ans = t[-1]