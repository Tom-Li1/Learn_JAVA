package learnfromscratch_new.practice;

public class Cramer {
    public static void main(String[] args) {
        /* {ax + by = e, cx + dy = f}
           Cramer: {x = (ed-bf)/(ad-bc), y = (af-ec)/(ad-bc)}
           Solve: {21.8x + 2y = 28, 7x + 8y = 62}
         */
        double a = 21.8;
        double b = 2;
        double c = 7;
        double d = 8;
        double e = 28;
        double f = 62;
        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);

        System.out.println("Find x and y: {21.8x + 2y = 28, 7x + 8y = 62}");
        System.out.println("x = " + x + ", y = " + y);
    }
}
