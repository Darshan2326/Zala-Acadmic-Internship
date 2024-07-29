// File: 
interface ParentInterface {
    void parentMethod();
}

// File: ChildInterface.java
interface ChildInterface extends ParentInterface {
    void childMethod();
}

// File: InheritInterfaceImplementation.java
class InheritInterfaceImplementation implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Parent method implemented.");
    }

    @Override
    public void childMethod() {
        System.out.println("Child method implemented.");
    }

    public static void main(String[] args) {
        InheritInterfaceImplementation obj = new InheritInterfaceImplementation();
        obj.parentMethod();
        obj.childMethod();
    }
}
