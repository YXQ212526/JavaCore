import java.util.Scanner;

public class LoopDemo {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("how much do you want to get ?");
        double money=in.nextDouble();

        System.out.println("how much do you want to deposit every year ?");
        double everyyear=in.nextDouble();
        System.out.println("rate ?");
        double rate=in.nextDouble();
        double des=everyyear;
        int year=0;
        while(des<money)
        {
            des=(1+rate/100)*des;
            year++;
        }
        System.out.println("you will get it in "+year+" years");


    }
}
