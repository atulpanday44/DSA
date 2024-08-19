package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList <Integer> arr= new ArrayList<>();
        // adding element
        arr.add(10);
        arr.add(3);
        arr.add(34);
        arr.add(43);
        arr.add(23);
        arr.add(29);

        // get an element at index
        System.out.println(arr.get(2));

        // print with for loop
//        for(int i=0; i< arr.size(); i++){
//            System.out.println(arr.get(i));
//        }

        // printing array directly

        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);

        // rev the array

        int i=0 , j= arr.size()-1;

       while(i<j){
           Integer temp= Integer.valueOf(arr.get(i));
           arr.set(i,arr.get(j));
           arr.set(j,temp);
           i++;
           j--;
       }
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println("Reversed List "+ arr);


         ArrayList<String> arr1= new ArrayList<>();
         arr1.add("Welcome");
         arr1.add("to");
         arr1.add("Google");
         arr1.add("Atul");
         arr1.add("Panday");
        System.out.println("Original list "+ arr1);
        Collections.sort(arr1);
        System.out.println("Sorted list" + arr1);

    }
}
