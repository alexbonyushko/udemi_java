package section_1_java;

/**
 * 9.Array
 */
public class Arrays {

    public static void printArrayFor(int[] arr) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Value [" + i + "]" + " index = " + arr[i]);
        }
    }

    public static void printArrayForIch(int[] arr) {
        for (int e : arr) {
            System.out.println("value [" + e + "]");
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = i;
        }
        nums[3] = 100;
        printArrayFor(nums);
        printArrayForIch(nums);

        /**
         * two-dimensional array
         */
        int arr [][]=new int[3][4];


    }
}
