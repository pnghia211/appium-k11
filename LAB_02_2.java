package LAB_2;

import java.util.Scanner;

public class LAB_02_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Input your integer number : ");
        int inputNum = num.nextInt();
        if (inputNum % 2 == 1) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }
    }
}
