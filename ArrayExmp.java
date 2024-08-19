 class arraySum{
    void Arraysum(){
        int []arr={1,5,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum= sum+arr[i];
        }
        System.out.println(sum);
    }
    void maxOfArray(){
        int []arr={12,14,16,11,73,0,12};
        int max=0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);


}

public class ArrayExmp {
     static void multiArrays(){
         int[][] multiArr={{56,23,45},{34,77,9},{12,56,8}};
//         System.out.println(multiArr[0][0]);
//         System.out.println(multiArr[0][1]);
//         System.out.println(multiArr[0][2]);
//         System.out.println(multiArr[1][0]);
//         System.out.println(multiArr[1][1]);
//         System.out.println(multiArr[1][2]);
//         System.out.println(multiArr[2][0]);
//         System.out.println(multiArr[2][1]);
//         System.out.println(multiArr[2][2]);
         for(int i=0; i< multiArr.length; i++){
             for(int j=0; j<multiArr[i].length;j++){
                 System.out.println(multiArr[i][j]);
             }
         }
     }
   static void demoArrays(){
        int[] ages=new int[3];
        float[]weight= new float[3];
        String [] names= new String[3];

        ages[0]=12;
        ages[1]=23;
        ages[2]=34;
        // for(int i=0; i<ages.length;i++){
       //  System.out.println(ages[i]);
       //  }

       //  for(int age: ages){
       //  System.out.println(age);
        // }
       int i=0;
       while(i< ages.length){
           System.out.println(ages[i]);
           i=i+1;
       }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //demoArrays();
        //multiArrays();
        arraySum obj=new arraySum();
        obj.maxOfArray();
    }
}
}