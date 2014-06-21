package com.epam.task1.entity;/**
 * Created by Евгений on 21.06.2014.
 */
public class StationaryComputerFactory {
    private String name;
    private StationaryComputer stationaryComputer = new StationaryComputer();

    public StationaryComputerFactory() {
        stationaryComputer
                .setQuality(10)
                .setToolsNumber(100);
        ComputerPartFactory factory = new ComputerPartFactory();
        stationaryComputer.establishInstruments(factory.createInstruments(15,
                ComputerPart.ComputerPartType.MONITOR,
                ComputerPart.ComputerPartType.CPU,
                ComputerPart.ComputerPartType.MOUSE,
                ComputerPart.ComputerPartType.VIDEOCARD));

        StationaryComputer  stationaryComputerClone = stationaryComputer.createClone();
        stationaryComputerClone.setQuality(10);
        stationaryComputerClone.setToolsNumber(160);
    }

    @Override
    public String toString() {
        return "StationaryComputer=" +
                name + '\'' +
                stationaryComputer + "\n"+
                '}';
    }

    public StationaryComputerFactory setName(String name) {
        this.name = name;
        return this;
    }
}
