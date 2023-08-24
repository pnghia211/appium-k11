package LAB_3;

public class LAB_03_01 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

//        Count how many odd, even number(s) in an integer array
//        Even numders: 2
//        Odd numbers: 3
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Even number : " + evenNumber);
        System.out.println("Odd number : " + oddNumber);

    }
}
