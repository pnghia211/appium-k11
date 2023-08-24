package LAB_3;

public class LAB_03_02 {
    public static void main(String[] args) {
//        Finding maximum value/minimum value from an integer array
//        Minimum: 1
//        Maximum: 5


        int[] intArr = {2, 3, 1, 5, 6};
        int min = intArr[0];
        int max = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (min > intArr[i]) {
                min = intArr[i];
            }
        }
        for (int i1 = 0; i1 < intArr.length; i1++) {
            if (max < intArr[i1]) {
                max = intArr[i1];
            }
        }
        System.out.println("Minimun :" + min);
        System.out.println("Maximun :" + max);

    }
}
