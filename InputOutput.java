import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args) {
        // input from the user
        Scanner sc = new Scanner(System.in);

        // Taking string as input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking integer as input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Printing the output
        System.out.println("Hello " + name + ", Age: " + age);

        sc.close(); 
    }
}
