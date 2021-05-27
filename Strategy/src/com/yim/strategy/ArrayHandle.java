package com.yim.strategy;

public class ArrayHandle implements Sort {
	private Sort sortObj;

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }

    @Override
    public int[] sort(int[] arr) {
        return sortObj.sort(arr);
    }

}
