package animal.grade.family;

import animal.grade.Birds;

import java.util.Objects;

public final class Flying extends Birds {
    private String movement;

    public Flying(String name, int age, String habitat, String movement) {
        super(name, age, habitat);

        if (movement == null || movement.isEmpty() || movement.isBlank()) {
            this.movement = "Нет информации";
        } else this.movement = movement;

    }

    public final String getMovement() {
        return movement;
    }

    public final void setMovement(String movement) {
        if (movement == "Нет информации") {
            this.movement = movement;
        }
    }

    public void fly() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return super.equals(o) && Objects.equals(movement, flying.movement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movement);
    }

    @Override
    public String toString() {
        return super.toString() + "тип передвижения - " + movement + "\n" + getClass() + "\n";
    }
}