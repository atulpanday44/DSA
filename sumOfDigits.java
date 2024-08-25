package RecursionLec3;

public class sumOfDigits {

//    static int countOfDigit(int n){
//        if(n)
//    }

    static int sumofDigitsN (int n){
        if(n>=0 && n<=9){
            return n;
        }
        return sumofDigitsN(n/10) +n% 10;
        // recursive work -> small ans

        //int smallAns= sumofDigitsN(n/10);

        // self work

      //  return smallAns + n%10 ;
    }
    public static void main(String[] args){
        System.out.println(sumofDigitsN(67));
    }
}
