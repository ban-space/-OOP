import java.util.Scanner;

public class Department {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        String department;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your department: ");
        department = input.nextLine();

        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}