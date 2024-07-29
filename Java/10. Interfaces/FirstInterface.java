// File: 
interface FirstInterface {
    void firstMethod();
}

// File: SecondInterface.java
interface SecondInterface {
    void secondMethod();
}

// File: DualImplementation.java
class DualImplementation implements FirstInterface, SecondInterface {
    @Override
    public void firstMethod() {
        System.out.println("First method implemented.");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second method implemented.");
    }

    public static void main(String[] args) {
        DualImplementation obj = new DualImplementation();
        obj.firstMethod();
        obj.secondMethod();
    }
}
