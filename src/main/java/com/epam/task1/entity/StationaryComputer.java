package com.epam.task1.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class StationaryComputer implements Cloneable {

    private int quantity;
    private List<ComputerPart> computerParts;
    private List<ComputerPart> copyList = new ArrayList<ComputerPart>();

    public int getQuantity() {
        return quantity;
    }

    public StationaryComputer setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public StationaryComputer createClone() {
        StationaryComputer StationaryComputerCopy;
        try {
            StationaryComputerCopy = (StationaryComputer) super.clone();
            StationaryComputerCopy.computerParts = CloneComputerPartList(computerParts);
            return StationaryComputerCopy;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private List<ComputerPart> CloneComputerPartList(List<ComputerPart> computerParts) {

        for (ComputerPart comp : computerParts) {
            copyList.add(comp);
        }
        return copyList;
    }

    public void establishComputerParts(List<ComputerPart> computerParts) {
        this.computerParts = computerParts;
    }

    public BigDecimal totalSummElements() {
        BigDecimal totalSumm = new BigDecimal(0);
        for (ComputerPart s : computerParts) {
            totalSumm = totalSumm.add(s.getPrice());
        }
        return totalSumm;
    }

    @Override
    public String toString() {
        String elements = "";
        for (ComputerPart s : computerParts) {

            elements = elements + s.toString() + "\n";
        }
        return ", quality=" + quantity + "\n" +
                " Parts=" + elements +
                "  Summ:" + this.totalSummElements() + " $" + "\n" +
                "\n" + " Copy: " + this.copyList;
    }

    public List<ComputerPart> getComputerParts() {
        return computerParts;
    }

    public void setComputerParts(List<ComputerPart> computerParts) {
        this.computerParts = computerParts;
    }

    public List<ComputerPart> getCopyList() {
        return copyList;
    }

    public void setCopyList(List<ComputerPart> copyList) {
        this.copyList = copyList;
    }
}

