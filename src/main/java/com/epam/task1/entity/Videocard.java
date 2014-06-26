package com.epam.task1.entity;

import java.math.BigDecimal;

public class Videocard extends Component {

    private Input extensionBoard;
    private int dataBus; //quantity bit
    private double versionShader;
    private int videoMemory;

    public Videocard(int id, Country country, BigDecimal price, String maker, Input extensionBoard, int dataBus, double versionShader, int videoMemory, Type type) {
        super(id, country, price, maker, type);
        this.extensionBoard = extensionBoard;
        this.dataBus = dataBus;
        this.versionShader = versionShader;
        this.videoMemory = videoMemory;
    }

    @Override
    public String toString() {
        return "Videocard{" +
                "id=" + getId() + " " +
                "id= " + getMaker() + " " +
                "contry= " + getCountry() + " " +
                "extensionBoard=" + extensionBoard + " " +
                ", dataBus=" + dataBus + "bit " +
                ", versionShader=" + versionShader + " " +
                ", videoMemory=" + videoMemory + "Gb " +
                ", price=" + getPrice() + " " +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Videocard)) return false;

        Videocard videocard = (Videocard) o;

        if (extensionBoard != videocard.extensionBoard) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return extensionBoard.hashCode();
    }

    public enum Input {
        PCI, PCI_E, AGP, ISA
    }
}
