import java.util.*;


public class Mayor {
    public static void main(String[] args) {
        int[] nums = new int[]{ 1,1,1,2,1,1 };
        int may= nums[0];
        for(int i = 0;i< nums.length;i++){
            if (nums[i]>may)
            {
                may=nums[i];
            }
        }
        System.out.println(may);

    }
}
