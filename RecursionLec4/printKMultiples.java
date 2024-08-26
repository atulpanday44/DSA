package RecursionLec4;

import java.util.Scanner;

public class printKMultiples {
    static void printMultiples(int n, int k) {
        if (k == 0) {
            //System.out.println(n);
            return;
        }
        printMultiples(n, k - 1);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter vale of  n and k ");
        int n= sc.nextInt();
        int k= sc.nextInt();
        printMultiples(n,k);
    }
}
