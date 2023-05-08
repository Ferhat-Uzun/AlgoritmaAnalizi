package org.ferhat;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("İntel i7 6 çekirdekli 16 GB Ram bir bilgisayarda alınan sonuçlardır. \n");

        System.out.println("************ Bin Başlangıç ************");
        int[] binrandom = generateRandomArray(1000);
        for (String s1 : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(binrandom, s1, "Random");
        }
        System.out.println("\n");
        Arrays.sort(binrandom);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(binrandom, s, "Sıralı");
        }
        System.out.println("\n");
        int[] binReverse = reverseSort(binrandom);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(binReverse, s, "Tersten");
        }
        System.out.println("\n");
        System.out.println("************ On Bin Başlangıç ************");
        int[] onbinrandom = generateRandomArray(10000);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(onbinrandom, s,"Random");
        }
        System.out.println("\n");
        Arrays.sort(onbinrandom);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(onbinrandom, s, "Sıralı");
        }

        System.out.println("\n");
        int[] onbinreverse = reverseSort(onbinrandom);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(onbinreverse, s, "Tersten");
        }

        System.out.println("\n");
        System.out.println("************ Elli Bin Başlangıç ************");
        int[] ellibinrandom = generateRandomArray(50000);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(ellibinrandom, s, "Random");
        }
        Arrays.sort(ellibinrandom);
        System.out.println("\n");
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(ellibinrandom, s, "Sıralı");
        }
        int[] ellibinreverse = reverseSort(ellibinrandom);
        System.out.println("\n");
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(ellibinreverse, s, "Tersten");
        }
        System.out.println("\n");

        System.out.println("************ Yüz Bin Başlangıç ************");
        int[] yuzbinrandom = generateRandomArray(100000);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(yuzbinrandom, s, "Random");
        }

        System.out.println("\n");
        Arrays.sort(yuzbinrandom);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(yuzbinrandom, s, "Sıralı");
        }

        System.out.println("\n");
        int[] yuzbinreverse = reverseSort(yuzbinrandom);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(yuzbinreverse, s, "Tersten");
        }

        System.out.println("\n");

        System.out.println("************ Bes Yüz Bin Başlangıç ************");
        int[] besyuzbinrandom = generateRandomArray(500000);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(besyuzbinrandom, s, "Random");
        }
        System.out.println("\n");
        Arrays.sort(besyuzbinrandom);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(besyuzbinrandom, s, "Sıralı");
        }
        System.out.println("\n");
        int[] besyuzbinreverse = reverseSort(besyuzbinrandom);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(besyuzbinreverse, s, "Tersten");
        }
        System.out.println("\n");

        System.out.println("************ Bir Milyon Başlangıç ************");
        int[] milyonrandom = generateRandomArray(1000000);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(milyonrandom, s,"Random");
        }
        System.out.println("\n");
        Arrays.sort(milyonrandom);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(milyonrandom, s, "Sıralı");
        }
        System.out.println("\n");
        int[] milyonreverse = reverseSort(milyonrandom);
        for (String s : Arrays.asList("mergeSort", "quickSort", "heapSort", "selectionSort", "bubbleSort", "insertionSort", "shellSort")) {
            printSortTime(milyonreverse, s, "Tersten");
        }


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
                heapSort(arr);
                long endTime2 = System.currentTimeMillis();
                System.out.println("Heap Sort " + type +" "+ arr.length + " eleman: " + (endTime2 - startTime2) + " ms");
                break;
            case "selectionSort":
                long startTime3 = System.currentTimeMillis();
                selectionSort(arr);
                long endTime3 = System.currentTimeMillis();
                System.out.println("Selection Sort " + type +" "+ arr.length + " eleman: " + (endTime3 - startTime3) + " ms");
                break;
            case "bubbleSort":
                long startTime4 = System.currentTimeMillis();
                bubbleSort(arr);
                long endTime4 = System.currentTimeMillis();
                System.out.println("Bubble Sort " + type +" "+ arr.length + " eleman: " + (endTime4 - startTime4) + " ms");
                break;
            case "insertionSort":
                long startTime5 = System.currentTimeMillis();
                insertionSort(arr);
                long endTime5 = System.currentTimeMillis();
                System.out.println("Insertion Sort " + type +" "+ arr.length + " eleman: " + (endTime5 - startTime5) + " ms");
                break;
            case "shellSort":
                long startTime6= System.currentTimeMillis();
                shellSort(arr);
                long endTime6 = System.currentTimeMillis();
                System.out.println("Shell Sort " + type +" "+ arr.length + " eleman: " + (endTime6 - startTime6) + " ms");
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
    public static void heapSort(int arr[]) {
        int[] result = Arrays.copyOf(arr, arr.length);
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

    //Selection Sort
    public static void selectionSort(int arr[]) {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < result.length; i++) {
            int min = i;
            for (int j = i + 1; j < result.length; j++) {
                if (result[j] < result[min]) {
                    min = j;
                }
            }
            int temp = result[i];
            result[i] = result[min];
            result[min] = temp;
        }
    }

    //Bubble Sort
    public static void bubbleSort(int arr[]) {
        int[] result = Arrays.copyOf(arr, arr.length);

        boolean swapped = false;
        do {
            swapped = false;
            for(int i=1; i<result.length; i++) {
                if( result[i-1] > result[i] ) {
                    int temp = result[i];
                    result[i] = result[i-1];
                    result[i-1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);
    }

    //İnsertion Sort
    public static void insertionSort(int arr[]) {
        int[] result = Arrays.copyOf(arr, arr.length);
        for(int i = 1; i < result.length; i++) {
            int value = result[i];
            int j = i - 1;
            while(j >= 0 && result[j] > value) {
                result[j + 1] = result[j];
                j = j - 1;
            }
            result[j + 1] = value;
        }
    }

    //Shell Sort
    public static void shellSort(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int increment = result.length / 2; increment > 0; increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (int i = increment; i < result.length; i++) {
                int temp = result[i];
                for (int j = i; j >= increment && result[j - increment] > temp; j -= increment){
                    result[j] = result[j - increment];
                    result[j - increment] = temp;
                }
            }
        }
    }
}