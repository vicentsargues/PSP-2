import java.util.Scanner;

public class Experiencia {
    public static void main(String[] args) {

        int num = 0;
        String nom ;
        Scanner reader = new Scanner(System.in);
        System.out.println("Dime el numero de años trabajados");
        num = reader.nextInt();
        System.out.println("Dime el nombre");
        nom = reader.next();
        if(num<=1){
            System.out.println("Desarrollador Junior L1 – 15000-18000");
        }
        if(num<=3&&num>1){
            System.out.println("Desarrollador Junior L2 – 18000-22000");
        }
        if(num<=5&&num>3){
            System.out.println("Desarrollador Senior L1 – 22000-28000");
        }
        if(num<=8&&num<5){
            System.out.println("Desarrollador Senior L2 – 28000-36000");
        }
        if(num>8){
            System.out.println("Analista / Arquitecto. Salario a convenir en base a rol");
        }
    }

}
