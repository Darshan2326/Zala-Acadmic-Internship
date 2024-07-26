public class GenderSwitch {
    
    public static void main(String[] args) {
        char gender = 'M';
        
        switch (gender) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
