details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
ans=0
for i in details:
    a=int(i[-4:-2])
    if a>60:
        ans+=1
print(ans)
