package com.epam.task1.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Filtration {

    public static List<ComputerPart> searchComputerPartByPriceLimit(List<ComputerPart> originList, BigDecimal Max, BigDecimal Min) {
        List<ComputerPart> result = new ArrayList<ComputerPart>();

        for (ComputerPart i : originList)
            if ((i.getPrice().compareTo(Max) < 0))
                if ((i.getPrice().compareTo(Min)) > 0) {
                    result.add(i);
                }
        return result;
    }

}