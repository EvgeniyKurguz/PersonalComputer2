package com.epam.task1.entity;

import java.math.BigDecimal;


public class Monitor extends Periferia {
    private ScreenSize screenSize;

    public Monitor(int id, Country country, BigDecimal price, String maker, PeriferiaCount periferiaCountt, ScreenSize screenSize) {
        super(id, country, price, maker, periferiaCountt);
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Monitor:{" +
                "id=" + getId() + " " +
                "Contry= " + getCountry() + " " +
                "price= " + getPrice() + " " +
                "maker= " + getMaker() + " " +
                "size= " + screenSize + " " +
                '}';
    }

    public String dataConvert() {

        switch (screenSize) {
            case SEVENTEEN_DIAGONAL:
                return "monitor size selected: " + screenSize;
            case EIGHTEEN_DIAGONAL:
                return "monitor size selected: " + screenSize;
            case NINETEEN_DIAGONAL:
                return "monitor size selected: " + screenSize;
            default:
                return "selected the wrong size";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;

        Monitor monitor = (Monitor) o;

        if (screenSize != monitor.screenSize) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return screenSize.hashCode();
    }

    public enum ScreenSize {
        SEVENTEEN_DIAGONAL, EIGHTEEN_DIAGONAL, NINETEEN_DIAGONAL;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}


