package RecursionLec9;

public class subsequence {

    static void printSubS(String s, String currAns){

        if(s.length() ==0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSubS(remString, currAns +curr);
        printSubS(remString,currAns);
    }

    public static void main(String[] args){
       printSubS("abc","");
    }
}
