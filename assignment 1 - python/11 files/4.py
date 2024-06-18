# Define the file path
file_path = 'E:\\internship\\ZALA\\PPYTHON\\ASSIGNMENTS\\assignment 1 - python\\11 files\\example.txt'

try:
    with open(file_path, 'r') as file:
        file.seek(0)
        print("Reading from the beginning of the file:")
        print(file.read(10))  # Read the first 10 characters

        file.seek(20)
        print("\nReading from position 20:")
        print(file.read(10))  # Read the next 10 characters from position 20

        file.seek(-10, 2)
        print("\nReading the last 10 characters of the file:")
        print(file.read(10))  # Read the last 10 characters

except FileNotFoundError:
    print(f"File not found: {file_path}")
except Exception as e:
    print(f"An error occurred: {e}")
