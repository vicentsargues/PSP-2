import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num = 0;
        num = reader.nextInt();
        System.out.println(num);
        int sum =0;

        for (int i = 0 ; i<=num;i++){
            if (i%2==0){
                sum = sum +i;
            }
        }
        System.out.println(sum);

    }
}
