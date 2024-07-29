public class OuterClass {
    // Protected interface inside the class
    protected interface ProtectedInterface {
        int VALUE = 100; // Public static final by default

        void protectedMethod();
    }

    // Class implementing the protected interface
    public static class ProtectedInterfaceImplementation implements ProtectedInterface {
        @Override
        public void protectedMethod() {
            System.out.println("Protected method implemented. VALUE = " + VALUE);
        }
    }

    public static void main(String[] args) {
        ProtectedInterfaceImplementation obj = new ProtectedInterfaceImplementation();
        obj.protectedMethod();
    }
}
