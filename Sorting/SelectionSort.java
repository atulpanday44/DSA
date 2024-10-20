package Sorting;

public class SelectionSort {
      static void selectionS(int[]arr){

          int n=arr.length;

          for(int  i = 0; i < n-1; i++){
              int minIndex = i;
              for(int j = i+1; j < n; j++){
                  if(arr[j] < arr[minIndex]){
                      minIndex = j;
                  }
              }
              int temp = arr[i];
              arr[i] = arr[minIndex];
              arr[minIndex] = temp;
          }
      }

    public static void main(String[] args) {
        int[]arr = {4,3,5,6,7};
        selectionS(arr);

        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}