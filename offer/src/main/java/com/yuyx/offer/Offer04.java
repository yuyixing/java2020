package com.yuyx.offer;

/**
 * 二维数组中的查找
 *
 * @author yuyx
 */
public class Offer04 {

    /***
     * 遍历二维数组
     * O(mn) O(1)
     */
    public boolean findNumberIn2dArray0101(int[][] matrix, int target) {
        if (paramsInvalid(matrix, target)) {
            return false;
        }

        for (int[] line : matrix) {
            for (int num : line) {
                if (num == target) {
                    return true;
                }
            }
        }

        return false;
    }

    /***
     * 二叉搜索树
     * O(m+n) O(1)
     */
    public boolean findNumberIn2dArray0102(int[][] matrix, int target) {
        if (paramsInvalid(matrix, target)) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int curRow = 0, curColumn = columns - 1;

        while (curRow < rows && curColumn >= 0) {
            if (matrix[curRow][curColumn] == target) {
                return true;
            }
            if (matrix[curRow][curColumn] > target) {
                curColumn--;
            } else {
                curRow++;
            }
        }

        return false;
    }

    private boolean paramsInvalid(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return true;
        }

        return matrix[0][0] > target || matrix[matrix.length - 1][matrix[0].length - 1] < target;
    }

}
