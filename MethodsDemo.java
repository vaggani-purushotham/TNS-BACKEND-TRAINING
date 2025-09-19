// Demo class for Methods
public class MethodsDemo {

    // Method Without Return Type
    public static void greet() {
        System.out.println("Welcome to TNS Backend Training");
    }

    // Method with parameters
    
    public static void printsum(int a,int b) {
        System.out.println("The Sum Of Numbers is:"+(a+b));
    }

    // Method with Return Type

    public static int suqare(int a) {
        return a*a;
    }

    public static void main(String[] args) {
        greet();     /*calling the method */
        printsum(10,10);    // passing the parameters
        int result=suqare(6);
        System.out.println("The Square of 6 is:"+result);   // calling the method with return values
    }

}
