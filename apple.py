patterns=["a","abc","bc","d"]
word="abc"
c=0
for i in patterns:
    if word.__contains__(i):
        c+=1
print(c)