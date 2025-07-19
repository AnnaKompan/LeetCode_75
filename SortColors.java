import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums1 = { 2, 0, 2, 1, 1, 0 };
        int[] nums2 = { 2, 0, 1 };

        System.out.println("Sorted version of " + Arrays.toString(nums1) + " is " + Arrays.toString(SortCol(nums1)));
        System.out.println("Sorted version of " + Arrays.toString(nums2) + " is " + Arrays.toString(SortCol(nums1)));
    }

    public static int[] SortCol(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++){
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return nums;
    }
}