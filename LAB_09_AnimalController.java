package LAB_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAB_09_AnimalController {

    public static void main(String[] args) {
        LAB_09_Animals tiger = new LAB_09_Animals.Builder().setName("Tiger").setWithWings(false).setSpeed(100).build();
        LAB_09_Animals snake = new LAB_09_Animals.Builder().setName("Snake").setWithWings(false).setSpeed(105).build();
        LAB_09_Animals eagle = new LAB_09_Animals.Builder().setName("Eagle").setWithWings(true).setSpeed(200).build();
        LAB_09_Animals falcon = new LAB_09_Animals.Builder().setName("Falcon").setWithWings(true).setSpeed(150).build();
        List<LAB_09_Animals> animalsList = Arrays.asList(tiger, eagle, falcon, snake);
        List<LAB_09_Animals> raceAnimals = new ArrayList<>();
        for (LAB_09_Animals animals : animalsList) {
            if(!animals.isWithWing()) {
                raceAnimals.add(animals);
            }
        }
        getWinner(raceAnimals);
    }

    public static void getWinner (List<LAB_09_Animals> raceableList) {
        LAB_09_Animals winner = raceableList.get(0);
        for (LAB_09_Animals animals : raceableList) {
            if(winner.getSpeed() < animals.getSpeed()) {
                winner = animals;
            }
        }
        System.out.println("The winner is : " + winner.getName());
    }
}
