// File: StaticFinalInterface.java
interface StaticFinalInterface {
    static final int STATIC_FINAL_VALUE = 200;

    void staticFinalMethod();
}

// File: StaticFinalImplementation.java
class StaticFinalImplementation implements StaticFinalInterface {
    @Override
    public void staticFinalMethod() {
        System.out.println("Static final method implemented. STATIC_FINAL_VALUE = " + STATIC_FINAL_VALUE);
    }

    public static void main(String[] args) {
        StaticFinalImplementation obj = new StaticFinalImplementation();
        obj.staticFinalMethod();
    }
}
