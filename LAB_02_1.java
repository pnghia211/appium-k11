package LAB_2;

import java.util.Scanner;

public class LAB_02_1 {
    public static void main(String[] args) {
        Scanner yourWeight = new Scanner(System.in);
        System.out.println("Enter your weight (kg) : ");
        float weight = yourWeight.nextFloat();
        Scanner yourHeight = new Scanner(System.in);
        System.out.println("Enter your height (cm) : ");
        float height = yourHeight.nextFloat();
        float BMI = (weight / (height * 2)) * 100;
        System.out.println(BMI);

        if (BMI <= 18.5) {
            System.out.println("Underweight");
            System.out.println("You should increse your weight ");
        } else if (BMI < 24.9) {
            System.out.println("NormalWeight");
            System.out.println("You good to go bro");
        } else if (BMI < 29.9) {
            System.out.println("OverWeight");
            System.out.println("You should decrease your weight");
        } else {
            System.out.println("Obersity");
            System.out.println("You should stop eat too much  ");
        }

    }
}
