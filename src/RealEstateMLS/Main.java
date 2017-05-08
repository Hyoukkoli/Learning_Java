package RealEstateMLS;

import sun.plugin.perf.PluginRollup;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner in = new Scanner (System.in);


        //mls = MultipleListingS
        //<> = defines the type of ArrayList
        ArrayList<Property> mls = new ArrayList<Property>();
        Property land = new Property(10000, "Land", 3.5);
        mls.add(land);
        land = new Property(250000, "Estate", 2.0, 2,3);
        mls.add(land);

        System.out.println(mls.toString());
        mls.remove(1);
        System.out.println(mls.toString());
    }

}
