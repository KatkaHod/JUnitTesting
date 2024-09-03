package org.example.FindMatching;

import java.util.List;

public class FindMatching {

    /*
    -> The findMatching method looks through a list of numbers and finds the first one that is between the given lowerLimit and upperLimit.
    -> If it finds such a number, it returns it; if not, it returns null.
     */

    public static Double findMatching(List<Double> list, Double lowerLimit, Double upperLimit) {
        for (Double item: list) {
            if (item >= lowerLimit && item <= upperLimit) {
                return item;
            }
        }
      return null;
    }

}
