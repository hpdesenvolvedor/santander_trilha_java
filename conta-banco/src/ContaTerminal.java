import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int conta;
        String agencia;
        String nome;
        Double saldo = 237.48;

        Scanner sc = new Scanner(System.in);                     

        System.out.println("Por favor, digite o número da Conta !");
        int numConta = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String numAgencia = sc.next();
        System.out.println("Por favor, digite seu Nome: ");
        String nomeCliente = sc.next();
        
                
        System.out.println("Olá " +nomeCliente+ " , obrigado por criar uma conta em nosso banco, sua agência é: " +numAgencia+ " , conta: "+ numConta + " , e seu saldo: " + saldo+ " já está disponível para saque!");
        
    }
}
