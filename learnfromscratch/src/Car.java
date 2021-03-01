public class Car {
    public Car() {
        System.out.println("此构造方法不带任何参数");
    }
    public Car(String color) {
        System.out.println("存在一个参数");
        System.out.println("Color: " + color);
    }
    public Car(String color, String brand) {
        System.out.println("存在二个参数");
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
    }

    public static void main(String[] args) {
        Car car_1 = new Car();
        System.out.println("==========");
        Car car_2 = new Car("black");
        System.out.println("==========");
        Car car_3 = new Car("red", "Audi");
    }
}
