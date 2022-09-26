package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> temp = new HashSet<>();
        Set<String> temp1 = new HashSet<>();
        for (String s : firstSet) {
            if (secondSet.contains(s))
                temp.add(s);
        }
        temp1.addAll(firstSet);
        temp1.addAll(secondSet);

        for (String s : temp1) {
            thirdSet.remove(s);
        }
        thirdSet.addAll(temp);

        return thirdSet;
    }
}
