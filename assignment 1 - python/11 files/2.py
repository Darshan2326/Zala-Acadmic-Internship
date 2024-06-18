# Open a file in write mode (will create the file if it doesn't exist)
file_path = 'E:\\internship\\ZALA\\PPYTHON\\ASSIGNMENTS\\assignment 1 - python\\11 files\\example.txt'

try:
    user_input = input("Enter some text to write to the file: ")

    with open(file_path, 'w') as file:
        file.write(user_input)
        
    print(f"Text has been written to {file_path}")

except Exception as e:
    print(f"An error occurred: {e}")
