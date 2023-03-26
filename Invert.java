import java.util.Scanner;



public class Invert {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci da un numero: ");

        int reverse = 0;
        int number = scanner.nextInt();

        while(number != 0){
            int last = number % 10;
            reverse = (reverse * 10) + last;
            number = number/10;
        }

        System.out.println(reverse);
        
        
    }
}
