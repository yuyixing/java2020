package com.yuyx.offer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Utils
 *
 * @author yuyx
 */
public class Utils {

    public static Integer[] intsToIntegers(int[] ints) {
        return Arrays.stream(ints).boxed().toArray(Integer[]::new);
    }

    public static List<Integer> intsToList(int[] ints) {
        return IntStream.of(ints).boxed().collect(Collectors.toList());
    }

    public static Integer[] listToIntegers(List<Integer> list) {
        return list.toArray(new Integer[0]);
    }

    public static int[] listToInts(List<Integer> list) {
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static int[] integersToInts(Integer[] integers) {
        return Arrays.stream(integers).mapToInt(Integer::valueOf).toArray();
    }

    public static List<Integer> integersToList(Integer[] ints) {
        return Arrays.asList(ints);
    }

    public static int[][] listsTo2dInts(List<List<Integer>> lists) {
        int listsSize = lists.size();
        int maxListSize = 0;
        for (List<Integer> list : lists) {
            int listSize = list.size();
            if (listSize > maxListSize) {
                maxListSize = listSize;
            }
        }

        int[][] ints2D = new int[listsSize][maxListSize];
        for (int i = 0; i < listsSize; i++) {
            ints2D[i] = lists.get(i).stream().mapToInt(Integer::valueOf).toArray();
        }
        return ints2D;
    }

    public static int[] listsToInts(List<List<Integer>> lists) {
        int size = lists.size();
        if (size == 0) {
            return null;
        }
        List<Integer> list = lists.get(0);
        for (int i = 1; i < lists.size(); i++) {
            list.addAll(lists.get(i));
        }
        return Utils.listToInts(list);
    }

    public static int getIndexOfInts(int[] ints, int val) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
