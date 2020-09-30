import java.util.Scanner;

public class NumList {



    public static void main(String[] args) {
        

        int num1 = 0;
        int num2 = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime el numero ");
        num1 = reader.nextInt();
        System.out.println("Dime el numero ");
        num2 = reader.nextInt();
        for(int i = num1;i<= num2;i++){
            System.out.println(i);
        }
    }




}
