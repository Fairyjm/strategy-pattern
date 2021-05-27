package com.yim.strategy;

public class InsertionSort implements Sort {
	@Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int tmp = arr[i];
            for (; j >= 0; --j) {
                if (arr[j] > tmp){
                    arr[j+1] = arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

}
