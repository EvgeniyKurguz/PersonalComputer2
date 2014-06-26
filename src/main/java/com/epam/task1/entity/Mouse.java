package com.epam.task1.entity;

import java.math.BigDecimal;

public class Mouse extends Periferia {
    private TypeMouse typeMouse;

    public Mouse(int id, Country country, BigDecimal price, String maker, PeriferiaCount periferiaCount, TypeMouse typeMouse) {
        super(id, country, price, maker, periferiaCount);
        this.typeMouse = typeMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "id=" + getId() + " " +
                "Country=" + getCountry() + " " +
                "TypeMouse=" + typeMouse + " " +
                "Maker=" + getMaker() + " " +
                "price=" + getPrice() + " " +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mouse)) return false;

        Mouse mouse = (Mouse) o;

        if (typeMouse != mouse.typeMouse) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return typeMouse.hashCode();
    }

    public enum TypeMouse {
        OPTICAL, LASER;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}


