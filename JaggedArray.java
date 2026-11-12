public class JaggedArray{
    public static void main(String[] args){
        int[][]marks ={{90,80,50},{85,70},{60,75},{95,100,55},{65,45,30,20}};

        for(int i=0;i<marks.length;i++){
             int sum=0;
            for(int j=0;j<marks[i].length;j++){
                sum+=marks[i][j];
            }
            System.out.println("student"+(i+1)+": "+sum+" ");
        }
    }
}