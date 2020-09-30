import java.util.Scanner;

public class Num {
    public static void main(String[] args) {

        int[] nums = new int[5];
        Scanner reader = new Scanner(System.in);
        int num = 0;
        int sum =0;

        for (int i = 0;i< 5;i++){
            System.out.println("Dime el numero");
            num = reader.nextInt();
            nums[i]=num;
            sum=sum+num;

        }
        System.out.println(sum);
        for(int i = 4 ; i>=0;i--){
            System.out.println(nums[i]);
        }
    }
}
