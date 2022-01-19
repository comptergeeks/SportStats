package com.company;
    public class Football extends BasicPlayer{
        private int touchdowns;
        private int receptions;
        private int receivingYards;
        private double receivingYardsPerReception ;
        public Football(String name, int salary, int number, int touchdowns, int receptions, int receivingYards, double receivingYardsPerReception) {
            super(name, salary, number);
            this.touchdowns = touchdowns;
            this.receptions = receptions;
            this.receivingYards = receivingYards;
            this.receivingYardsPerReception = receivingYardsPerReception;
        }

        @Override
        public String toString() {
            String out = "<html><p>";
            out += "Name: " + getName() + "<br>";
            out += "Salary: $" + getSalary() + "<br>";
            out += "Number: " + getNumber() + "<br>";
            out += "Touchdowns: " + touchdowns + "<br>";
            out += "Receptions: " + receptions + "<br>";
            out += "Receiving Yards: " + receivingYards + ""+ "<br>";
            out += "Receiving Yards Per Receptions: " + receivingYardsPerReception + "</p></html>";
            return out;
        }
        public int getTouchdowns() {
            return touchdowns;
        }
        public int getReceptions()  {
            return receptions;
        }
        public int getReceivingYards() {
            return receivingYards;
        }
        public double getReceivingYardsPerReception() {
            return receivingYardsPerReception;
        }
    }
