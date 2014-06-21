package com.epam.task1.entity;

import java.math.BigDecimal;

public abstract class ComputerPart {
    private Material material;
    private BigDecimal price;
    private String maker;

    public ComputerPart(Material material, BigDecimal price, String maker) {
        this.material = material;
        this.price = price;
        this.maker = maker;
    }

    public String getMaterial() {
        switch (material) {
            case CHINA:
                return "Made in " + material + ", ";
            case MALAYSIA:
                return "Made in " + material + ", ";
            case TAIBAI:
                return "Made in " + material + ", ";
            default:
                return "";
        }
    }


    public void setMaterial(Material material) {
        this.material = material;
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

    public enum Material {
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