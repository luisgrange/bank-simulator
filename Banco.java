import java.util.*;

public class Banco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		java.util.ArrayList<Conta> contaArr = new java.util.ArrayList<Conta>();
		String nome, cpf, nomeGerente, rua, complemento, resposta;
		int quantidade = 0, enderecoNum;
	
		
		System.out.print("Quantas contas deseja criar? ");
		quantidade = scan.nextInt();
		
		for(int i=0; i<quantidade; i++) {
			System.out.print("Insira o nome da "+(i+1)+" conta: ");
			nome = scan.next();
			System.out.print("Insira o CPF da "+(i+1)+" conta: ");
			cpf = scan.next();
			System.out.print("Insira o nome da rua em que o responsavel mora: ");
			rua = scan.next();
			System.out.print("O numero da casa: ");
			enderecoNum = scan.nextInt();
			System.out.print("O complemento: ");
			complemento = scan.next();
			System.out.print("Deseja inserir o nome do Gerente? ");
			resposta = scan.next();
			nomeGerente = (resposta.toUpperCase().equals("SIM") ? nomeGerente = scan.next() : "Sem informacao");
			System.out.println("\n");
			
			Conta contas = new Conta(nome, cpf, nomeGerente, rua, complemento, enderecoNum);
			contaArr.add(contas);
		}
		
		
		printFunc(contaArr);
		operacoes(contaArr);
		scan.close();

	}
	static void printFunc(java.util.ArrayList<Conta> contaArr) {
		for(int i=0; i<contaArr.size(); i++) {
			contaArr.get(i).exibirDados();
		}
	}
	
	static void operacoes(java.util.ArrayList<Conta> contaArr) {
		Scanner scan = new Scanner(System.in);
		double valor = 0;
		int conta = 0;
		System.out.print("\nEm qual conta deseja realizar a operacao? ");
		int posiConta = scan.nextInt();
		posiConta = posiConta - 1;
		
		System.out.println("\nQual operacao deseja realizar? ");
		System.out.println("Depositar\tSacar \nTransferir\tExibir\nLimite\tSair");
		String resposta = scan.next();
		
		while(resposta.toUpperCase() != "SAIR") {
			
			if(resposta.toUpperCase().equals("DEPOSITAR")) {
				System.out.print("Digite o valor do deposito: ");
				valor = scan.nextDouble();
				contaArr.get(posiConta).deposito(valor);
				
				System.out.print("\nEm qual conta deseja realizar a operacao? ");
				posiConta = scan.nextInt();
				posiConta = posiConta - 1;
				System.out.println("Qual operacao deseja realizar a seguir? ");
				System.out.println("Depositar\tSacar \nTransferir\tExibir");
				resposta = scan.next();
			}
			if(resposta.toUpperCase().equals("SACAR")) {
				System.out.print("Digite o valor do saque: ");
				valor = scan.nextDouble();
				contaArr.get(posiConta).sacar(valor);
				
				System.out.print("\nEm qual conta deseja realizar a operacao? ");
				posiConta = scan.nextInt();
				posiConta = posiConta - 1;
				System.out.println("Qual operacao deseja realizar a seguir? ");
				System.out.println("Depositar\tSacar \nTransferir\tExibir");
				resposta = scan.next();
			}
			if(resposta.toUpperCase().equals("TRANSFERIR")) {
				System.out.print("Digite o valor da transferencia: ");
				valor = scan.nextDouble();
				System.out.println("Insira o numero da conta: ");
				conta = scan.nextInt();
				conta = conta - 1;
				contaArr.get(posiConta).transferir(contaArr.get(conta), valor);
				
				System.out.print("\nEm qual conta deseja realizar a operacao? ");
				posiConta = scan.nextInt();
				posiConta = posiConta - 1;
				System.out.println("Qual operacao deseja realizar a seguir? ");
				System.out.println("Depositar\tSacar \nTransferir\tExibir");
				resposta = scan.next();
			}
			if(resposta.toUpperCase().equals("LIMITE")) {
				System.out.print("Digite o novo valor do limite: ");
				valor = scan.nextDouble();
				contaArr.get(posiConta).setLimite(valor);
				
				System.out.print("\nEm qual conta deseja realizar a operacao? ");
				posiConta = scan.nextInt();
				posiConta = posiConta - 1;
				System.out.println("Qual operacao deseja realizar a seguir? ");
				System.out.println("Depositar\tSacar \nTransferir\tExibir");
				resposta = scan.next();
			}
			if(resposta.toUpperCase().equals("EXIBIR")) {
				printFunc(contaArr);
				
				System.out.print("\nEm qual conta deseja realizar a operacao? ");
				posiConta = scan.nextInt();
				posiConta = posiConta - 1;
				System.out.println("Qual operacao deseja realizar a seguir? ");
				System.out.println("Depositar\tSacar \nTransferir\tExibir");
				resposta = scan.next();
			}
		}
		
	
		scan.close();
	}
}
