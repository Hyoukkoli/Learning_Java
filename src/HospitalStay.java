import java.security.PublicKey;
import java.util.*;

public class HospitalStay {

    public static void main (String[] args){
        calculateCosts();
    }


    public static void calculateCosts (){

        Scanner in = new Scanner (System.in);
        String overnight;

        System.out.println("Does the patient stay over night? Please enter Yes or No.");
        overnight = in.next();

        if (overnight.equalsIgnoreCase("Yes")) {
            System.out.println("Please enter the overnight charges.");
            Double overnightCharges = in.nextDouble();
            System.out.println("Please enter the medication charges.");
            Double medicationCharges = in.nextDouble();
            System.out.println("Please enter the lab service charges.");
            Double labServiceCharges = in.nextDouble();
            System.out.println("The charges for this patient are: " + (overnightCharges + medicationCharges + labServiceCharges));
        }
        else if (overnight.equalsIgnoreCase("No")) {
            System.out.println("Please enter the medication charges.");
            Double medicationCharges = in.nextDouble();
            System.out.println("Please enter the lab service charges.");
            Double labServiceCharges = in.nextDouble();
            System.out.println("The charges for this patient are: " + (medicationCharges + labServiceCharges));
        }
        else {
            System.out.println("Your input cannot be used. Please enter Yes or No.");
            calculateCosts();
        }
        addPatient();
    }

    public static void addPatient(){
        Scanner in = new Scanner (System.in);

        System.out.println("Do you wish to calculate the charges of another patient? Please enter Yes or No.");
        String nextPatient = in.next();

        if (nextPatient.equalsIgnoreCase("Yes")){
            calculateCosts();
        }
        else if (nextPatient.equalsIgnoreCase("No")){
            //Nothing happens because no patient will be added
        }
        else {
            System.out.println("Your input cannot be used. Please enter Yes or No.");
            addPatient();
        }
    }


}
