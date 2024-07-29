class Parent {
    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(int x) {
        System.out.println("Parent one-argument constructor with x = " + x);
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls Parent's default constructor
        System.out.println("Child default constructor");
    }

    Child(int x) {
        super(x); // Calls Parent's one-argument constructor
        System.out.println("Child one-argument constructor with x = " + x);
    }
}
