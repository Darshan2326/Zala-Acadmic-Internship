# Define the absolute file path
file_path = 'E:\\internship\\ZALA\\PPYTHON\\ASSIGNMENTS\\assignment 1 - python\\11 files\\example.txt'

try:
    with open(file_path, 'r') as file:
        file_contents = file.read()
    
    print(file_contents)
except FileNotFoundError:
    print(f"File not found: {file_path}")