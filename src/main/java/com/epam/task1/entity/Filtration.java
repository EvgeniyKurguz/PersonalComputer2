package com.epam.task1.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Filtration {

    public static List<ComputerPart> searchComputerPartByPriceUpperLimit(List<ComputerPart> originList, BigDecimal upperMax, BigDecimal lowerMin) {
        List<ComputerPart> result = new ArrayList<ComputerPart>();

        for (ComputerPart i : originList)
            if ((i.getPrice().compareTo(upperMax) < 0))
                if ((0 < i.getPrice().compareTo(lowerMin))) {
                    result.add(i);
                }
        return result;
    }
}
