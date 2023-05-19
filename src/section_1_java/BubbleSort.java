package section_1_java;

/**
 * 11.Bubble Sort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 6, 9, 4, 153, 0};
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
