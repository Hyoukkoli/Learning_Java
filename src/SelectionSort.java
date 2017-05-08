public class SelectionSort {


    public static void main(String[] args){
        int [] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
        SelectionSort(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]+"\t");
        }

    }

    public static void SelectionSort(int[] num){
        int i, j, first, temp;

        for (i = num.length - 1; i > 0; i--){
            first = 0;

            for (j = 1; j <= i; j++){

                if (num[j] < num[first]){   //sort in descending order
                    first = j;
                }

                temp = num[first];      //temp saves the value of the smallest number so far
                num[first] = num[i];    //
                num[i] = temp;
            }
        }

    }

}
