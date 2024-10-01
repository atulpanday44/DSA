package RecursionLec9;

public class subsequenceSum {
    static void subSetSum(int [] a, int n, int idx, int sum){

        if(idx>=n){
            System.out.println(sum);
            return;
        }
        subSetSum(a,n,idx+1, sum+ a[idx+1]); // include
        subSetSum(a,n,idx+1,sum);  // exclude
    }
    public static void main(String[] args) {
        int []a= {2,4,5};
        subSetSum(a,a.length, 0,0);

    }
}
