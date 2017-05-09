//This type of search (in an array) only works if the array is already sorted

public class Binary {

    public static void main(String[] args){
        int [] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
        binarySearch(numbers, 0, numbers.length, 30); //30: number that will be searched
        binarySearch(numbers, 0, numbers.length, 31);
    }

    public static void binarySearch(int[] array, int lowerbound, int upperbound, int key){
        //key: the number that the program will search for
        int position;
        position = (lowerbound + upperbound) / 2;
        while ((array[position] != key) && (lowerbound <= upperbound)){
            if (array[position] > key){
                upperbound = position - 1;
            }
            else {
                lowerbound = position + 1;
            }
            position = (lowerbound + upperbound) / 2;
        }
        if (lowerbound <= upperbound){
            System.out.println("The number was found in array at position: " + position);
        }
        else {
            System.out.println("The number is not in this array.");
        }
    }


}
