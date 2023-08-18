import java.util.Arrays;


public class TwoSum {


    public static void main(String[] args) {


        Integer[] nums = new Integer[]{2, 7, 11, 15};


        System.out.println(Arrays.toString(twoSum(nums, 22)));

    }

    public static Integer[] twoSum(Integer[] nums, Integer target) {



        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                   return new Integer[]{i,j};
                }

            }

        }


        return new Integer[]{};
    }
}
