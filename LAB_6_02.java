package LAB_6;

import java.util.Scanner;

public class LAB_6_02 {
    public static void main(String[] args) {
        String myPassword = "password123";
        //Allow user to input maximum 3 times
        int inputTime = 1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your password :");
            String pass = sc.next();
            inputTime++;
            if (pass.equals(myPassword)) {
                System.out.println("Logging.....");
                break;
            }
        } while (inputTime < 4);


    }
}
