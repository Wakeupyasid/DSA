nums = [4,2,2,3,1]
unique_nums = sorted(set(nums), reverse=True)
if len(unique_nums) >= 3:
    third_largest = unique_nums[2]
    print("Third largest number:", third_largest)
else:
    print("Less than 3 unique numbers")