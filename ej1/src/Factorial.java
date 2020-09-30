public class Factorial {
    public static void main(String args[]){
        int fact=1;
        int number=15;
        for(int i=1;i<=number;i++){
            fact=fact+fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);      }
}
