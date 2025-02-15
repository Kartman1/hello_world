import java.util.regex.*;
public class SpaceShip {
    private String name;
    private String serialNumber;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber){
        String pattern = "^SN[a - zA - Z0 - 9]{6}$";
        if(!serialNumber.matches(pattern)){
            return;
        }
        this.serialNumber = serialNumber;
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
    }

}