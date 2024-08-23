package RecursionLec1;

public class printIncreasingC {
    static void prinIncreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        prinIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        prinIncreasing(5);

    }

}
