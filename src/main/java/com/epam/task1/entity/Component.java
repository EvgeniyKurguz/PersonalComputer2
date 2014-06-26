package com.epam.task1.entity;

import java.math.BigDecimal;


public class Component extends ComputerPart {
    private Type type;

    public Component(int id, Country country, BigDecimal price, String brand, Type type) {
        super(id, country, price, brand);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public int compareTo(ComputerPart o) {
        return 0;
    }

    public enum Type {
        VIDEOCARD, CPU, DRIVE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}


