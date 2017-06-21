import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TestClass {

    public static void main(String[] args) {
        int[] array1 = {2,4,8};
        int[] array2 = {};

        //System.out.println(groupSum(0, array1, 10));
        System.out.println(countUniqueCharacters("aaaaaa ITS A STRININING"));
    }


    static int countUniqueCharacters(String str){
        ArrayList<Character> characterList = new ArrayList<Character>();
        characterList.add(str.charAt(0));
        for (int i = 1; i < str.length(); i++){
            boolean charAvailable = checkArrayList(characterList, str.charAt(i));
            if (charAvailable){
                characterList.add(str.charAt(i));
            }
        }
        return characterList.size();
    }

    static boolean checkArrayList(ArrayList<Character> list, char currentChar){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == currentChar){
                return false;
            }
        }
        return true;
    }

    //Methode, die aus einer Auswahl an Werten aus einem Array berechnet, ob sich mit diesen eine target-Zahl summieren
    //laesst
    static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length){
            if (target == 0){
                return true;
            } else {
                return false;
            }
        }
        int nextTarget = target - nums[start];
        if (groupSum(start + 1, nums, nextTarget)){
            return true;
        }
        if (groupSum(start + 1, nums, target)){
            return true;
        }
        return false;
    }


    static int fibonacci(int n) {
        if (n == 0){
            return 0;
        } if (n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }




//DO NOT DELETE THE CURLY BRACKET
}


