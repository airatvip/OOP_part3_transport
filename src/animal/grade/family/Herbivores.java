package animal.grade.family;

import animal.grade.Mammals;

import java.util.Objects;

public final class Herbivores extends Mammals {
    private String meal;


    public Herbivores(String name, int age, String habitat, int speed, String meal) {
        super(name, age, habitat, speed);
        if (meal == null || meal.isEmpty() || meal.isBlank()) {
            this.meal = "Нет информации";
        } else this.meal = meal;


    }

    public final String getMeal() {
        return meal;
    }

    public final void setMeal(String meal) {
        if (meal == "Нет информации") {
            this.meal = meal;
        }
    }

    public void graze() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return super.equals(o) && Objects.equals(meal, that.meal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meal);
    }

    @Override
    public String toString() {
        return super.toString() + "питается - " + meal + "\n" + getClass() + "\n";
    }
}
