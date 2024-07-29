// File: PublicInterface.java
public interface PublicInterface {
    int VALUE = 100;

    void publicMethod();
}

// File: PublicInterfaceImplementation.java
class PublicInterfaceImplementation implements PublicInterface {
    @Override
    public void publicMethod() {
        System.out.println("Public method implemented. VALUE = " + VALUE);
    }

    public static void main(String[] args) {
        PublicInterfaceImplementation obj = new PublicInterfaceImplementation();
        obj.publicMethod();
    }
}
