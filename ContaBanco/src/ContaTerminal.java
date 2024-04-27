import java.util.Scanner;

public class  ContaTerminal {

    static int num = 1021;
    static String agencia = "067";
    static String digt = "8";
    static String nome = "MARIO ANDRADE";
    static double saldo = 237.48;

        public static void main(String[] args) throws Exception {
    
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor, digite o número da Agência: ");
            String agn = scanner.next();
            System.out.println("Por favor, digite o número da Conta: ");
            int cnt = scanner.nextInt();

            
            if ( agn.equals(agencia) && cnt == num){
                System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "-" + digt + " Conta " + num + ", com saldo de R$" + saldo + " disponível para saque.");
                        } else {
                            System.out.println("Não há cliente registrado.");
                        };
            scanner.close();
        }
    
}
