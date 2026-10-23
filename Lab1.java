import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sr= new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the first number :");
        a=sr.nextInt();
        System.out.println("Enter the second number :");
        b=sr.nextInt();

        System.out.println("the numbers are :" + a + " and " + b);
    }
}