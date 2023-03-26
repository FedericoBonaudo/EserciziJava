import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo peso");
        float peso = scanner.nextFloat();

        System.out.print("Please enter your height in cm: ");
        float altezza = scanner.nextFloat();

        float result = (peso / (altezza * altezza));

        System.out.println("Il tuo IMC è " + result);
    }
}
