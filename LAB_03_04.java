package LAB_3;

import java.util.Arrays;

public class LAB_03_04 {
    public static void main(String[] args) {
//        Merge 2 SORTED integer array into one SORTED array
//        Array 01: {1, 12, 16, 28, 34}
//        Array 02: {1, 13, 16, 27, 99}
//
//        Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
        int[] arr1 = {1, 12, 16, 28, 34};
        int[] arr2 = {1, 13, 16, 27, 99};
        int[] arrFinal = mergeSortedArray(arr1, arr2);
        System.out.println(Arrays.toString(arrFinal));
    }


    public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] arrFinalLength = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1Length && j < arr2Length) {
            if (arr1[i] < arr2[j]) {
                arrFinalLength[k++] = arr1[i++];
                // arr1[i]++;
            } else {
                arrFinalLength[k++] = arr2[j++];
                //arr2[j]++;
            }
                // arrFinal[k]++;
        }
        while (i < arr1Length) {
            arrFinalLength[k++] = arr2[i++];
        }
        while (j < arr2Length) {
            arrFinalLength[k++] = arr2[j++];
        }
        return arrFinalLength;
    }


}


