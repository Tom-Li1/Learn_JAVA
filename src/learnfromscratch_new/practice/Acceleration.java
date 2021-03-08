package learnfromscratch_new.practice;

public class Acceleration {
    public static void main(String[] args) {
        double initVelocity = 0;
        double finalVelocity = 100;
        double time = 8.7;
        double acceleration = (finalVelocity - initVelocity) / time;
        System.out.println("A car accelerate from " + initVelocity +
                        "km/s to " + finalVelocity +
                        "km/s takes " + time + " seconds.");
        System.out.println("The value of acceleration is: " + acceleration + "km/s/s");
    }
}
