// File: 
interface SameMethodFirstInterface {
    void sameMethod();
}

// File: SameMethodSecondInterface.java
interface SameMethodSecondInterface {
    void sameMethod();
}

// File: SameMethodImplementation.java
class SameMethodImplementation implements SameMethodFirstInterface, SameMethodSecondInterface {
    @Override
    public void sameMethod() {
        System.out.println("Same method implemented.");
    }

    public static void main(String[] args) {
        SameMethodImplementation obj = new SameMethodImplementation();
        obj.sameMethod();
    }
}
