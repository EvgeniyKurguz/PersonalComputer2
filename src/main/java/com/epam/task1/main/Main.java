package com.epam.task1.main;


import com.epam.task1.entity.*;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        StationaryComputerFactory computerFactory = new StationaryComputerFactory()
                .setName("HP");
        LOGGER.info(computerFactory);
        StationaryComputer stationaryComputer = new StationaryComputerFactory()
                .createStationaryComputer();
        Collections.sort(stationaryComputer.getComputerParts(), ComputerPart.getIdComparator());
        LOGGER.info( stationaryComputer);
        List<ComputerPart> computerParttList = Filtration.searchComputerPartByPriceUpperLimit(stationaryComputer.getComputerParts(), BigDecimal.valueOf(70), BigDecimal.valueOf(60));
        LOGGER.info("Filtration: " + computerParttList);

    }

}
