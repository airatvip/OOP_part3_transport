package animal;

import animal.grade.Amphibians;
import animal.grade.Birds;
import animal.grade.family.Flightless;
import animal.grade.family.Flying;
import animal.grade.family.Herbivores;
import animal.grade.family.Predator;

public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Газель", 10, "Полупустыня", 50, "листья");
        Herbivores giraffe = new Herbivores("Жираф", 7, "Саванна Африки", 55, "листья");
        Herbivores horse = new Herbivores("Лошадь", 5, "степь", 57, "трава");

        Predator hyena = new Predator("Гиена", 4, "Африка", 60, "падаль");
        Predator tiger = new Predator("Тигр", 12, "тропические леса", 52, "коптыные");
        Predator bear = new Predator("Медведь", 15, "леса", 45, "всеядный");

        Amphibians frog = new Amphibians("Лягушка", 9, "от субттроптков до субарктических регионов");
        Amphibians waterSnake = new Amphibians("Уж пресноводный", 5, "водоемы");

        Flightless peacock = new Flightless("Павлин", 5, "джунгли, леса", "ходьба");
        Flightless peacock2 = new Flightless("Павлин", 5, "джунгли, леса", "ходьба"); // проверка equals
        Flightless penguin = new Flightless("Пенгвин", 5, "Антарктика", "ходьба, плаванье");
        Flightless birdDodo = new Flightless("Маврики́йский дронт", 10, null, "ходьба");

        Flying seagull = new Flying("Чайка", 40, "широкораспространены", "летают");
        Flying albatross = new Flying("Альбатрос", 50, "от Антарктики до Австралии", "летают");
        Flying falcon = new Flying("Сокол", 18, "широкораспространены, кроме арктических областей", "летают");

        System.out.println(gazelle);
        System.out.println(hyena);
        System.out.println(frog);
        System.out.println(peacock);
        System.out.println(seagull);
        System.out.println(birdDodo);
        System.out.println(peacock.equals(peacock2));
        System.out.println(peacock.equals(penguin));
        System.out.println(seagull instanceof Birds);
        System.out.println(seagull instanceof Flying);

    }
}