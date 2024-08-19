package arrayCh15;
import java.util.Scanner;

public class lastOccur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array");
        int n= sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter " + n+ " elements");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arr);

        int lastIndex = -1;
        int x = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        System.out.println(lastIndex);
    }
}
