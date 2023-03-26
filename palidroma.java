import java.util.Scanner;

public class palidroma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inerisci una parola");
        String palindromo = scanner.nextLine();
        String segnaposto = "";
        int lunghezza = palindromo.length();

        for(int i=lunghezza-1; i >= 0;i--){
            String lettera = String.valueOf(palindromo.charAt(i));
            segnaposto += lettera ;
        }
        
        if(segnaposto.equals(palindromo)){
            System.out.println("lo è");
        } else {
            System.out.println("non lo è");
        } 


    }
}
