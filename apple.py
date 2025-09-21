arr = [17,18,5,4,6,1]
ans=[]
for i in range(0,len(arr)-1):
    ans.append(max(arr[i+1:len(arr)]))
    print(sum(arr[i+1:len(arr)]))
ans.append(-1)