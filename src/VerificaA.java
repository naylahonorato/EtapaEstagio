import java.util.Scanner;

public class VerificaA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String entrada = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);

            if (letra == 'a' || letra == 'A'){
                contador++;
            }
        }

        if (contador > 0){
            System.out.println("A letra 'a' aparece " + contador + " vez(es) na palavra.");
        }else {
            System.out.println("A letra 'a' não foi encontrada na palavra.");
        }

        scanner.close();
    }
    
}
