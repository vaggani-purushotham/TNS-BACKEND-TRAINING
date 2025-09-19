// Demo for Basic operations Of Strings
public class StringoperationsDemo {
    public static void main(String[] args) {

        String s1="java";
        String s2="Backend";

        // Concatenation 
        
        System.out.println("The conatenation of two strings is:"+s1+" "+s2);

        // Length of string

        System.out.println("The length of the string is:"+s1.length());
        System.out.println("The length of the second string is:"+s2.length());

        // Character at index

        System.out.println("The character at the first index position is:"+s1.charAt(0)+" ,"+s2.charAt(1));

        // Substring 

        System.out.println("The substring of the string is:"+s1.substring(0, 2));

        //  equality check 

        System.out.println("Both strings are equal:"+s1.equals("java")+" "+s2.equals("Backend"));

        // Uppercase operator

        System.out.println("The characters are in Upper letters:"+s1.toUpperCase());
        System.out.println("The characters are in lower case:"+s2.toLowerCase());
    }

}
