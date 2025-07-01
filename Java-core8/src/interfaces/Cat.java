package interfaces;

public class Cat extends Animal implements Walkable{
    Cat(String name){
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Mew");
    }

    @Override
    public void walk() {
        System.out.println("Легко перставляю лапы");
    }

    @Override
    public void ur(){
        System.out.println("ur-ur-ur");
    }
}
