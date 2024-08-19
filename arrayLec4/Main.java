package arrayLec4;

public class Main {
    static void swapWithoutTemp(int a, int b){
        System.out.println("before swapping a and b");
        System.out.println("a "+ a);
        System.out.println("b "+ b);
        a= a+b;
       b=a-b;
       a=a-b;

        //after swap
        System.out.println("after  swapping value of a and b");
        System.out.println("a "+ a);
        System.out.println("b "+ b);

    }
    static void swap(int a , int b){
        System.out.println("before swapping a and b");
        System.out.println("a "+ a);
        System.out.println("b "+ b);
        int temp=a;
        a=b;
        b=temp;

        //after swap
        System.out.println("after  swapping value of a and b");
        System.out.println("a "+ a);
        System.out.println("b "+ b);

    }
    public static void main(String[] args) {
        //swap(5,6);
        swapWithoutTemp(7,6);
    }
}
