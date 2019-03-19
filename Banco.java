import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {
		int i = 1;
		int parada = 0;
		
		Scanner read = new Scanner(System.in);
		
		while(parada == 0) {
	
			Conta [] arrayConta = new Conta[i];
			System.out.println("-------Menu-------");
			System.out.println("1-Criação de conta");
			System.out.println("2-Exclusão de conta");
			System.out.println("3-Saque na conta");
			System.out.println("4-Depósito na conta");
			System.out.println("5-Emissão de Saldo e Extrato");
			System.out.println("6-Transferência entre contas");
			System.out.println("7-Shutdown");
			int menu = read.nextInt();
		
			switch(menu) {
				case 1:
					System.out.println("Qual o limite de saque das contas?");
					int limiteSaque = read.nextInt();
					
					System.out.println("Deseja Criar uma Conta Poupanca ou Corrente?");
					String escolha = read.next();
					if(escolha == "Poupanca") {
						System.out.println("");
					}
					else {
						
					}
					i++;
					break;
				case 2:
					System.out.println("Qual o numero da conta que deseja excluir?");
					int nConta = read.nextInt();
					nConta--;
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
					parada = 1;
					break;
			}
			
		}
		
	}

}
