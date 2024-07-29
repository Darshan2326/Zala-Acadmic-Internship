class MyClass {
    MyClass() { // Default constructor
        System.out.println("Default constructor called");
    }

    MyClass(int x) { // One-argument constructor
        System.out.println("One-argument constructor called with x = " + x);
    }

    MyClass(int x, String s) { // Two-argument constructor
        System.out.println("Two-argument constructor called with x = " + x + ", s = " + s);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(); // Calls default constructor
        MyClass obj2 = new MyClass(10); // Calls one-argument constructor
        MyClass obj3 = new MyClass(20, "Hello"); // Calls two-argument constructor
    }
}
