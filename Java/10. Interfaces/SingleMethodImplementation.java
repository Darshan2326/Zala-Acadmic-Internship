// File: SingleMethodInterface.java
interface SingleMethodInterface {
    void singleMethod();
}

// File: SingleMethodImplementation.java
class SingleMethodImplementation implements SingleMethodInterface {
    @Override
    public void singleMethod() {
        System.out.println("Single method implemented.");
    }

    public static void main(String[] args) {
        SingleMethodImplementation obj = new SingleMethodImplementation();
        obj.singleMethod();
    }
}
