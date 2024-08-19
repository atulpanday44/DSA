package Lec5;

public class zeroAndOnes {
    static void swap(int arr[], int left, int right){

        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void zeroesAndOnes(int[] arr){
        int n=arr.length;
        arr=new int[n];
        int left=0, right=n-1;
        while(left<right){
            if(arr[left]== 1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;

            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        printArray(arr);

    }
    static void printArray(int[]arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        int []arr={1,0,1,0,1,0,1,0};
        
        zeroesAndOnes(arr);
    }
}
