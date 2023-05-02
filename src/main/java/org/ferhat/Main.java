package org.ferhat;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("İntel i7 6 çekirdekli 16 GB Ram bir bilgisayarda alınan sonuçlardır.");

        System.out.println("************ Bin Başlangıç ************");
        int[] binrandom = generateRandomArray(1000);
        printSortTime(binrandom,"mergeSort", "Random");
        printSortTime(binrandom,"quickSort", "Random");
        printSortTime(binrandom,"heapSort","Random");

        Arrays.sort(binrandom);
        printSortTime(binrandom,"mergeSort", "Sıralı");
        printSortTime(binrandom,"quickSort", "Sıralı");
        printSortTime(binrandom,"heapSort","Sıralı");

        int[] binReverse = reverseSort(binrandom);
        printSortTime(binReverse,"mergeSort", "Tersten");
        printSortTime(binReverse,"quickSort", "Tersten");
        printSortTime(binReverse,"heapSort","Tersten");

        System.out.println("************ On Bin Başlangıç ************");
        int[] onbinrandom = generateRandomArray(10000);
        printSortTime(onbinrandom,"mergeSort","Random");
        printSortTime(onbinrandom,"quickSort", "Random");
        printSortTime(onbinrandom,"heapSort","Random");

        Arrays.sort(onbinrandom);
        printSortTime(onbinrandom,"mergeSort", "Sıralı");
        printSortTime(onbinrandom,"quickSort", "Sıralı");
        printSortTime(onbinrandom,"heapSort","Sıralı");

        int[] onbinreverse = reverseSort(onbinrandom);
        printSortTime(onbinreverse,"mergeSort", "Tersten");
        printSortTime(onbinreverse,"quickSort", "Tersten");
        printSortTime(onbinreverse,"heapSort","Tersten");

        System.out.println("************ Elli Bin Başlangıç ************");
        int[] ellibinrandom = generateRandomArray(50000);
        printSortTime(ellibinrandom,"mergeSort", "Random");
        printSortTime(ellibinrandom,"quickSort", "Random");
        printSortTime(ellibinrandom,"heapSort","Random");
        Arrays.sort(ellibinrandom);
        printSortTime(ellibinrandom,"mergeSort", "Sıralı");
        printSortTime(ellibinrandom,"quickSort", "Sıralı");
        printSortTime(ellibinrandom,"heapSort","Sıralı");
        int[] ellibinreverse = reverseSort(ellibinrandom);
        printSortTime(ellibinreverse,"mergeSort", "Tersten");
        printSortTime(ellibinreverse,"quickSort", "Tersten");
        printSortTime(ellibinreverse,"heapSort","Tersten");


        System.out.println("************ Yüz Bin Başlangıç ************");
        int[] yuzbinrandom = generateRandomArray(100000);
        printSortTime(yuzbinrandom,"mergeSort", "Random");
        printSortTime(yuzbinrandom,"quickSort", "Random");
        printSortTime(yuzbinrandom,"heapSort","Random");
        Arrays.sort(yuzbinrandom);
        printSortTime(yuzbinrandom,"mergeSort", "Sıralı");
        printSortTime(yuzbinrandom,"quickSort", "Sıralı");
        printSortTime(yuzbinrandom,"heapSort","Sıralı");
        int[] yuzbinreverse = reverseSort(yuzbinrandom);
        printSortTime(yuzbinreverse,"mergeSort", "Tersten");
        printSortTime(yuzbinreverse,"quickSort", "Tersten");
        printSortTime(yuzbinreverse,"heapSort","Tersten");

        System.out.println("************ Bes Yüz Bin Başlangıç ************");
        int[] besyuzbinrandom = generateRandomArray(500000);
        printSortTime(besyuzbinrandom,"mergeSort", "Random");
        printSortTime(besyuzbinrandom,"quickSort", "Random");
        printSortTime(besyuzbinrandom,"heapSort","Random");
        Arrays.sort(besyuzbinrandom);
        printSortTime(besyuzbinrandom,"mergeSort", "Sıralı");
        printSortTime(besyuzbinrandom,"quickSort", "Sıralı");
        printSortTime(besyuzbinrandom,"heapSort","Sıralı");
        int[] besyuzbinreverse = reverseSort(besyuzbinrandom);
        printSortTime(besyuzbinreverse,"mergeSort", "Tersten");
        printSortTime(besyuzbinreverse,"quickSort", "Tersten");
        printSortTime(besyuzbinreverse,"heapSort","Tersten");

        System.out.println("************ Bir Milyon Başlangıç ************");
        int[] milyonrandom = generateRandomArray(1000000);
        printSortTime(milyonrandom,"mergeSort", "Random");
        printSortTime(milyonrandom,"quickSort", "Random");
        printSortTime(milyonrandom,"heapSort","Random");
        Arrays.sort(milyonrandom);
        printSortTime(milyonrandom,"mergeSort", "Sıralı");
        printSortTime(milyonrandom,"quickSort", "Sıralı");
        printSortTime(milyonrandom,"heapSort","Sıralı");
        int[] milyonreverse = reverseSort(milyonrandom);
        printSortTime(milyonreverse,"mergeSort", "Tersten");
        printSortTime(milyonreverse,"quickSort", "Tersten");
        printSortTime(milyonreverse,"heapSort","Tersten");


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
                quickSort(arr);
                long endTime1 = System.currentTimeMillis();
                System.out.println("Quick Sort " + type +" "+ arr.length + " eleman: " + (endTime1 - startTime1) + " ms");
                break;
            case "heapSort":
                long startTime2 = System.currentTimeMillis();
                sort(arr);
                long endTime2 = System.currentTimeMillis();
                System.out.println("Heap Sort " + type +" "+ arr.length + " eleman: " + (endTime2 - startTime2) + " ms");
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

    //Quick Sort
    public static int[] quickSort(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        if (result == null || arr.length <= 1) {
            return result;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(result.length);
        while (!stack.isEmpty()) {
            int end = stack.pop();
            int start = stack.pop();
            if (end - start < 2) {
                continue;
            }
            int pivotIndex = start + ((end - start) / 2);
            pivotIndex = partition(result, pivotIndex, start, end);
            stack.push(pivotIndex + 1);
            stack.push(end);
            stack.push(start);
            stack.push(pivotIndex);
        }
        return result;
    }

    public static int partition(int[] arr, int pivotIndex, int start, int end) {
        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, end - 1);
        int storeIndex = start;
        for (int i = start; i < end - 1; i++) {
            if (arr[i] < pivotValue) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }
        swap(arr, storeIndex, end - 1);
        return storeIndex;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //heap sort
    public static void sort(int arr[]) {
        int result[] = new int[arr.length];
        int n = result.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(result, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = result[0];
            result[0] = arr[i];
            result[i] = temp;
            heapify(result, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

}

