package RecursionLec5;

import java.util.Scanner;

public class Gcd {
    static int gcd(int x , int y){
        if(y==0) {
            return x;
        }
           return gcd(y,x%y);
        }

        static int gcdM(int x, int y){
        while (x % y==0){
            int rem =x %y;
            x=y;
            y= rem;
        }
        return y;
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter vale of  x and y ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(gcd(x,y));
        System.out.println(gcd(x,y));
    }
}
