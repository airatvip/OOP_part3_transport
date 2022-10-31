package animal.grade;

import animal.Animal;

import java.util.Objects;

public abstract class Mammals extends Animal {

    private String habitat;
    private int speed;

    public Mammals(String name, int age, String habitat, int speed) {
        super(name, age);
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = "Нет информации";
        } else this.habitat = habitat;

        setSpeed(speed);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == "Нет информации")
            this.habitat = habitat;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = Math.abs(speed);
        } else this.speed = speed;


    }

    @Override
    public void eat() {

    }


    @Override
    public void move() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return super.equals(o) && speed == mammals.speed && Objects.equals(habitat, mammals.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speed);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Среда обитания - " + habitat + "\n" +
                "Скорость передвижение - " + speed + "км/ч" + "\n";
    }
}
