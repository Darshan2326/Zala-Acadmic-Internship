class PrivateClass {
    private int privateField = 10;
    
    private void privateMethod() {
        System.out.println("Private method in PrivateClass");
    }
    
    public void accessPrivateMembers() {
        System.out.println("Private Field: " + privateField);
        privateMethod();
    }
}

class SubPrivateClass extends PrivateClass {
    public void tryAccessPrivateMembers() {
    
    }
}

public class PrivateClassDemo {
    public static void main(String[] args) {
        PrivateClass obj = new PrivateClass();
        obj.accessPrivateMembers();
        
        SubPrivateClass subObj = new SubPrivateClass();
        subObj.tryAccessPrivateMembers();
    }
}
