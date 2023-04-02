import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the first number: ");
        float num1 = scan.nextFloat();

        System.out.println("Type the second number: ");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;


        System.out.println("Result: ");
        System.out.println("The First number is +. The Second number is -. The Third number is *. The Fourth number is /." + "\n" + res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n");


    }

}
