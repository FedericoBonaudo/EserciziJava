import java.util.Scanner;

class Pass{
    public static void main(String[] args) {
        Boolean firstRule = false;
        Boolean secondRule = false;
        Boolean thirdRule = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la password: ");
        String password = scanner.nextLine();


         if(password.length() >= 8) firstRule = true;


         for(int i = 0; i<password.length(); i++){
             if(Character.isUpperCase(password.charAt(i))) secondRule = true; 
         }

         for(int i = 0; i<password.length(); i++){
            if(Character.isDigit(password.charAt(i))) thirdRule = true;
        }

         if(firstRule && secondRule && thirdRule){
            System.out.println("La password è corretta");
         } else {
            System.out.println("La password non è corretta");
         }

         
    }

}
