# Define the file path
file_path = 'E:\\internship\\ZALA\\PPYTHON\\ASSIGNMENTS\\assignment 1 - python\\11 files\\example.txt'

def read_to_index(file_path, index):
    try:
        with open(file_path, 'r') as file:
            file.seek(0, 2)  # Move to the end of the file to get its size
            file_size = file.tell()
            if index > file_size:
                print(f"Index {index} is beyond the end of the file, which has size {file_size}.")
                index = file_size

            file.seek(0)

            content = file.read(index)
            
        print(content)

    except FileNotFoundError:
        print(f"File not found: {file_path}")
    except Exception as e:
        print(f"An error occurred: {e}")

index_to_read = 50  # specify the index up to which you want to read
read_to_index(file_path, index_to_read)
