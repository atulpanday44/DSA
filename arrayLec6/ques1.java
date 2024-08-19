package arrayLec6;

public class ques1 {

    static int [] makePrefixSumArray(int[] arr){
        int n=arr.length;
        for(int i = 1; i < n; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {

    }
}
