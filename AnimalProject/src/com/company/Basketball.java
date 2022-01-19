package com.company;

public class Basketball extends BasicPlayer{
    private double vert;
    private boolean canDunk;
    private double threePointPercent;
    private double freeThrow;
    public Basketball(String name, double salary, int number, double vert, boolean canDunk, double threePointPercent, double freeThrow ) {
        super(name, salary, number);
        this.vert = vert;
        this.canDunk = canDunk;
        this.threePointPercent = threePointPercent;
        this.freeThrow = freeThrow;
    }

    @Override
    public String toString() {
        String out = "";
        out += "Name: " + getName();
        out += "\nSalary: $" + getSalary();
        out += "\nNumber: " + getNumber();
        out += "\nVertical: " + vert;
        out += "\nCan Dunk: " + canDunk;
        out += "\nThree Pointer Percentage: " + threePointPercent;
        out += "\nFree Throw Percentage: " + freeThrow;
        return out;
    }
    public double getVert() {
        return vert;
    }
    public boolean getDunk()  {
        return canDunk;
    }
    public double getThreePointPercent() {
        return threePointPercent;
    }
    public double getFreeThrow() {
        return freeThrow;
    }
}
