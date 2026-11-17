import java.util.Scanner;
public class StringExample{
    
    public static void main(String[] args) {
       int[] marks= new int[5];

       for(int i=0;i<marks.length;i++){
            marks[i]=(int)(Math.random()*100);
       }
       for(int mark:marks){
            System.out.println(mark);
       }
    }
}