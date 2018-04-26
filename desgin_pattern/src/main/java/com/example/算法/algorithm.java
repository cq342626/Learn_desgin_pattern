package com.example.算法;

/**
 * 作者：CQ on 2018/4/26 10:53
 * 作用：算法
 */
public class algorithm {
    public static void main(String[] args) {
        int[] in = new int[]{2, 1, 5, 3, 67, 4};
//        sortInsert(in);
        pubbleSort(in);
        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
    }


    /**
     * 1.插入排序算法
     */
    public static int[] sortInsert(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j > 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }

        return array;
    }

    /**
     * 选择排序算法
     */
    public static int[] sortSelect(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPost = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    minPost = j;
                }
            }
            if (arr[minPost] < arr[i]) {
                int min = arr[minPost];
                arr[minPost] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }

    /**
     * 冒泡排序
     * 2, 1, 5, 3, 67, 4
     */
    private static void pubbleSort(int[] numbers) {
        int temp;
        int size = numbers.length;
        for (int k = 0; k < size; k++) {
            System.out.print(numbers[k] + "、");
        }System.out.println();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    for (int k = 0; k < size; k++) {
                        System.out.print(numbers[k] + "、");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

}
