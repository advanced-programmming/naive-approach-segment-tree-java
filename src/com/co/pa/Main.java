package com.co.pa;

public class Main {

    public static void main(String[] args) {
        int[] test = new int[] {1, 6, -23, 4, -5, 9, -19};
        SegmentTree segmentTree = new SegmentTree(test);
        int result = segmentTree.sum(0, 2);
        boolean resultBoolean = segmentTree.update(0, 100);
    }
}

class SegmentTree {
    int[] arr;
    int[][] helper;

    SegmentTree(int[] array) {
        arr = array;
        fillHelper();
    }

    int sum(int a, int b) {
        return helper[a][b];
    }

    boolean update(int i, int value) {
        arr[i] = value;
        fillHelper();
        return true;
    }

    void fillHelper(){
        int size = arr.length;
        helper = new int[size][size];

        for(int i = 0; i < size; i++) {
            int arri = arr[i];
            for (int j = i; j < size; j++) {
                int arrj = arr[j];

                if(i == j) {
                    helper[i][j] = arri;
                } else {
                    helper[i][j] = arri + arrj;
                    arri = helper[i][j];
                }
            }
        }
    }
}