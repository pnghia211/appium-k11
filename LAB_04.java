package LAB_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LAB_04 {

    public static void main(String[] args) {
        boolean exit = false;
        do {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    addNumberIntoArrayList();
                    break;
                case 2:
                    printArray();
                    break;
                case 3:
                    getMax();
                    break;
                case 4:
                    getMin();
                    break;
                case 5:
                    return;
            }
        } while (!exit);
    }

    public static void printMenu() {
        System.out.println("=========Game Menu===========");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Exit");
        System.out.println("Please select your option : ");
    }

    static List<Integer> numList = new ArrayList<>(5);
    static int sizeList = numList.size();

    public static void addNumberIntoArrayList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers into Array: ");

        for (int i = 0; i < 5; i++) {
            int inputNumber = scanner.nextInt();
            numList.add(inputNumber);
        }
    }

    public static void printArray() {
        System.out.println("Your array is : " + numList);
    }

    public static void getMin() {
        int min = numList.get(0);
        for (Integer i : numList) {
            if (i < min) min = i;
        }
        System.out.println("Min number in array is : " + min);
    }

    public static void getMax() {
        int max = numList.get(0);
        for (Integer i : numList) {
            if(max < i) max = i;
        }
        System.out.println("Max number in array is : " + max);
    }

}






