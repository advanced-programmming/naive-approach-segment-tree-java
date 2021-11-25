package com.co.pa;

public class Main {

    public static void main(String[] args) {
        int[] test = new int[] {1, 6, -23, 4, -5, 9, -19};
        SegmentTree segmentTree = new SegmentTree(test);
    }
}



class SegmentTree {
    int[] arr;

    int[][] helper;

    SegmentTree(int[] array) {
        arr = array;
        fillHelper();
    }

    int sum(int a, int b){
        return 0;
    }

    boolean update(int i, int value){
        return true;
    }

    void fillHelper(){

    }
}