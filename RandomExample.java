import java.util.Random;
import java.util.Scanner;
public class RandomExample{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int seed=input.nextInt();
        Random random1=new Random(seed);
         System.out.println(random1.nextInt(100));
    }
}