package com.epam.task1.entity;

import java.math.BigDecimal;

public class CPU extends Component {
    private int quantityCore;
    private double frequency; // in Hz;
    private int cacheMemory;

    public CPU(int id, Country country, BigDecimal price, String maker, int quantityCore,double frequency,int cacheMemory, Type type) {
        super(id, country, price, maker, type);
        this.quantityCore = quantityCore;
        this.frequency = frequency;
        this.cacheMemory = cacheMemory;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "id= " + getId() + " " +
                "Country=" + getCountry() + " " +
                "Maker=" + getMaker() + " " +
                "QuantityCore=" + quantityCore + " " +
                "Frequency=" + frequency + "Hz " +
                "CacheMemory=" + cacheMemory + "Mb " +
                "Price=" + getPrice() + " " +

                '}';
    }


}




