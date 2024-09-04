import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        boolean pertence = verificaFibonacci(numero);
    
        if(pertence){
            System.out.println( "O número: "+ numero + " pertence à sequência de Fibonacci.");
    
        }else {
            System.out.println("O número:  "+ numero+ " não pertence à sequência de Fibonacci."
            );
        }
        
        scanner.close();
    }

    public static boolean verificaFibonacci(int n){
        int a = 0;
        int b = 1;

        if(n == 0 || n == 1){
            return true;
        }

        int proximoNumero = a + b;
        while (proximoNumero <= n){
            if(proximoNumero == n){
                return true;
            }

            a = b;
            b = proximoNumero;
            proximoNumero = a + b;
        }
        return false;
    }
}
   
