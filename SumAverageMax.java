import java.util.Scanner;

public class SumAverageMax{
    public static double Sum(double list[]){
        double sum=0;
        for(double single : list){
            sum+=single;
        }
        return sum;
    }
    public static double Average(double list[]){
        double sum=0;
        for(double single : list){
            sum+=single;
        }
        return sum/list.length;
    }
    public static double Max(double list[]){
        double max=list[0];
        for(int i=1;i<list.length;i++){
            if(list[i]>max)
               max=list[i];
            else
             continue;
        }
        return max;
    }

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter 5 number ");
      
        double list[]=new double[5];
        for (int i=0;i<list.length;i++){
            list[i]= input.nextDouble();
        }
        double sum=Sum(list);
        double average=Average(list);
        double max=Max(list);

        System.out.println("\n--- Sum, Average and Max ---");
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        System.out.println("Max: "+max);

    }
}