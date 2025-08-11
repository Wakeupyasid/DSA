from typing import List

# int ans=0;
#         for (int i=0;i<nums.length-1;i++){
#             for (int j=i+1;j< nums.length;j++){
#                 if ((nums[i] == nums[j]) && (i<j)){
#                     ans++;
#                 }
#             }
#         }
#         return ans;
nums=[1,2,3,1,1,3]
for i, v in enumerate(nums):
    for j in range(i + 1, len(nums)):
        print(j, end=" ")
    print(end="\n")

class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        ans=0
        for i,v in enumerate(nums):
            for j in range(i+1,len(nums)):
                print(j, end=" ")