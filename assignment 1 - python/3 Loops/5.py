#largest number among three numbers
def find_largest_number():
    numbers = []
    for i in range(3):
        num = float(input("Enter number: "))
        numbers.append(num)
    
    largest = numbers[0]
    for num in numbers:
        if num > largest:
            largest = num
    
    return largest

largest_number = find_largest_number()
print("The largest number is:", largest_number)
