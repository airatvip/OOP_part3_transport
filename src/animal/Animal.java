package animal;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {

        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Нет инофрмации";
        } else this.name = name;
        setAge(age);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "Нет инофрмации") {
            this.name = name;
        }
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if (age < 0) {
            this.age = Math.abs(age);
        }
        this.age = age;
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("Sleep");

    }

    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Животное: " +
                "Имя - " + name + "\n" +
                "Возраст - " + age + "\n";
    }


}

