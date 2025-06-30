/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortingtest;

/**
 *
 * @author edkjd
 */
public class SortingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        float[] nums = new float[830];
//        float num = 10000f;
//        for (int a = 0; a < nums.length; a++) {
//            nums[a] = num;
//            num *= 1.1f;
//        }
//        float[] arr = new float[5000000];
//        float[] arr1 = new float[5000000];
//        test(arr, arr1, nums);
        floatSortTest1(1000000);
    }

    public static void test(float[] arr, float[] arr1, float[] nums) {

        float nStTime = 0, qStTime = 0;
        float temp;
        for (int b = 0; b < 10; b++) {
            for (int a = 0; a < arr.length; a++) {
                arr1[a] = arr[a] = nums[(int) (829 * Math.random())];
            }
            long time = System.nanoTime();
            Sort.FloatSort.newSorting(arr);
            System.out.println(arr.length + " new float sort : " + (temp=(System.nanoTime() - time) * 0.000001f) + "ms");
            nStTime += temp;
            
            time = System.nanoTime();
            Sort.FloatSort.quickSort(arr1);
            System.out.println(arr1.length + " quick sort : " + (temp=(System.nanoTime() - time) * 0.000001f) + "ms");
            qStTime += temp;

        }
        System.out.println(arr.length + " new sort avg : " + nStTime / 10);
        System.out.println(arr1.length + " q sort avg : " + qStTime / 10);
        
    }

    public static void floatSortTest1(int size) {

        float nStTime = 0, qStTime = 0;
        float[] arr = new float[size];
        float[] arr1 = new float[size];
        for (int b = 0; b < 100; b++) {
            for (int a = 0; a < arr.length; a++) {
                arr1[a] = arr[a] = (float) (Math.random() * Float.MAX_VALUE-Float.MAX_VALUE/2);
            }

            long time = System.nanoTime();
            float temp;
            Sort.FloatSort.newSorting(arr);
            System.out.println(size + " new float sort : " + (temp = (System.nanoTime() - time) * 0.000001f) + "ms");
            nStTime += temp;

            time = System.nanoTime();
            Sort.FloatSort.quickSort(arr1);
            System.out.println(size + " quick float sort : " + (temp = (System.nanoTime() - time) * 0.000001f) + "ms");
            qStTime += temp;
            System.out.println();
        }
        System.out.println(size + " new sort avg : " + nStTime / 100);
        System.out.println(size + " q sort avg : " + qStTime / 100);
        System.out.println(qStTime/nStTime+" rate faster");
    }

    public static void floatSortTest(int size) {

        float[] arr = new float[size];
        float[] arr1 = new float[size];
        for (int a = 0; a < arr.length; a++) {
            arr1[a] = arr[a] = (float) (Math.random() * arr.length);
        }

        long time = System.nanoTime();
        Sort.FloatSort.newSorting(arr);
        System.out.println(size + " new int sort : " + (System.nanoTime() - time) * 0.000001f + "ms");

        time = System.nanoTime();
        Sort.FloatSort.quickSort(arr1);
        System.out.println(size + " quick int sort : " + (System.nanoTime() - time) * 0.000001f + "ms");
        System.out.println();
    }

    public static void intSortTest(int size) {

        int[] arr = new int[size];
        int[] arr1 = new int[size];
        for (int a = 0; a < arr.length; a++) {
            arr1[a] = arr[a] = (int) (Math.random() * arr.length);
        }

        long time = System.nanoTime();
        Sort.IntSort.newSorting(arr);
        System.out.println(size + " new int sort : " + (System.nanoTime() - time) * 0.000001f + "ms");

        time = System.nanoTime();
        Sort.IntSort.quickSort(arr1);
        System.out.println(size + " quick int sort : " + (System.nanoTime() - time) * 0.000001f + "ms");
        System.out.println();
    }

}
