
public class Funcionario {
	private String CPF;
	private String nome;
	private String cargo;
	private double salario;
	private int matricula;
	Endereco endereco = new Endereco();
	
	//Contrutores:
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.CPF = cpf;
	}
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.CPF = cpf;
		this.salario = salario;
	}
	//Set e Get para nome
	public void setNome(String nome) {this.nome = nome;}
	public String getNome() {return this.nome;}
	
	//Set e Get para CPF
	public void setCPF(String CPF) {this.CPF = CPF;}
	public String getCPF() {return this.CPF;}
	
	//Set e Get para cargo
	public void setCargo(String cargo) {this.cargo = cargo;}
	public String getCargo() {return this.cargo;}
	
	//Set e Get para matricula
	public void setMatricula(int matricula) {this.matricula = matricula;}
	public int getMatricula() {return this.matricula;}
	
	//set e get para endereço
	public void setEnderecoRua(String rua) {this.endereco.setRua(rua);}
	public String getEnderecoRua() {return this.endereco.getRua();}
		
	public void setEnderecoNum(int numero) {this.endereco.setNumeroRe(numero);}
	public int getEnderecoNum() {return this.endereco.getNumeroRe();}
		
	public void setEnderecoComple(String complemento) {this.endereco.setComplemento(complemento);}
	public String getEnderecoComple() {return this.endereco.getComplemento();}
	
	//Get para salario
	public double getSalario() {return this.salario;}

	//Retornando o calculo dos salarios
	public double calcSalario(int meses){
		return this.salario*meses;
	}
	
	public double calSalarioBonus(int meses, double bonus) {
		return this.salario * meses + bonus;
	}
}
