package com.epam.task1.entity;

import java.math.BigDecimal;

public class Drive extends Component {
    private Input interfaces;


    public Drive(int id, Country country, BigDecimal price, String brand, Input interfaces, Type type) {
        super(id, country, price, brand, type);
        this.interfaces = interfaces;
    }

    @Override
    public String toString() {
        return "Drive{" +
                "id=" + getId() + " " +
                "Country=" + getCountry() + " " +
                "interfaces=" + interfaces + " " +
                "price=" + getPrice() + " " +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drive)) return false;

        Drive drive = (Drive) o;

        if (interfaces != drive.interfaces) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return interfaces.hashCode();
    }

    public enum Input {
        SATA, IDE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}



