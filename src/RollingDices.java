import java.util.Random;


public class RollingDices {

    public static void main(String[] args){

        //ein Programm erstellen, dass zwei Würfel 100 mal würfelt und die Anzahl der gleichgeworfenen Zahlen mitzählt



        int dice1;
        int dice2;
        int counter = 0;

        Random rand = new Random();

        for (int i = 0; i < 100; i++){
            dice1 = rand.nextInt(7);
            while (dice1 == 0){
                dice1 = rand.nextInt(7);
            }
            dice2 = rand.nextInt(7);
            while (dice2 == 0){
                dice2 = rand.nextInt(7);
            }
            if (dice1 == dice2){
                counter = counter + 1;
            }
        }
        System.out.println("Out of 100 throws, the amount of doubles thrown are: "+counter);



    }


}
