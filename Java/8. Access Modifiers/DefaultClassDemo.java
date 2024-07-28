// In a file named DefaultClassDemo.java
class DefaultClass {
    int defaultField = 20;
    
    void defaultMethod() {
        System.out.println("Default method in DefaultClass");
    }
}

public class DefaultClassDemo {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        System.out.println("Default Field: " + obj.defaultField);
        obj.defaultMethod();
    }
}
