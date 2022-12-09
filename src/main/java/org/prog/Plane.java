package org.prog;

    public class Plane {
        public static void main(String[] args) {
            String modelName = "Boeing";
        }
        Plane myPlane = new Plane("Boeing");

        public int passengers;

        public String[] passengerNames = new String[6];

        {
            passengerNames[0] = "Mariana Koval";
            passengerNames[1] = "Rostyslav Koval";
            passengerNames[2] = "Maksym Koval";
            passengerNames[3] = "Kateryna Koval";
            passengerNames[4] = "Liubomyr Petsiukh";
            passengerNames[5] = "Sofiia Ruzhylo";
        }

        public String getPassenger (int index){
            return passengerNames[5];
        }

        public void setPassengers ( int passengers){
            this.passengers = passengers;
        }
    }

