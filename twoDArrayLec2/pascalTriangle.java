package twoDArrayLec2;

import java.util.Scanner;

public class pascalTriangle {
    static int [][] pascal(int n){
      int [][] ans = new int [n][];

      for(int i=0; i<n; i++){
          // ith row has i+1 columns
          ans[i]=new int[i+1];
          //first and last element of every eow is 1
          ans [i][0]= ans[i][i]= 1;
          for(int j=1; j<i; j++){
              ans[i][j] = ans[i-1][j] + ans[i-1][j-1];

          }
      }
      return ans;
    }

    static void printMatrix(int [][]matrix){
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                System.out.print( matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
       int n= sc.nextInt();
       int ans[][] =pascal(n);
       printMatrix(ans);

    }
}



