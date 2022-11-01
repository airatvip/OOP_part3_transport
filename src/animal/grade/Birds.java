package animal.grade;

import animal.Animal;

import java.util.Objects;

public abstract class Birds extends Animal {
    private String habitat;

    public Birds(String name, int age, String habitat) {
        super(name, age);
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = "Нет информации";
        } else this.habitat = habitat;
    }

    public final String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        if (habitat == "Нет информации")
            this.habitat = habitat;
    }

    public void hunt() {
        System.out.println("охотиться");

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
        Birds birds = (Birds) o;
        return super.equals(o) && Objects.equals(habitat, birds.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return super.toString() + "среда обитания - " + getHabitat() + "\n";
    }
}
