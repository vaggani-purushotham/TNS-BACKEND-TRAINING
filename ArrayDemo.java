// Demo class for Arrays
public class ArrayDemo {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};

        // Accessing the elements frpm the array 
        System.out.println("The First Element Of Array is:"+a[0]);

        // looping through array

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        // By using 2D Array

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.err.println("The Matrix Elements:");
        for(int i=0;i<matrix.length;i++){              //row
            for (int j=0;j<matrix[i].length;j++){      //column
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

        
