package org.ferhat;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("İntel i7 6 çekirdekli 16 GB Ram bir bilgisayarda alınan sonuçlardır. \n");

        System.out.println("************ Bin Başlangıç ************");
        int[] binrandom = generateRandomArray(1000);
        printSortTime(binrandom,"mergeSort", "Random");
        printSortTime(binrandom,"quickSort", "Random");
        printSortTime(binrandom,"heapSort","Random");
        printSortTime(binrandom,"selectionSort","Random");
        printSortTime(binrandom,"bubbleSort","Random");
        printSortTime(binrandom,"insertionSort","Random");
        printSortTime(binrandom,"shellSort","Random");
        System.out.println("\n");
        Arrays.sort(binrandom);
        printSortTime(binrandom,"mergeSort", "Sıralı");
        printSortTime(binrandom,"quickSort", "Sıralı");
        printSortTime(binrandom,"heapSort","Sıralı");
        printSortTime(binrandom,"selectionSort","Sıralı");
        printSortTime(binrandom,"bubbleSort","Sıralı");
        printSortTime(binrandom,"insertionSort","Sıralı");
        printSortTime(binrandom,"shellSort","Sıralı");
        System.out.println("\n");
        int[] binReverse = reverseSort(binrandom);
        printSortTime(binReverse,"mergeSort", "Tersten");
        printSortTime(binReverse,"quickSort", "Tersten");
        printSortTime(binReverse,"heapSort","Tersten");
        printSortTime(binReverse,"selectionSort","Tersten");
        printSortTime(binReverse,"bubbleSort","Tersten");
        printSortTime(binReverse,"insertionSort","Tersten");
        printSortTime(binReverse,"shellSort","Tersten");
        System.out.println("\n");
        System.out.println("************ On Bin Başlangıç ************");
        int[] onbinrandom = generateRandomArray(10000);
        printSortTime(onbinrandom,"mergeSort","Random");
        printSortTime(onbinrandom,"quickSort", "Random");
        printSortTime(onbinrandom,"heapSort","Random");
        printSortTime(onbinrandom,"selectionSort","Random");
        printSortTime(onbinrandom,"bubbleSort","Random");
        printSortTime(onbinrandom,"insertionSort","Random");
        printSortTime(onbinrandom,"shellSort","Random");
        System.out.println("\n");
        Arrays.sort(onbinrandom);
        printSortTime(onbinrandom,"mergeSort", "Sıralı");
        printSortTime(onbinrandom,"quickSort", "Sıralı");
        printSortTime(onbinrandom,"heapSort","Sıralı");
        printSortTime(onbinrandom,"selectionSort","Sıralı");
        printSortTime(onbinrandom,"bubbleSort","Sıralı");
        printSortTime(onbinrandom,"insertionSort","Sıralı");
        printSortTime(onbinrandom,"shellSort","Sıralı");

        System.out.println("\n");
        int[] onbinreverse = reverseSort(onbinrandom);
        printSortTime(onbinreverse,"mergeSort", "Tersten");
        printSortTime(onbinreverse,"quickSort", "Tersten");
        printSortTime(onbinreverse,"heapSort","Tersten");
        printSortTime(onbinreverse,"selectionSort","Tersten");
        printSortTime(onbinreverse,"bubbleSort","Tersten");
        printSortTime(onbinreverse,"insertionSort","Tersten");
        printSortTime(onbinreverse,"shellSort","Tersten");

        System.out.println("\n");
        System.out.println("************ Elli Bin Başlangıç ************");
        int[] ellibinrandom = generateRandomArray(50000);
        printSortTime(ellibinrandom,"mergeSort", "Random");
        printSortTime(ellibinrandom,"quickSort", "Random");
        printSortTime(ellibinrandom,"heapSort","Random");
        printSortTime(ellibinrandom,"selectionSort","Random");
        printSortTime(ellibinrandom,"bubbleSort","Random");
        printSortTime(ellibinrandom,"insertionSort","Random");
        printSortTime(ellibinrandom,"shellSort","Random");
        Arrays.sort(ellibinrandom);
        System.out.println("\n");
        printSortTime(ellibinrandom,"mergeSort", "Sıralı");
        printSortTime(ellibinrandom,"quickSort", "Sıralı");
        printSortTime(ellibinrandom,"heapSort","Sıralı");
        printSortTime(ellibinrandom,"selectionSort","Sıralı");
        printSortTime(ellibinrandom,"bubbleSort","Sıralı");
        printSortTime(ellibinrandom,"insertionSort","Sıralı");
        printSortTime(ellibinrandom,"shellSort","Sıralı");
        int[] ellibinreverse = reverseSort(ellibinrandom);
        System.out.println("\n");
        printSortTime(ellibinreverse,"mergeSort", "Tersten");
        printSortTime(ellibinreverse,"quickSort", "Tersten");
        printSortTime(ellibinreverse,"heapSort","Tersten");
        printSortTime(ellibinreverse,"selectionSort","Tersten");
        printSortTime(ellibinreverse,"bubbleSort","Tersten");
        printSortTime(ellibinreverse,"insertionSort","Tersten");
        printSortTime(ellibinreverse,"shellSort","Tersten");
        System.out.println("\n");

        System.out.println("************ Yüz Bin Başlangıç ************");
        int[] yuzbinrandom = generateRandomArray(100000);
        printSortTime(yuzbinrandom,"mergeSort", "Random");
        printSortTime(yuzbinrandom,"quickSort", "Random");
        printSortTime(yuzbinrandom,"heapSort","Random");
        printSortTime(yuzbinrandom,"selectionSort","Random");
        printSortTime(yuzbinrandom,"bubbleSort","Random");
        printSortTime(yuzbinrandom,"insertionSort","Random");
        printSortTime(yuzbinrandom,"shellSort","Random");

        System.out.println("\n");
        Arrays.sort(yuzbinrandom);
        printSortTime(yuzbinrandom,"mergeSort", "Sıralı");
        printSortTime(yuzbinrandom,"quickSort", "Sıralı");
        printSortTime(yuzbinrandom,"heapSort","Sıralı");
        printSortTime(yuzbinrandom,"selectionSort","Sıralı");
        printSortTime(yuzbinrandom,"bubbleSort","Sıralı");
        printSortTime(yuzbinrandom,"insertionSort","Sıralı");
        printSortTime(yuzbinrandom,"shellSort","Sıralı");

        System.out.println("\n");
        int[] yuzbinreverse = reverseSort(yuzbinrandom);
        printSortTime(yuzbinreverse,"mergeSort", "Tersten");
        printSortTime(yuzbinreverse,"quickSort", "Tersten");
        printSortTime(yuzbinreverse,"heapSort","Tersten");
        printSortTime(yuzbinreverse,"selectionSort","Tersten");
        printSortTime(yuzbinreverse,"bubbleSort","Tersten");
        printSortTime(yuzbinreverse,"insertionSort","Tersten");
        printSortTime(yuzbinreverse,"shellSort","Tersten");

        System.out.println("\n");

        System.out.println("************ Bes Yüz Bin Başlangıç ************");
        int[] besyuzbinrandom = generateRandomArray(500000);
        printSortTime(besyuzbinrandom,"mergeSort", "Random");
        printSortTime(besyuzbinrandom,"quickSort", "Random");
        printSortTime(besyuzbinrandom,"heapSort","Random");
        printSortTime(besyuzbinrandom,"selectionSort","Random");
        printSortTime(besyuzbinrandom,"bubbleSort","Random");
        printSortTime(besyuzbinrandom,"insertionSort","Random");
        printSortTime(besyuzbinrandom,"shellSort","Random");
        System.out.println("\n");
        Arrays.sort(besyuzbinrandom);
        printSortTime(besyuzbinrandom,"mergeSort", "Sıralı");
        printSortTime(besyuzbinrandom,"quickSort", "Sıralı");
        printSortTime(besyuzbinrandom,"heapSort","Sıralı");
        printSortTime(besyuzbinrandom,"selectionSort","Sıralı");
        printSortTime(besyuzbinrandom,"bubbleSort","Sıralı");
        printSortTime(besyuzbinrandom,"insertionSort","Sıralı");
        printSortTime(besyuzbinrandom,"shellSort","Sıralı");
        System.out.println("\n");
        int[] besyuzbinreverse = reverseSort(besyuzbinrandom);
        printSortTime(besyuzbinreverse,"mergeSort", "Tersten");
        printSortTime(besyuzbinreverse,"quickSort", "Tersten");
        printSortTime(besyuzbinreverse,"heapSort","Tersten");
        printSortTime(besyuzbinreverse,"selectionSort","Tersten");
        printSortTime(besyuzbinreverse,"bubbleSort","Tersten");
        printSortTime(besyuzbinreverse,"insertionSort","Tersten");
        printSortTime(besyuzbinreverse,"shellSort","Tersten");
        System.out.println("\n");

        System.out.println("************ Bir Milyon Başlangıç ************");
        int[] milyonrandom = generateRandomArray(1000000);
        printSortTime(milyonrandom,"mergeSort","Random");
        printSortTime(milyonrandom,"quickSort", "Random");
        printSortTime(milyonrandom,"heapSort","Random");
        printSortTime(milyonrandom,"selectionSort","Random");
        printSortTime(milyonrandom,"bubbleSort","Random");
        printSortTime(milyonrandom,"insertionSort","Random");
        printSortTime(milyonrandom,"shellSort","Random");
        System.out.println("\n");
        Arrays.sort(milyonrandom);
        printSortTime(milyonrandom,"mergeSort", "Sıralı");
        printSortTime(milyonrandom,"quickSort", "Sıralı");
        printSortTime(milyonrandom,"heapSort","Sıralı");
        printSortTime(milyonrandom,"selectionSort","Sıralı");
        printSortTime(milyonrandom,"bubbleSort","Sıralı");
        printSortTime(milyonrandom,"insertionSort","Sıralı");
        printSortTime(milyonrandom,"shellSort","Sıralı");
        System.out.println("\n");
        int[] milyonreverse = reverseSort(milyonrandom);
        printSortTime(milyonreverse,"mergeSort", "Tersten");
        printSortTime(milyonreverse,"quickSort", "Tersten");
        printSortTime(milyonreverse,"heapSort","Tersten");
        printSortTime(milyonreverse,"selectionSort","Tersten");
        printSortTime(milyonreverse,"bubbleSort","Tersten");
        printSortTime(milyonreverse,"insertionSort","Tersten");
        printSortTime(milyonreverse,"shellSort","Tersten");



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

