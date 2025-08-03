arr = [1,2,34,3,4,5,7,23,12]
ans=False
for i in range(0,len(arr)-2):
    if (arr[i]%2!=0) & (arr[i+1]%2!=0) & (arr[i+2]%2!=0):
        ans=True
        break
print(ans)