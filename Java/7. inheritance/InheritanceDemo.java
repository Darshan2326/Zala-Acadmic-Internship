class A {
    // Specific method 1 for class A
    public void methodA1() {
        System.out.println("Method A1 in class A");
    }

    // Specific method 2 for class A
    public void methodA2() {
        System.out.println("Method A2 in class A");
    }

    // Overridden method
    public void commonMethod() {
        System.out.println("Common Method in class A");
    }
}

class B extends A {
    // Specific method 1 for class B
    public void methodB1() {
        System.out.println("Method B1 in class B");
    }

    // Specific method 2 for class B
    public void methodB2() {
        System.out.println("Method B2 in class B");
    }

    // Overridden method
    @Override
    public void commonMethod() {
        System.out.println("Common Method in class B");
    }
}

class C extends B {
    // Specific method 1 for class C
    public void methodC1() {
        System.out.println("Method C1 in class C");
    }

    // Specific method 2 for class C
    public void methodC2() {
        System.out.println("Method C2 in class C");
    }

    // Overridden method
    @Override
    public void commonMethod() {
        System.out.println("Common Method in class C");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Creating objects for each class
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Calling methods of class A
        System.out.println("Methods of class A:");
        objA.methodA1();
        objA.methodA2();
        objA.commonMethod();

        // Calling methods of class B
        System.out.println("\nMethods of class B:");
        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.commonMethod();

        // Calling methods of class C
        System.out.println("\nMethods of class C:");
        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.commonMethod();

        // Calling overridden method with superclass reference to B and C class's objects
        A refB = new B();
        A refC = new C();
        System.out.println("\nOverridden method call with superclass reference:");
        refB.commonMethod();
        refC.commonMethod();
    }
}
