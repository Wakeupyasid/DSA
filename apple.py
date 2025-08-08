import collections

nums = [0,1,0,1,0,1,99]
d=dict(collections.Counter(nums))
a=0
for i,v in d.items():
    if v==1:
        a=i
        break
print(a)
