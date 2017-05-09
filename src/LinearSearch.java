//This type of search compares a given value to the entries of the array, starting with the first entry/value and
//continuing until the last entry has been reached and compared to.

public class LinearSearch {

    public static void main (String[] args){
        int [] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
        linearSearch(numbers, 31);
        linearSearch(numbers, 30);
    }

    public static void linearSearch(int [] num, int key){
        int position = -1;
        for (int i = 0; i < num.length; i++) {
            if (key == num[i]) {
                position = i;
                System.out.println("The key " + key + " is in the array on position "+ position);
            }
        }
        if (position == -1){
            System.out.println("The key " + key + " is not  part of this array.");
        }
    }
}
