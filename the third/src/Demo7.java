import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to draw?");
        int draw = in.nextInt();
        System.out.println("How many the highest numbers do you want to draw?");
        int sum = in.nextInt();
        int[] array1 = new int[sum];
        int[] array2 = new int[draw];
        for (int i = 0; i < sum; i++) {
            array1[i] = i + 1;
        }
        for (int i = 0; i < draw; i++) {
            int random = (int) (Math.random() * sum);
            array2[i] = array1[random];
            array1[random] = array1[sum - 1];
            sum--;
        }
        Arrays.sort(array2);
        System.out.println("perhaps they are:");
        System.out.println(Arrays.toString(array2));
    }
}
