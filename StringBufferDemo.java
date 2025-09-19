// Demo for the StringBuffer
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("java");

        // Adding the text at the end 

        sb.append("Backend");
        System.out.println(sb);

        // inserting the text 

        sb.insert(11, "Training");
        System.out.println(sb);

        // Replacing the characters from index!

        sb.replace(11, 19, "TNS");
        System.out.println(sb);

        // delete the string/characters

        sb.delete(11, 19);
        System.out.println(sb);

        // Reverse the string

          sb.reverse();
        System.out.println(sb);
    }
    
}
