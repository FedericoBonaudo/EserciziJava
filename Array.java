import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero :");
        int input = scanner.nextInt();

        int somma = 0;
        
        int[] numero = new int[input];

        for(int i=0; i<numero.length; i++){
            System.out.println("inserisci un numero per comporre l'array");
            int num = scanner.nextInt();
            numero[i] = num;
        }

        for(int i=0; i<numero.length; i++){
            somma += numero[i];
        }


        System.out.println(somma);


        
    }
}
