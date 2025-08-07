sentence = "i love eating burger"
searchWord = "burg"
a=list(sentence.split(" "))
ans=0
for i,v in enumerate(a):
    if v.startswith(searchWord):
        ans=i+1
        break
print(ans)