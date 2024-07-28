// File: SamePackageAccess.java
package _4th;

public class SamePackageAccess {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        System.out.println("Public Field: " + obj.publicField);
        obj.publicMethod();
    }
}
