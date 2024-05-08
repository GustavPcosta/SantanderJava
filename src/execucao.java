import java.util.Scanner;

public class execucao {
	public static void main(String[]args) throws Exception{
		Scanner entrada = new Scanner(System.in);
		
		dados dados1 = new dados();
		
		System.out.println("Digite o nome do cliente");
		String nomeCliente = entrada.next();
		dados1.setNomeCliente(nomeCliente);
		System.out.println("Nome do cliente: " + dados1.getNomeCliente());
		
		
		System.out.println("Digite a agência");
		String agencia = entrada.next();
		dados1.setAgencia(agencia);
		System.out.println("Digite o número da agência " + dados1.getAgencia());
		
		
		System.out.println("Digite o número da conta");
		int numeroConta = entrada.nextInt();
		dados1.setNumeroConta(numeroConta);
		System.out.println("Digite o número da agência " + dados1.getNumeroConta());
		
		
		
		double saldoFInal;
		
		System.out.println("Digite o saldo anterior");
		double saldo = entrada.nextDouble();
		System.out.println("Digite o saldo retirado");
		double saldoAtual = entrada.nextDouble();
		
		saldoFInal =  saldo - saldoAtual;
		System.out.println(saldoFInal);
		dados1.setSaldo(saldo);
		
		
		
		
	}
}
