package com.company;

/**
 * Created by golova on 3/28/17.
 */
public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int i=0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count = count + 1;
            }
        }
        return count;
    }
}
