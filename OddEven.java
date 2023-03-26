import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari");
        }
    }
}
