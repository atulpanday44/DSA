package arrayLec6;

public class ques2 {
static int findArraySum(int[] arr){
    int totalSum= 0;
    for(int i=0; i <arr.length; i++){
        totalSum += arr[i];
    } return totalSum;

}
static boolean equalSumPartition(int []arr){
   int  totalSum = findArraySum(arr);
   int prefixSum=0;
   for(int i=0; i<arr.length ; i++ ){
       prefixSum += arr[i];
     int suffixSum= totalSum -prefixSum;
     if(suffixSum == prefixSum){
         return true;
     }
   }
   return false;
}
    public static void main(String[] args) {
        

    }
}
