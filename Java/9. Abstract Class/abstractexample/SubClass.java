// File: SubClass.java
package abstractexample;

class SubClass extends AbstractExample {
    // Implementing the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in SubClass.");
    }

    void childMethod() {
        System.out.println("Method specific to SubClass.");
    }
}
