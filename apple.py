nums=[9,12,5,10,14,3,10]
pivot = 10
low=[]
high=[]
k=0
for i in nums:
    if i<pivot:
        low.append(i)
    elif i>pivot:
        high.append(i)
    elif i==pivot:
        k+=1

ans = low + [pivot] * k + high
print(ans)