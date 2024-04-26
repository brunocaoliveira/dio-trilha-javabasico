import java.util.Scanner;
public class ContaTerminal {

	public static void main(String[] args) {
		
		String Nome_Cliente;
		String Agencia;
		int Numero = 1021;
		double Saldo= 237.48;
Scanner ler = new Scanner(System.in);
System.out.println("Digite seu nome");
Nome_Cliente = ler.nextLine();

System.out.println("Por favor, digite o número da Agência");

Agencia = ler.nextLine();

System.out.println("Olá "+ Nome_Cliente + "! Obrigado por criar uma conta em nosso banco, "
		+ "sua agência é  " + Agencia+ ", conta "+ Numero + "  e seu saldo  "+ Saldo+" já está disponível para saque.");


	}

}
