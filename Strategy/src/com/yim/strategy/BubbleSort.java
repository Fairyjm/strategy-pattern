package com.yim.strategy;

public class BubbleSort implements Sort {
	@Override
    public int[] sort(int[] arr) {
        for (int i = arr.length-1; i >= 0 ; --i) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
	

}
