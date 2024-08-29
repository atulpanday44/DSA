package RecursionLec6;

public class MaxValueRec {

    static void printArray(int []arr, int idx){
        if(idx == arr.length){
            return;
        }
        // self work
        System.out.println(arr[idx]);
        // recursive work - subproblem
        printArray(arr,idx+1);
    }
    static int maxInArray(int[]arr, int idx){
        if(idx== arr.length-1){
            return arr[idx];
        }
// small problem -> idx+1, end of the array -> max ->
        int smallAns= maxInArray(arr,idx+1);

        // self work, final ans
        return Math.max(arr[idx],smallAns);

    }

    static int sumOfArray(int []arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        // recursive work
       int smallAns= sumOfArray(arr,idx+1);

        // self work
        return smallAns + arr[idx];

    }

    public static void main(String[] args) {
        int []arr={5,6,7,8};
       // printArray(arr,0);
     //   System.out.println( maxInArray(arr,0));
        System.out.println(sumOfArray(arr,0));
    }
}
