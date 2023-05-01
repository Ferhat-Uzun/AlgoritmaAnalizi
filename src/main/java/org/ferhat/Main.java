package org.ferhat;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] binrandom = generateRandomArray(1000);
        printSortTime(binrandom,"mergeSort", "Random");
        printSortTime(binrandom,"quickSort", "Random");


        Arrays.sort(binrandom);
        printSortTime(binrandom,"mergeSort", "Sıralı");

        int[] binReverse = reverseSort(binrandom);
        printSortTime(binReverse,"mergeSort", "Tersten");



        int[] onbinrandom = generateRandomArray(10000);
        Arrays.sort(onbinrandom);
        int[] onbinreverse = reverseSort(onbinrandom);


        int[] ellibinrandom = generateRandomArray(50000);
        Arrays.sort(ellibinrandom);
        int[] ellibinreverse = reverseSort(ellibinrandom);


        int[] yuzbinrandom = generateRandomArray(100000);
        Arrays.sort(yuzbinrandom);
        int[] yuzbinreverse = reverseSort(yuzbinrandom);

        int[] besyuzbinrandom = generateRandomArray(500000);
        Arrays.sort(besyuzbinrandom);
        int[] besyuzbinreverse = reverseSort(besyuzbinrandom);

        int[] milyonrandom = generateRandomArray(1000000);
        Arrays.sort(milyonrandom);
        int[] milyonreverse = reverseSort(milyonrandom);


    }

    static Random r = new Random();
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(size);
        }
        return arr;
    }

    //Random dizi tersten sıralama
    public static int[] reverseSort(int[] arr){
        int[] reverseArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            reverseArr[j] = arr[i];
        }
        return reverseArr;
    }

    //Message
    public static void printSortTime(int[] arr, String sortName, String type) {

        switch (sortName) {
            case "mergeSort":
                long startTime = System.currentTimeMillis();
                mergeSort(arr);
                long endTime = System.currentTimeMillis();
                System.out.println("Merge Sort " + type +" "+ arr.length + " eleman: " + (endTime - startTime) + " ms");
                break;
            case "quickSort":
                long startTime1 = System.currentTimeMillis();
                quickSort(arr, 0, arr.length - 1);
                long endTime1 = System.currentTimeMillis();
                System.out.println("Quick Sort " + type +" "+ arr.length + " eleman: " + (endTime1 - startTime1) + " ms");
                break;
        }
    }

    //Merge Sort
    public static int[] mergeSort(int arr[]) {
        if( arr.length < 2 ) {
            return arr;
        } else {
            int middle = arr.length/2;
            int left[] = new int[middle];
            int right[] = new int[arr.length-middle];
            for( int i=0; i<middle; i++) {
                left[i] = arr[i];
            }

            for( int i=middle; i<arr.length; i++ ) {
                right[i-middle] = arr[i];
            }

            left = mergeSort(left);
            right = mergeSort(right);

            //birlestirme
            int result[] = merge(left, right);
            return result;
        }
    }
    //Birlestirme
    public static int[] merge(int left[], int right[]) {
        int result[] = new int[left.length + right.length];
        int i=0, posLeft = 0, posRight = 0;

        while(left.length > posLeft && right.length > posRight ) {
            if( left[posLeft] <= right[posRight] ) {
                result[i] = left[posLeft];
                posLeft++;
            } else {
                result[i] = right[posRight];
                posRight++;
            }
            i++;
        }

        if( left.length > posLeft ) {
            for(; posLeft<left.length; posLeft++) {
                result[i] = left[posLeft];
                i++;
            }
        }
        if( right.length > posRight ) {
            for(; posRight<right.length; posRight++) {
                result[i] = right[posRight];
                i++;
            }
        }
        return result;
    }

    public static void quickSort(int arr[], int left, int right) {
        if( left < right ) {
            int pivotIndex = left + (right-left)/2;
            int pivotNewIndex = partition(arr, left, right, pivotIndex);
            quickSort(arr, left, pivotNewIndex - 1);
            quickSort(arr, pivotNewIndex + 1, right);
        }
    }

    public static int partition(int arr[], int left, int right, int pivotIndex) {
        int pivotValue = arr[pivotIndex];
        arr[pivotIndex] = arr[right];
        arr[right] = pivotValue;
        int storeIndex = left;
        for(int i=left; i<right; i++) {
            if( arr[i] < pivotValue ) {
                int temp = arr[i];
                arr[i] = arr[storeIndex];
                arr[storeIndex] = temp;
                storeIndex++;
            }
        }
        int temp = arr[right];
        arr[right] = arr[storeIndex];
        arr[storeIndex] = temp;
        return storeIndex;
    }






}

