public class Dog {
    void waggingTail() {
        System.out.println("Tail wigged.");
    }
    void bark() {
        System.out.println("Woof!");
    }
    public static void main(String[] args) {
        Dog peter = new Dog();
        peter.bark();
        peter.waggingTail();
    }
}


