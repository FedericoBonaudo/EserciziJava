import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int value = scanner.nextInt();
        int[] arr = new int[value];
        int totale = 0;

        for(int i=0; i<arr.length; i++){
            System.out.println("Riempi l'array");
            int num = scanner.nextInt();
            arr[i] = num;
        }

        for(int i=0; i<arr.length; i++){
            totale += arr[i];
        }

        int result = totale / arr.length;

        System.out.println("la media è " + result);
    }
}
