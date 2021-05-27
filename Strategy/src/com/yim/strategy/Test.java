package com.yim.strategy;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        ArrayHandle handle = new ArrayHandle();
        handle.setSortObj(new BubbleSort());
        handle.setSortObj(new InsertionSort());
        handle.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

////抽象策略类
//
////具体策略类
////插入排序
//class InsertionSort implements Sort{
//    @Override
//    public int[] sort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int j = i-1;
//            int tmp = arr[i];
//            for (; j >= 0; --j) {
//                if (arr[j] > tmp){
//                    arr[j+1] = arr[j];
//                }
//                else {
//                    break;
//                }
//            }
//            arr[j+1] = tmp;
//        }
//        return arr;
//    }
//}
//
////冒泡排序
//class BubbleSort implements Sort{
//    @Override
//    public int[] sort(int[] arr) {
//        for (int i = arr.length-1; i >= 0 ; --i) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j+1]){
//                    int tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                }
//            }
//        }
//        return arr;
//    }
//}
//
//class ArrayHandle implements Sort{
//    private Sort sortObj;
//
//    public void setSortObj(Sort sortObj) {
//        this.sortObj = sortObj;
//    }
//
//    @Override
//    public int[] sort(int[] arr) {
//        return sortObj.sort(arr);
//    }
//}
