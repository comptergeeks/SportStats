package com.company;
    public class Basketball extends BasicPlayer{
        private double vert;
        private boolean canDunk;
        private double threePointPercent;
        private double freeThrow;
        public Basketball(String name, int salary, int number, double vert, boolean canDunk, double threePointPercent, double freeThrow ) {
            super(name, salary, number);
            this.vert = vert;
            this.canDunk = canDunk;
            this.threePointPercent = threePointPercent;
            this.freeThrow = freeThrow;
        }

        @Override
        public String toString() {
            String out = "<html><p>";
            out += "Name: " + getName() + "<br>";
            out += "Salary: $" + getSalary() + "<br>";
            out += "Number: " + getNumber() + "<br>";
            out += "Vertical: " + vert + "in" + "<br>";
            out += "Can Dunk: " + canDunk + "<br>";
            out += "Three Pointer Percentage: " + threePointPercent + "% "+ "<br>";
            out += "Free Throw Percentage: " + freeThrow + "% "+ "</p></html>";
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
