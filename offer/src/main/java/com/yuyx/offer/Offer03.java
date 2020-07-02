package com.yuyx.offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * @author yuyx
 */
public class Offer03 {

    /***
     * 排序
     * O(nLogn) O(1)
     */
    public int getRepeat0101(int[] nums) {
        if (paramsInvalid(nums)) {
            return -1;
        }

        Arrays.sort(nums);

        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }


    /***
     * 哈希
     * O(n) O(n)
     */
    public int getRepeat0102(int[] nums) {
        if (paramsInvalid(nums)) {
            return -1;
        }

        Map<Integer, Integer> repeatNums = new HashMap<>(nums.length);

        for (int num : nums) {
            if (repeatNums.containsValue(num)) {
                return num;
            } else {
                repeatNums.put(num, num);
            }
        }
        return -1;
    }

    /***
     * 索引
     * O(n) O(1)
     */
    public int getRepeat0103(int[] nums) {
        if (paramsInvalid(nums)) {
            return -1;
        }

        int length = nums.length;
        int m;
        for (int i = 0; i < length; i++) {
            m = nums[i];
            while (m != i) {
                if (m == nums[m]) {
                    return m;
                }
                nums[i] = nums[m];
                nums[m] = m;
                m = nums[i];
            }
        }
        return -1;
    }

    /***
     * 辅助数组
     * O(n) O(n)
     */
    public int getRepeat0104(int[] nums) {
        int[] arr = new int[nums.length];
        for (int num : nums) {
            arr[num]++;
            if (arr[num] > 1) {
                return num;
            }
        }
        return -1;
    }

    /***
     * 不修改原数组
     * O(n) O(n)
     */
    public int getRepeat0201(int[] nums) {
        if (paramsInvalid(nums)) {
            return -1;
        }

        int[] result = new int[nums.length];
        for (int num : nums) {
            result[num]++;
            if (result[num] > 1) {
                return num;
            }
        }

        return -1;
    }

    /***
     * 二分查找
     * 无法保证找出重复数字
     * O(nLogn) O(1)
     */
    public int getRepeat0202(int[] nums) {
        if (paramsInvalid(nums)) {
            return -1;
        }

        int start = 1;
        int end = nums.length - 1;

        while (end >= start) {
            int middle = ((end - start) >> 1) + start;
            int count = countRange(nums, start, middle);

            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }

            if (count > (middle - start + 1)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }

        return -1;
    }

    private int countRange(int[] nums, int start, int end) {
        int count = 0;
        for (int num : nums) {
            if (num >= start && num <= end) {
                count++;
            }
        }

        return count;
    }

    private boolean paramsInvalid(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }

        for (int num : nums) {
            if (num < 0 || num >= nums.length) {
                return true;
            }
        }
        return false;
    }
}
