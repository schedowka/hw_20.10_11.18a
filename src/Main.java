import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("элементы массива: " );

        int [] myArray = new int[scan.nextInt()];

        for (int i = 0; i < myArray.length; i++) {
            myArray [i] = scan.nextInt();
        }
        for (int i = 0; i < myArray.length; i++){
            myArray [i] = myArray[i]-20;
        }


        System.out.print(Arrays.toString(myArray));
    }
}
