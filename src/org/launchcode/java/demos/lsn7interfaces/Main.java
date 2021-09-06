package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.println("Before:");
        menu.printFlavors();

//        Comparator comparator = new FlavorComparator();
//        flavors.sort(comparator);

        flavors.sort(new FlavorComparator());

        System.out.println("\nAfter:");
        menu.printFlavors();

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        System.out.println("\nBefore:");
        menu.printCones();

        cones.sort(new ConeComparator());

        System.out.println("\nAfter:");
        menu.printCones();

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


        System.out.println("\nBefore:");
        menu.printFlavors();

        flavors.sort(new AllergenComparator());

        System.out.println("\nAfter:");
        menu.printFlavors();
    }
}
