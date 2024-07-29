// File: 
interface DefaultMethodInterface {
    default void defaultMethod() {
        System.out.println("Default method in interface.");
    }
}

// File: DefaultMethodImplementation.java
class DefaultMethodImplementation implements DefaultMethodInterface {
    // No implementation for defaultMethod

    public static void main(String[] args) {
        DefaultMethodImplementation obj = new DefaultMethodImplementation();
        obj.defaultMethod();
    }
}
