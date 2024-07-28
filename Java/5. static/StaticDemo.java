public class StaticDemo {

    // Static variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;
    
    // Instance variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // Static methods
    public static void staticMethod1() {
        System.out.println("Static Method 1");
        // Trying to print instance variables in static method (not directly possible)
        // System.out.println(instanceVar1); // This would cause an error
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2");
        // Trying to call instance method in static method
        // instanceMethod1(); // This would cause an error
    }

    // Instance methods
    public void instanceMethod1() {
        System.out.println("Instance Method 1");
        // Printing static variables in instance method
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2");
        // Calling static methods in instance method
        staticMethod1();
        staticMethod2();
    }

    public static void main(String[] args) {
        // Creating an object of StaticDemo
        StaticDemo obj = new StaticDemo();

        // Printing all static and instance variables
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);
        System.out.println("InstanceVar1: " + obj.instanceVar1);
        System.out.println("InstanceVar2: " + obj.instanceVar2);

        // Calling static and instance methods
        staticMethod1();
        staticMethod2();
        obj.instanceMethod1();
        obj.instanceMethod2();

        // Trying to print instance variables in static method using object
        System.out.println("InstanceVar1 (from static method): " + obj.instanceVar1);
        System.out.println("InstanceVar2 (from static method): " + obj.instanceVar2);

        // Trying to call instance method in static method using object
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
