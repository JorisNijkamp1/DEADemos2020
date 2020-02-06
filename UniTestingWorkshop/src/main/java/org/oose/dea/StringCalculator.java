package org.oose.dea;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList(numbers.split(",|\n")));
        if (numbers == "")
            return 0;
        int outcome = 0;
        for (String s : input) {
            if (Integer.parseInt(s) > 1000) {
                outcome += 0;
            } else {
                outcome = Integer.parseInt(s) + outcome;
            }
        }
        return outcome;
    }
}
