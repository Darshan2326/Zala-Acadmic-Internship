// File: TestAbstractClass.java
package abstractexample;

public class TestAbstractClass {
    public static void main(String[] args) {
        // Creating an instance of SubClass
        SubClass obj = new SubClass();

        // Calling non-abstract method from abstract class
        obj.nonAbstractMethod();

        // Calling abstract method implemented in subclass
        obj.abstractMethod();

        // Calling method specific to SubClass
        obj.childMethod();
    }
}
