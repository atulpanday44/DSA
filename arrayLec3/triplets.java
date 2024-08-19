package arrayLec3;

import java.util.Scanner;

public class triplets {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of an array");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("Enter elements of array ");

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();


        }
    }
}
