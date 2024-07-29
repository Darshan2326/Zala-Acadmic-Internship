class Parent {
    int parentField;

    Parent() {
        System.out.println("Parent constructor");
        parentField = 10;
    }

    void printParentField() {
        System.out.println("Parent Field: " + parentField);
    }
}

class Child extends Parent {
    int childField;

    Child() {
        this(20); // Call argument constructor of current class
        System.out.println("Child no-arg constructor");
    }

    Child(int childField) {
        super(); // Call constructor of the parent class
        this.childField = childField;
        System.out.println("Child argument constructor");
    }

    void printChildField() {
        System.out.println("Child Field: " + this.childField); // Using 'this' to print child field
    }

    void printFieldsUsingThis() {
        System.out.println("Using 'this':");
        this.printChildField(); // Calling method using 'this'
    }

    void printFieldsUsingSuper() {
        System.out.println("Using 'super':");
        super.printParentField(); // Calling parent class method using 'super'
    }

    void anotherMethod() {
        this.printFieldsUsingThis(); // Use this() in method not in constructors
        super.printParentField();    // Use super() in method not in constructors
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printFieldsUsingThis();
        child.printFieldsUsingSuper();
        child.anotherMethod();
    }
}
