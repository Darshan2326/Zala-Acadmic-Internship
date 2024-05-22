def find_index(arr, target):

    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1

# Example usage:
array = [1, 2, 3, 4, 5]
find = 3
index = find_index(array, find)
if index != -1:
    print(f"The index of {find} is {index}")
else:
    print(f"{find} is not found in the array.")
