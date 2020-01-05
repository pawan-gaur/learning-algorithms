package com.pgaur.tutorial.lambda;

import java.util.Collections;
import java.util.List;

public class LambdaExample implements MyInterface {

    @Override
    public Integer getMaxNum(List<Integer> integerList) {
        Integer min = Collections.max(integerList);
        return min;
    }
}
