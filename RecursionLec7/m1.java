package RecursionLec7;

public class m1 {

    static int findIndex(int [] a, int  n, int target, int idx){

        // base case
        if(idx>=n ) return -1;

        //self work
        if(a[idx]== target) return idx;

        //recursive work
        return findIndex(a,n,target, idx+1);
    }


    static boolean searchTarget(int [] a, int  n, int target, int idx){

        // base case
        if(idx>=n ) return false;

        //self work
        if(a[idx]== target) return true;

        //recursive work
        return searchTarget(a,n,target, idx+1);
    }



    static void findAllIndices(int []a ,int n, int target, int idx){

        // base case
        if (idx>=n) return;

        // self work
        if(a[idx]== target){
            System.out.println(idx);
        }

        // recursive work
        findAllIndices(a,n,target,idx+1);

    }

    public static void main(String[] args) {
        int []a ={1,2,3,4,4,5,5,4,6};
        int target=4;
        int n=a.length;

        findAllIndices(a,n,target,0
        );

     //   System.out.println(findIndex(a,n,target,0));

//        if (searchTarget(a, a.length, target, 0)){
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
    }
}
