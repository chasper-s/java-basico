import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();  

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        double saldo = 0;
        boolean saldoValido = false;
        
        while (!saldoValido) {
            try {
                System.out.println("Por favor, digite o saldo da Conta:");
                saldo = scanner.nextDouble();
                saldoValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor de saldo inválido. Por favor, digite um número decimal válido.");
                scanner.next();  
            }
        }

        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                            agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}