package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (list)->{
            List<Integer> list1 = new ArrayList<>();
            for(Integer numbers : list){
                list1.add(numbers/divider);
            }
            return list1;
        };
    }
}
