package twoDArrayLec1;

public class multiDimensionalArray {
    static void printArray(int[][] arr){

        for(int i=0 ; i < arr.length ; i++){ // for row
      //      System.out.println(arr[i]);

            for(int j=0; j<arr[i].length; j++){ //for column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int [3][3];
        int[][] arr1= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printArray(arr1);

    }
}
