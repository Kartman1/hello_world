package immutable;


public final class Person {
    private final String name;
    private final int age;
    private final String[] friends;

    public Person(String name, int age, String[] friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getFriends() {
        return friends;
    }
}
