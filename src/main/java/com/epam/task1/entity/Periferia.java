package com.epam.task1.entity;

import java.math.BigDecimal;

public class Periferia extends ComputerPart {

    private PeriferiaCount periferiaCount;

    public Periferia(int id, Country material, BigDecimal price, String brand, PeriferiaCount periferiaCountt) {
        super(id, material, price, brand);
        this.periferiaCount = periferiaCount;
    }

    public PeriferiaCount getPeriferiaCount() {
        return periferiaCount;
    }

    @Override
    public int compareTo(ComputerPart o) {
        return 0;
    }

    public enum PeriferiaCount {
        MONITOR, MOUSE, KEYBOARD;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}


