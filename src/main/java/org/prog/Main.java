package org.prog;

public class Main {
    public static void main(String[] args) {
        Main myPlane = new Main();
        String[] passengers = new String[6];
        passengers[0] = "Mariana Koval";
        passengers[1] = "Rostyslav Koval";
        passengers[2] = "Maksym Koval";
        passengers[3] = "Kateryna Koval";
        passengers[4] = "Liubomyr Petsiukh";
        passengers[5] = "Sofiia Ruzhylo";

        myPlane.setPassengerNames(passengers);

        for (int i = 0; i < myPlane.getPassengerNames().length; i++)
            System.out.println(myPlane.getPassengerNames[5]);
    }

    private String getPassenger() {
        return null;
    }

    public String[] getPassengerNames() {
        return new String[5];
    }

    private void setPassengerNames(String[] passengers) {
        this.passengers = passengers;

    }
        switch(myPlane.getPassenger(i))

    {
        case "Mariana Koval":
            System.out.println("This is Mariana!");
            break;
        default:
            System.out.println("This is not Mariana!");
    }
}
