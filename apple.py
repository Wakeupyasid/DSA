# from typing import List
#
#
# class Solution:
#     def generate(self, numRows: int) -> List[List[int]]:
#         ans=[[1]]
#         if numRows == 1:
#             return ans
#         if numRows == 2:
#             ans.append([1,1])
#             return ans
#         if numRows >2:
#             a=numRows-2
#             while(a>0):
#                 k=[1]
#                 for i in range(len(ans[-1])-1):
#                     k.append(ans[-1][i]+ans[-1][i+1])
#                 a-=1
#                 ans.append(k)
#             return ans
#
#     print(generate(0,5))
numRows=5
ans=[[1]]
if numRows == 1:
    print(ans)
if numRows == 2:
    ans.append([1,1])
    print(ans)
if numRows >2:
    ans.append([1,1])
    a=numRows-2
    while (a>0):
        k=[1]
        for i in range(len(ans[-1])-1):
            k.append([ans[-1][i],ans[-1][i+1]])
        print(k)
        ans.append(k)
        a=a-1