package com.epam.task1.entity;

public class StationaryComputerFactory {
    private String name;
    private StationaryComputer stationaryComputer = new StationaryComputer();

    public StationaryComputerFactory() {
        stationaryComputer
                .setQuantity(10);

        ComputerPartFactory factory = new ComputerPartFactory();
        stationaryComputer.establishComputerParts(factory.createParts(7,
                ComputerPart.ComputerPartType.MONITOR,
                ComputerPart.ComputerPartType.CPU,
                ComputerPart.ComputerPartType.MOUSE,
                ComputerPart.ComputerPartType.DRIVE,
                ComputerPart.ComputerPartType.KEYBOARD,
                ComputerPart.ComputerPartType.VIDEOCARD));

        StationaryComputer stationaryComputerClone = stationaryComputer.createClone();
        stationaryComputerClone.setQuantity(10);

    }

    public StationaryComputer createStationaryComputer() {
        return stationaryComputer;
    }

    @Override
    public String toString() {
        return "StationaryComputer=" +
                name + '\'' +
                stationaryComputer + "\n" +
                '}';
    }

    public StationaryComputerFactory setName(String name) {
        this.name = name;
        return this;
    }
}
