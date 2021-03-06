package learnfromscratch_new.practice;

public class Granary {
    public static void main(String[] args) {
        int diameter = 10;
        int height = 3;
        int radius = diameter / 2;
        double pi = 3.14;
        double volume = (pi * (radius * radius)) * height;
        double grain = 750 * volume;

        System.out.println("The granary's volume is " + volume + "m^3.");
        System.out.println("It can save " + grain + "kg of grain at most.");
    }
}
