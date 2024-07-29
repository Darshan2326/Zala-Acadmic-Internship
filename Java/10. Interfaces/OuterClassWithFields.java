public class OuterClassWithFields {
    
    // Public interface with a public field
    public interface PublicInterface {
        int PUBLIC_FIELD = 100; // public static final by default
        void publicMethod();
    }

    // Protected interface with a protected field
    protected interface ProtectedInterface {
        int PROTECTED_FIELD = 200; // public static final by default
        void protectedMethod();
    }

    // Private interface with a private field
    private interface PrivateInterface {
        int PRIVATE_FIELD = 300; // public static final by default
        void privateMethod();
    }

    // Class implementing the public interface
    public static class PublicInterfaceImplementation implements PublicInterface {
        @Override
        public void publicMethod() {
            System.out.println("Public method implemented. PUBLIC_FIELD = " + PUBLIC_FIELD);
        }
    }

    // Class implementing the protected interface
    protected static class ProtectedInterfaceImplementation implements ProtectedInterface {
        @Override
        public void protectedMethod() {
            System.out.println("Protected method implemented. PROTECTED_FIELD = " + PROTECTED_FIELD);
        }
    }

    // Class implementing the private interface
    private static class PrivateInterfaceImplementation implements PrivateInterface {
        @Override
        public void privateMethod() {
            System.out.println("Private method implemented. PRIVATE_FIELD = " + PRIVATE_FIELD);
        }
    }

    public static void main(String[] args) {
        PublicInterfaceImplementation publicImpl = new PublicInterfaceImplementation();
        publicImpl.publicMethod();

        ProtectedInterfaceImplementation protectedImpl = new ProtectedInterfaceImplementation();
        protectedImpl.protectedMethod();

        PrivateInterfaceImplementation privateImpl = new PrivateInterfaceImplementation();
        privateImpl.privateMethod();
    }
}
