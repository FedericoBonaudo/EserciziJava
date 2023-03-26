import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisciun numero per dare la lunghezza dell'array");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for(int i=0; i<length; i++){
            System.out.println("Inserisci i numeri da mettere nell'array");
            int num = scanner.nextInt();
            array[i] = num;
        }

        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println("pari: " + array[i]);;
            } 
        }
    }
}
