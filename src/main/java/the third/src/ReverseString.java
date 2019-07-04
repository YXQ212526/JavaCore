import java.util.*;
public class ReverseString {
    public static char[] reverse(char[] src,int size)
    {

        int i=size-1;
        int j=0;

        for(;i>=j;i--,j++){
            char temp=src[i];
            src[i]=src[j];
            src[j]=temp;
        }
        return src;
    }
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    System.out.println("please input string to reverse");
    String src=in.nextLine();
    char[] array=src.toCharArray();
    int size=src.length();
    char[] des=reverse(array,size);
    System.out.println(des);
    }
}
