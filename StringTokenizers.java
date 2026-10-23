import java.util.StringTokenizer;

public class StringTokenizers{
    public static void main(String[] args){
        String s="hello every one how are you doing , i'm doing well if you ask me and , thank you to ask me , so today i will tell you about java programming one of te most popular widly user programming language, i'm currently learning hava programming and lemme tell you how match interesting it is ,when i start learing java is was very esy since i have cpp language experiance before and that makes things easy to learn java easly even in one day ";
        StringTokenizer st = new StringTokenizer(s,"");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}