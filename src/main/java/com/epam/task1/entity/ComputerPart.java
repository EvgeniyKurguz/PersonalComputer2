package com.epam.task1.entity;

import java.math.*;
import java.util.Comparator;

public abstract class ComputerPart {
      private int id;
    private Country country;
    private BigDecimal price;
   private static final Comparator<ComputerPart> ID_COMPARATOR = new Comparator<ComputerPart>() {
        @Override
        public int compare(ComputerPart o1, ComputerPart o2) {
            return o1.getId() - o2.getId();
        }
    };

    private String maker;

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ComputerPart( int id, Country country, BigDecimal price, String maker) {
        this.id = id;

        this.country = country;
        this.price = price;
        this.maker = maker;
        this.price = price;

    }

    public static Comparator<ComputerPart> getIdComparator() {
        return ID_COMPARATOR;
    }

    public String getCountry() {
        switch (country) {
            case CHINA:
                return "Made in " + country + ", ";
            case MALAYSIA:
                return "Made in " + country + ", ";
            case TAIBAI:
                return "Made in " + country + ", ";
            default:
                return "";
        }
    }

    public void setMaterial(Country country) {
        this.country = country;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public enum Country {
        CHINA, MALAYSIA, TAIBAI, VIETNAM
    }

    public enum ComputerPartType {
        CPU,
        MONITOR,
        MOUSE,
        VIDEOCARD,
        DRIVE,
        KEYBOARD,
    }
}