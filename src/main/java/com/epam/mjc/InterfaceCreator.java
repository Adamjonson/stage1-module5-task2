package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        List<Integer> newList = new ArrayList<>();
        Operation<Integer> operation = (List<Integer> myList) -> {
            for (Integer myInt : myList){
                newList.add(myInt / divider);
            };
            return newList;
        };
        return operation;
        //throw new UnsupportedOperationException("You should implement this method.");
    }
}
