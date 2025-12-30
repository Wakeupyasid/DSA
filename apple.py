haystack = "leetcode"
needle = "leeto"
ans=-1
if needle in haystack:
    for i in range(0, len(haystack)-len(needle)+1):
        if haystack[i:i+len(needle)]==needle:
            ans=i
            break
print(ans)