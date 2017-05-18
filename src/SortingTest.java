import java.util.*;

public class SortingTest {


    public static void main (String[] args){
        int[] testArray = {1, 2, 5, 10, -1, 99, 351, 4, 8976, 19};


        findValueBinarySearch(testArray, 100);
        sortArrayAscending(testArray);


    }

    public static void sortArrayAscending(int[] a){
        Arrays.sort(a);
        printSortedArray(a);
    }

    public static void findValueBinarySearch(int[] a, int k){
        if (Arrays.binarySearch(a, k) != -1){
            System.out.println("The value " + k + " is not part of the array.");
        } else {
            System.out.println("The value " + k + " is part of the array.");
        }
    }

    public static void printSortedArray(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }




}
