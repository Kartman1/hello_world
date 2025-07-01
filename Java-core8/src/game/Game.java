package game;

public class Game {
    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        Hero hero = new Hero();

        System.out.println("hero = " + hero);
        applayDamage(enemy, hero);

        System.out.println("hero = " + hero);


    }
    public static void applayDamage(Attacable attacable, Damageable damageable){
        damageable.applayDamage(attacable.getDamage());
    }
}
