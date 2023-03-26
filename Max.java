
import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Crea un array, scegli il numero di elementi da inserire");
        int value = scanner.nextInt();
        int[] array = new int[value];
        int segnaposto = 0;
        
        for(int i=0; i<value; i++){
            System.out.println("inserisci un numero da inseriee nell'array");
            int num = scanner.nextInt();
            scanner.nextLine();
            array[i] = segnaposto + num;
        }
        Arrays.sort(array);
        System.out.println("il numero maggiore è: " + array[array.length-1]);
    }
}
