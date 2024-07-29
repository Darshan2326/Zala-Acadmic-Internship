// File: TwoMethodsInterface.java
interface TwoMethodsInterface {
    void methodOne();
    void methodTwo();
}

class PartialImplementation implements TwoMethodsInterface {
    @Override
    public void methodOne() {
        System.out.println("Method one implemented.");
    }
    @Override
    public void methodTwo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'methodTwo'");
    }

    // Method two is not implemented

    public static void main(String[] args) {
        PartialImplementation obj = new PartialImplementation();
        obj.methodOne();
        // obj.methodTwo();
    }

   
}
