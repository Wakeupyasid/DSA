words = ["adsdf","sfd"]

r1,r2,r3="qwertyuiop","asdfghjkl","zxcvbnm"
ans=[]
for i in words:
    a=False
    letters = set(i.lower())
    if letters.issubset(r1) or letters.issubset(r2) or letters.issubset(r3):
        a=True
        if a==True:
            ans.append(i)
print(ans)
