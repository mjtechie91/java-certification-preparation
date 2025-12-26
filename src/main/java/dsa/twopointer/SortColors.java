package dsa.twopointer;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] input = {1,0,0,2,2,1,1,0,1,2};
        System.out.println(Arrays.toString(input));
        sortColors(input);
        System.out.println(Arrays.toString(input));
    }
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                int tmp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = tmp;
                mid++;
                low++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                int tmp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = tmp;
                high--;
            }
        }
    }
}
