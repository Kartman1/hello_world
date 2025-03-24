package constructors;

public class Car {
    String color;
    String brand;
    int year;

    Car(){

    }

    Car(String brand){
        this( "BMW", 1990);
    }

    Car(String brand, int year){
        this("White", brand, year);
    }

    Car(String color, String brand, int year){
        this.color = color;
        this.brand = brand;
        this.year = year;
    }

    void moveForward(){
        System.out.println("--->");
    }

    void moveBack(){
        System.out.println("<---");
    }
}
