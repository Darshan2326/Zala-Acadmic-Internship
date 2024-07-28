// In a file named ProtectedClassDemo.java
class ProtectedClass {
    protected int protectedField = 30;
    
    protected void protectedMethod() {
        System.out.println("Protected method in ProtectedClass");
    }
}

class SubProtectedClass extends ProtectedClass {
    public void accessProtectedMembers() {
        System.out.println("Protected Field: " + protectedField);
        protectedMethod();
    }
}

public class ProtectedClassDemo {
    public static void main(String[] args) {
        ProtectedClass obj = new ProtectedClass();
        // Accessible within the same package
        System.out.println("Protected Field: " + obj.protectedField);
        obj.protectedMethod();
        
        SubProtectedClass subObj = new SubProtectedClass();
        subObj.accessProtectedMembers();
    }
}
