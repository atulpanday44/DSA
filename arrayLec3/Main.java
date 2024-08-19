package arrayLec3;
import java.util.Scanner;

class PairSum {
    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        PairSum obj=new PairSum();

        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(arr);
    }
}
