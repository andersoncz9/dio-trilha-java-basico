import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        String nome;
        String agencia;
        int numero_agencia;
        double saldo;
        //TODO:Conhecer e importar a classe Scanner
        Scanner input = new Scanner(System.in);
        //Exibir as mensagens para o usuário
        System.out.print("Digite o seu nome: ");
        //Obter pela scanner os valres digitads no terminal
        nome = input.nextLine();
        System.out.print("Por favor, digite sua agência: ");
        agencia = input.nextLine();
        System.out.print("Agora digite o numero da sua conta: ");
        numero_agencia = input.nextInt();
        System.out.print("Qual o saldo da sua conta? ");
        saldo = input.nextDouble();
        //Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero_agencia, saldo);
    }

}
