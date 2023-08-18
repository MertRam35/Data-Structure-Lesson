import java.util.Arrays;

public class Task1 {


    /**
     * *Example:
     * Input: nums : [2, target : 9
     * Output: [0,1]
     * *
     */

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }


        }
        System.out.println(Arrays.toString(result));

    }
}
