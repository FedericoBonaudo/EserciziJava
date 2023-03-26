import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        String numero = scanner.nextLine();
        int contatore = 0;
        for(int i=0; i<numero.length(); i++){
            contatore += Character.getNumericValue(numero.charAt(i));
        }
        System.out.println(contatore);
        }
    }

