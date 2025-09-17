// Demon class for ControlStatements
public class ControlStatementsDemo {
    public static void main(String[] args) {
        
        // if-else Statements

        int n=10;
        if(n%2==0){
            System.err.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        
        // using Switch statement

        int day=5;
        switch(day){
            case 1:
            System.err.println("Monday");
            break;
            case 2:
            System.err.println("Tuesday");
            break;
            case 3:
            System.err.println("Wednesday");
            break;
            case 4:
            System.err.println("Thursday");
            break;
            default:
            System.err.println("Other day");
            break;
        }
       
    }
    
}
