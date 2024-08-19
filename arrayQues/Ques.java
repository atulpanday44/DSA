package arrayQues;

public class Ques {
    public static void main(String[] args) {
        int [] arr={10,5,3,6,2,8,4};
            int x=2;
            int ans =-1;
            for(int i=0; i< arr.length; i++){
                if(arr[i]==x){
                    ans=i;
                    break;
            }
        } if(ans ==-1){
            System.out.println("not found");
        } else {
            System.out.println("Found "+x+ " at index "+ans);
        }
    }
}
