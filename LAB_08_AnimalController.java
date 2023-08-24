package LAB_8;

import java.util.Arrays;
import java.util.List;

public class LAB_08_AnimalController {

    public static void main(String[] args) {
        LAB_08_Dog dog = new LAB_08_Dog();
        LAB_08_Tiger tiger = new LAB_08_Tiger();
        LAB_08_Horse horse = new LAB_08_Horse();

        List<LAB_08_Animal> animalsList = Arrays.asList(dog, tiger, horse);
        LAB_08_Animal winner = animalsList.get(0);
        for (LAB_08_Animal animal : animalsList) {
            if (winner.getSpeed() < animal.getSpeed()) {
                winner = animal;
            }
        }
        System.out.println("The winner is : " + winner.getName());
        System.out.println("With speed  : " + winner.getSpeed());
    }
}
