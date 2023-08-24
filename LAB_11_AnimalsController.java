package LAB_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAB_11_AnimalsController {
    public static void main(String[] args) {
        LAB_11_Animals dog = new LAB_11_Dog();
        LAB_11_Animals falcon = new LAB_11_Falcon();
        LAB_11_Animals snake = new LAB_11_Snake();

        dog.setName("Dog");
        falcon.setName("Falcon");
        snake.setName("Snake");

        List<LAB_11_Animals> LAB11AnimalsList = Arrays.asList(dog, snake, falcon);
        List<LAB_11_Animals> raceLAB11AnimalsList = new ArrayList<>();
        for (LAB_11_Animals LAB11Animals : LAB11AnimalsList) {
            if(!LAB11Animals.getFlyAble()) {
                raceLAB11AnimalsList.add(LAB11Animals);
            }
        }
        getWinner(raceLAB11AnimalsList);
    }

    public static void getWinner (List<LAB_11_Animals> _raceAnimals) {
        LAB_11_Animals winner = _raceAnimals.get(0);
        for (LAB_11_Animals LAB11Animals : _raceAnimals) {
            if(winner.getMoveable() < LAB11Animals.getMoveable()) {
                winner = LAB11Animals;
            }
        }
        System.out.println("The winner is : " + winner.getName() + " - with speed : " + winner.getMoveable());
    }
}
