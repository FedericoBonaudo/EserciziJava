import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una frase");
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        for (String element : array) {
            System.out.println(element.charAt(0) + ".");
        }
    

    }
}
