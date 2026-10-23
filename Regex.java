import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Regex{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a your Id: ");
        String str = input.nextLine();
      //the regex pattern to match the string
       Pattern p=Pattern.compile("bdu[0-9]{7}");
       Matcher m=p.matcher(str);

       System.out.print("----------Id status----------\n");
       if(m.matches()){
        System.out.print("\tvalid ID");

       }
       else{
        System.out.print("\t invalid ID");
       }
    }
}