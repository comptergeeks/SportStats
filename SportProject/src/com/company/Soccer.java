package com.company;
    public class Soccer extends BasicPlayer{
        private double goalsPerGame;
        private int goalsScored;
        private int assists;
        private int penaltyConversion;
        public Soccer(String name, int salary, int number, double goalsPerGame,int goalsScored,int assists,int penaltyConversion ) {
            super(name, salary, number);
            this.goalsPerGame = goalsPerGame;
            this.goalsScored = goalsScored;
            this.assists = assists;
            this.penaltyConversion = penaltyConversion;
        }

        @Override
        public String toString() {
            String out = "<html><p>";
            out += "Name: " + getName() + "<br>";
            out += "Salary: $" + getSalary() + "<br>";
            out += "Number: " + getNumber() + "<br>";
            out += "Goals Per Game: " + goalsPerGame + "<br>";
            out += "Goals Scored: " + goalsScored + "<br>";
            out += "Assists: " + assists + ""+ "<br>";
            out += "Penalty Conversion: " + penaltyConversion + "% "+ "</p></html>";
            return out;
        }
        public double getGoalsPerGame() {
            return goalsPerGame;
        }
        public int getGoalsScored()  {
            return goalsScored;
        }
        public double getAssists() {
            return assists;
        }
        public double getPenaltyConversion() {
            return penaltyConversion;
        }
    }
