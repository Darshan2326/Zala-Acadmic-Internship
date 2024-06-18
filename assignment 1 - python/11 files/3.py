# Define the file path
file_path = 'E:\\internship\\ZALA\\PPYTHON\\ASSIGNMENTS\\assignment 1 - python\\11 files\\example.txt'

try:
    # Open the file in read mode
    with open(file_path, 'r') as file:
        # Read the contents of the file
        file_contents = file.read()

    # Print the contents of the file
    print(file_contents)

except FileNotFoundError:
    print(f"File not found: {file_path}")
except Exception as e:
    print(f"An error occurred: {e}")
