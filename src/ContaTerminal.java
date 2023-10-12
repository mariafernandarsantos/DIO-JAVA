import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat dFormat = new DecimalFormat("#.00");

        System.out.println("Ola! Bem vindo ao banco Saco Sem Fundo! Para iniciar a criação de sua conta, primeiramente insira seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Em seguida, digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Ótimo! Agora por favor, insira o número desejado para sua conta bancária: ");
        int numero = scanner.nextInt();
        
        System.out.println("Para finalizar, por favor insira o valor do saldo disponível em sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Processo finalizado, você será redirecionado para o menu principal!");
        System.out.println("Olá " + nome + "," + " obrigada por criar uma conta no Saco Sem fundo! Sua agência é " 
        + agencia + "," + " sua conta é " + numero + " e seu saldo de R$" + dFormat.format(saldo) + " já está dispoível para saque.");
    }
}
