package org.example;

public class SpaceShip {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;




        //Test output
        public static void main(String[] args) {
            SpaceShip ship = new SpaceShip();
            System.out.println(ship.getName()); //Should be null
            ship.setName("Walker");
            System.out.println(ship.getName()); //Should be Walker
        }
}
