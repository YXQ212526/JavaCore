import java.util.*;
public class ReverseString {
    public static String reverse(String src)
    {
        char[] arry=src.toCharArray();
        String des="";
        for(int i=src.length()-1;i>=0;i--){
                des+=arry[i];
        }
        return des;
    }
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    System.out.println("please input string to reverse");
    String src=in.nextLine();
    String des=reverse(src);
    System.out.println(des);
    }
}
