package animal.grade;

import animal.Animal;

import java.util.Objects;

public class Amphibians extends Animal {
    private String habitat;

    public Amphibians(String name, int age, String habitat) {
        super(name, age);
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = "Нет информации";
        } else this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == "Нет информации")
            this.habitat = habitat;
    }

    public void hunt() {
        System.out.println("перемещаться");

    }

    @Override
    public void eat() {
        System.out.println("кушать");

    }

    @Override
    public void move() {
        System.out.println("перемещаться");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return super.equals(o) && Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return super.toString() + "среда обитания - " + getHabitat() + "\n" + getClass() + "\n";
    }
}
