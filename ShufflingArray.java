public class ShufflingArray{
    public static void main(String[] args){
        int[] marks = {90,80,50,85,70,60,75,95,100,55};

        for(int i=0;i<marks.length;i++){
            int randomIndex = (int)(Math.random()* marks.length);

            int temp = marks[i];
            marks[i] = marks[randomIndex];
            marks[randomIndex] = temp;
        }

        // Print the shuffled array
        for(int mark:marks){
            System.out.print(mark + " ");
        }
    }
}