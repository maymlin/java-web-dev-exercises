package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class AllergenComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
        int o1Allergens = o1.getAllergens().size();
        int o2Allergens = o2.getAllergens().size();

        if (o1Allergens - o2Allergens > 0) {
            return 1;
        } else if (o1Allergens - o2Allergens < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
