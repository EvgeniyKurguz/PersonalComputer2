package com.epam.task1.entity;

import java.math.BigDecimal;

public class Keyboard extends Periferia {

    private TypeKeybord typeKeyboards;

    public Keyboard(int id, Country country, BigDecimal price, String maker, PeriferiaCount periferiaCountt, TypeKeybord typeKeyboards) {
        super(id, country, price, maker, periferiaCountt);
        this.typeKeyboards = typeKeyboards;
    }

    public TypeKeybord getKeyboards() {
        return typeKeyboards;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "id=" + getId() + " " +
                "Contry= " + getCountry() + " " +
                "Keyboards=" + typeKeyboards + " " +
                "Maker=" + getMaker() + " " +
                "Price=" + getPrice() + " " +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Keyboard)) return false;

        Keyboard keyboard = (Keyboard) o;

        if (typeKeyboards != keyboard.typeKeyboards) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return typeKeyboards.hashCode();
    }

    public enum TypeKeybord {
        WIRElINE, WIRElESS
    }
}

