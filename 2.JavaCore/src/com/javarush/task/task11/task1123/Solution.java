    package com.javarush.task.task11.task1123;

    import java.util.Arrays;

    public class Solution {

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int [] copyArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int i = copyArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (copyArray[j] > copyArray[j+1]) {
                    int temp = copyArray[j];
                    copyArray[j] = copyArray[j+1];
                    copyArray[j+1] = temp;
                }
            }
        }
        return new Pair<Integer, Integer>(copyArray[0], copyArray[copyArray.length-1]);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
