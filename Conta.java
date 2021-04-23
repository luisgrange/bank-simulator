
public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private int tipo;
	private int agencia;
	private Cliente cliente = new Cliente();
	private Gerente gerente = new Gerente();
	
	public Conta(String nome, String CPF, String gerente) {
		cliente.setNome(nome);
		cliente.setCPF(CPF);
		this.gerente.setNome(gerente);
		this.limite = 1000;
	}
	
	public Conta(String nome, int tipo, String cpf) {
		this.cliente.setNome(nome);
		this.tipo = tipo;
		this.cliente.setCPF(cpf);
		this.limite = 1000;
	}
	
	//3º construtor
	public Conta(String nome, String CPF, String gerente, String rua, String complemento, int numero) {
		this.cliente.setNome(nome);
		this.cliente.setCPF(CPF);
		this.cliente.setEnderecoRua(rua);
		this.cliente.setEnderecoComple(complemento);
		this.cliente.setEnderecoNum(numero);
		this.gerente.setNome(gerente);
		this.limite = 1000;
		
	}
	
//	mostrar dados do cliente
	public void exibirDados() {
		System.out.println("-------------EXIBINDO DADOS-------------");
		System.out.println("Nome:\t"+this.cliente.getNome());
		System.out.println("CPF:\t"+this.cliente.getCPF());
		System.out.printf("Rua:\t%s, %d%s", this.cliente.getEnderecoRua(), this.cliente.getEnderecoNum(), this.cliente.getEnderecoComple());
		System.out.printf("\nSaldo:\t%.2f%n", this.saldo);
		System.out.printf("Limite:\t%.2f%n", this.limite);
		System.out.println("Gerente responsavel: "+this.gerente.getNome());
		System.out.println("\n");
		
		
	}
	
	public double getSaldo() {return this.saldo;}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {return this.numero;}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getAgencia() {return this.agencia;}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getTipo() {return this.tipo;}
	
	public void setLimite(double limite) {this.limite = limite;}
	public double getLimite() {return this.limite;}
	
	// deposito
	public void deposito(double depositar) {
		this.saldo += depositar;
	}
	
	//sacar
	public void sacar(double valor) {
		if(this.saldo + this.limite >= valor) {
			this.saldo -= valor;
		}
	}
	
	//transferir
	public void transferir(Conta conta, double valor) {
		if(this.saldo + this.limite >= valor) {
			this.saldo -= valor;
			conta.deposito(valor);
		}
	}
}
