class ArrayUtils:
    @staticmethod
    def remove_duplicates(arr):
        unique_elements = set()
        result = []

        for item in arr:
            if item not in unique_elements:
                result.append(item)
                unique_elements.add(item)

        return result

arr = [1, 2, 3, 4, 2, 3, 5]
unique_arr = ArrayUtils.remove_duplicates(arr)
print(unique_arr)  # Output: [1, 2, 3, 4, 5]
