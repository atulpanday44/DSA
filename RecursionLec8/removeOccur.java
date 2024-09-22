package RecursionLec8;

import java.util.Scanner;

public class removeOccur {

    static String remove(String s, int idx){

        // base case
        if(idx>= s.length()) return "" ;

        // recursive work
        String smallAns = remove(s,idx+1);

        char currChar = s.charAt(idx);

        // self work
        if(currChar != 'a'){
            return currChar +smallAns;
        } else {
            return  smallAns;
        }
    }


    public class reverString{

      static String  revStr(String s, int idx){
          if(idx == s.length()) return "";
         String  smallAns = revStr(s,idx+1);
          return smallAns + s.charAt(idx);
      }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(reverString.revStr(s, 0));
      //  System.out.println(remove(s,0));


    }
}

