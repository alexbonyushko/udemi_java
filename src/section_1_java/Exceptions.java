package section_1_java;

public class Exceptions {
    public static void main(String[] args) {
        int[] nums = new int[4];
        try {
            System.out.println("Start");
            nums[7] = 8;
            nums[2] = 1 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("We have error with array lenth");
        } catch (ArithmeticException e) {
            System.out.println("We have arithmetic error");
        }catch (ArrayStoreException e){
            System.out.println("We have Store Exception error");
        }
    }
}
