package twoDArrayLec3;

import java.util.Scanner;

public class spiralMatrix {
    static void printSpiral(int[][]matrix, int r,int c){
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElements =0;


        while(totalElements < r*c){
            // topRow -> leftCol to rightCol
            for(int j=leftCol; j<=rightCol; j++){
                System.out.println(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            // rightCol -> topRow to BottomRow
            for(int i=topRow; i<=bottomRow &&totalElements < r*c; i++){
                System.out.println(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            //  bottomRow -> rightCol to left
            for(int j=rightCol; j>=leftCol && totalElements < r*c ; j--){
                System.out.println(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            // leftCol ->bottomRow to topRow
            for(int i=bottomRow; i>=topRow && totalElements < r*c; i--){
                System.out.println(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
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
        System.out.println("Enter number of rows and column of matrix  ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix= new int [r][c];
        int total=r*c;

        System.out.println("Enter "+ total + " values");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(" Input Matrix ");
        printMatrix(matrix);

        System.out.println("Spiral Order");
        printSpiral(matrix,r,c);
    }
}
