// Demo for the Foreachlopp

/* The loop automatically iterates through each element in the array Or Collection untill all the elements are processed */
public class ForeachloopDemo { 
    public static void main(String[] args) {
        // for integers
        int a[]={10,20,30,40};
        for(int i:a){
        System.out.println(i);
        }

        System.out.println();
        // By using Character

        char[] c={'c','h','i','n','n','a'};
        for (char c1:c)
        {
            System.out.print(c1);
        }

        System.out.println();
        
        // By using the String
        String[] s={"Chinna","Sri","Srikanth","Purushotham"};
        for (String S1:s)
        {
            System.out.println(S1);
        }
    }
}
