import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void findThebigNumber(int numberOne, int numberTwo){
        if(numberOne > numberTwo){
            System.out.print("The cycle is over!");
        }else{
            System.out.print("Please,enter a number smaller than the number you entered first.!");
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numberOne = input.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = input.nextInt();
        findThebigNumber(numberOne , numberTwo);


        }
    }
