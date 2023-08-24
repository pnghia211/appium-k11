package LAB_3;

import java.util.Arrays;

public class LAB_03_03 {

    //BigO = n * n
    //leetcode, hankerank
    //Algorihrms and data structure
    public static void main(String[] args) {
//        Sort an integer array from min to max
//        Input: {12, 34, 1, 16, 28}
//        Expected output: {1, 12, 16, 28, 34}
        int[] myArr1 = {7, 2, 3, 1};
        int[] myArr2 = {9, 12, 31, 22};
        int[] sortedArray1 = DecreSorted(myArr1);
        System.out.println(Arrays.toString(sortedArray1));
        System.out.println(Arrays.toString(DecreSorted(new int[]{})));

    }

    public static int[] DecreSorted(int[] myArr) {
        if (myArr == null || myArr.length == 0 || myArr.length == 1)
            return myArr;


        for (int i = 0; i < myArr.length - 1; i++) {
            for (int j = 0; j < myArr.length - 1; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    myArr[j] = myArr[j] + myArr[j + 1];
                    myArr[j + 1] = myArr[j] - myArr[j + 1];
                    myArr[j] = myArr[j] - myArr[j + 1];
                }
            }
        }
        return myArr;
    }
}


//        for (int i = 0; i < myArr.length - 1; i++) {
//            for (int j = 0; j < myArr.length - 1; j++) {
//                if(myArr[j] > myArr[j+1]) {
//                    total = myArr[j] + myArr[j+1];
//                    myArr[j+1] = total - myArr[j+1];
//                    myArr[j] = total - myArr[j+1];
//
//                }
//            }
//        }
//        System.out.println(Arrays.toString(myArr));


