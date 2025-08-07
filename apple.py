salary = [4000,3000,1000,2000]
ma=max(salary)
mi=min(salary)
a=0
c=0
for i in salary:
    if (i!=ma) & (i!=mi):
        a+=i
        c+=1
print(a,c)