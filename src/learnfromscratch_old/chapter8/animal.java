package chapter8;

abstract class animal {
    public abstract void name();
    public static void main(String[] args) {
        animal pig = new animal() {
            public void name() {
                System.out.println("This kind of animal is PIG.");
            }
        };
        pig.name();
    }
}
