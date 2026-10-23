import java.util.Scanner;
public class Matrix{
    public static void DisplayMatrix(double[][] matrix){
        System.out.println("\n--- Matrix ---");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        double[][] matrix= new double[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter the value for A" + (i+1)+(j+1) + ": ");
                matrix[i][j]=input.nextDouble();
            }
        }
        DisplayMatrix(matrix);

    }
}