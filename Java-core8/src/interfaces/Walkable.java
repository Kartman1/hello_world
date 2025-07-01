package interfaces;

public interface Walkable {

    String type = "Siam";

    void walk();

    default void ur(){
        System.out.println("Rrrrrrr-rrrrr");
    }
}
