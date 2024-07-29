class MyClass {
    private MyClass() { // Private constructor
        System.out.println("Private constructor called");
    }

    public MyClass(int x) { // Public constructor
        System.out.println("Public constructor called with x = " + x);
    }

    MyClass(String s) { // Default access constructor
        System.out.println("Default access constructor called with s = " + s);
    }

    protected MyClass(double d) { // Protected constructor
        System.out.println("Protected constructor called with d = " + d);
    }
}
