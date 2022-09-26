package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i)%2==0){

                hashSet.add(sourceList.get(i));
                int v =sourceList.get(i);
                while (v%2==0){
                    v=v/2;
                    hashSet.add(v);
                }
            } else {
                if (!hashSet.contains(sourceList.get(i)))
                    hashSet.add(sourceList.get(i));
                if (!hashSet.contains(sourceList.get(i)*2))
                    hashSet.add(sourceList.get(i)*2);

            }
        }
        return hashSet;
    }
}
