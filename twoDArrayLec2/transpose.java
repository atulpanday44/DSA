package twoDArrayLec2;

import java.util.Scanner;

public class transpose {
    static int [][] findTranspose(int [][] matrix, int r, int c){
        int [][] ans = new int [c][r];

        for(int i=0; i< c; i++){
            for(int j=0; j<r; j++){
                ans[i][j]= matrix[j][i];

            }
        }
        return ans;
    }

      static void findTransposeInPlace(int[][] matrix, int r, int c){
        for(int i=0; i< c; i++){
            for(int j=i; j<r; j++){
                int temp = matrix[i][j];
                matrix [i][j] = matrix [j][i];
                matrix [j][i] = temp;
            }
        }
    }

    static void printMatrix(int [][]matrix){
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                System.out.print( matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and column of matrix 1 ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix= new int [r][c];
        int totalElements=r*c;

        System.out.println("Enter "+ totalElements + " values");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix ");
        printMatrix(matrix);
        System.out.println("Transpose of matrix");
        findTransposeInPlace(matrix,r,c);
        printMatrix(matrix);
//       int [][] ans= findTranspose(matrix,r,c);
//        printMatrix(ans);
    }

    }

