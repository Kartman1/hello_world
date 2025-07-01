package constructors;

public class Main {
    public static void main(String[] args) {



        Car bmw = new Car("BMW");
        System.out.println("Brand: " + bmw.brand + ", color: " + bmw.color + ", year:" + bmw.year);

        Car myCar = new Car();
        myCar.brand = "Ford";
        myCar.color = "Black";
        myCar.year = 2025;

        System.out.println("Brand: " + myCar.brand + ", color: " + myCar.color + ", year:" + myCar.year);
        myCar.moveBack();
        myCar.moveForward();
    }
}
