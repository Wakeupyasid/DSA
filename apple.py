nums = [1,3,5,7]
sum_even = sum(nums[0::2])
sum_odd = sum(nums[1::2])
ans=sum_even-sum_odd
print(ans)